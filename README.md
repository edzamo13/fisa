# fisa

Sample Android App Using Keen
=============================

This is a sample Android App that uses the [Keen IO Java/Android SDK](https://github.com/keenlabs/KeenClient-Java)
to capture and upload events to Keen IO.

## Building the Sample App

First, clone the repo:

`git clone https://github.com/edzamo13/fisa.git`



### Android Studio (Recommended)

Android Studio Flamingo | 2022.2.1 Patch 2
Build #AI-222.4459.24.2221.10121639, built on May 12, 2023
Runtime version: 17.0.6+0-17.0.6b802.4-9586694 aarch64
VM: OpenJDK 64-Bit Server VM by JetBrains s.r.o.
macOS 13.4.1
GC: G1 Young Generation, G1 Old Generation
Memory: 2048M
Cores: 10
Metal Rendering is ON
Registry:
    external.system.auto.import.disabled=true
    debugger.watches.in.variables=false
    ide.text.editor.with.preview.show.floating.toolbar=false
    gradle.version.catalogs.dynamic.support=true

Non-Bundled Plugins:
    kfang.agent.lombok-pql-plugins (1.2.2-SNAPSHOT)
    io.github.hyuga0410.lombok-enums-component (1.2)
    com.dguner.lombok-builder-helper (1.5.0)


### Gradle (command line)

* Build the APK: `./gradlew build`

### Dependecies 

 compileOnly 'org.projectlombok:lombok:1.18.28'
    annotationProcessor 'org.projectlombok:lombok:1.18.28'

    testCompileOnly 'org.projectlombok:lombok:1.18.28'
    testAnnotationProcessor 'org.projectlombok:lombok:1.18.28'


  //  implementation 'com.github.barteksc:android-pdf-viewer:2.3.0'

    implementation 'org.apache.commons:commons-io:1.3.2'

    implementation 'com.squareup.picasso:picasso:2.71828'

    ///json

    implementation group: 'com.fasterxml.jackson.core', name: 'jackson-databind', version: '2.11.3'




## Running the Sample App

Connect an Android device to your development machine.

### Android Studio

* Select `Run -> Run 'app'` (or `Debug 'app'`) from the menu bar
* Select the device you wish to run the app on and click 'OK'

### Gradle

* Install the debug APK on your device `./gradlew installDebug`
* Start the APK: `<path to Android SDK>/platform-tools/adb -d shell am start io.keen.client.android.example/io.keen.client.android.example.MyActivity`


