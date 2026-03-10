# after making and breaking several. Android apps, I am backing this up, before it is throughly broken. 
plcApp
objective:
control a PLC via and andriod app.
<pre>
plcUsbApp/
│
├── settings.gradle.kts
├── build.gradle.kts
├── gradle.properties
│
├── gradle/
│   └── wrapper/
│       ├── gradle-wrapper.jar
│       └── gradle-wrapper.properties
│
├── gradlew
├── gradlew.bat
│
└── app/
    │
    ├── build.gradle.kts
    │
    └── src/
        └── main/
            │
            ├── AndroidManifest.xml
            │
            ├── java/
            │   └── com/
            │       └── example/
            │           └── plcusbapp/
            │               └── MainActivity.kt
            │
            └── res/
                │
                ├── layout/
                │   └── activity_main.xml
                │
                └── values/
                    ├── strings.xml
                    └── themes.xml
</pre>
