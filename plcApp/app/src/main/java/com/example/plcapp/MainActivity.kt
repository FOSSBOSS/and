package com.example.plcapp

import android.hardware.usb.UsbManager
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.hoho.android.usbserial.driver.UsbSerialPort
import com.hoho.android.usbserial.driver.UsbSerialProber

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val manager = getSystemService(USB_SERVICE) as UsbManager

        val availableDrivers =
            UsbSerialProber.getDefaultProber().findAllDrivers(manager)

        if (availableDrivers.isEmpty()) {
            println("No USB serial device found")
            return
        }

        val driver = availableDrivers[0]
        val connection = manager.openDevice(driver.device)

        if (connection == null) {
            // add UsbManager.requestPermission(driver.device, ..) if needed
            return
        }

        val port = driver.ports[0]
        port.open(connection)
        port.setParameters(
            115200,
            8,
            UsbSerialPort.STOPBITS_1,
            UsbSerialPort.PARITY_NONE
        )
    }
}
