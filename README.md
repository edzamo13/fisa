# fisa

Sample Android App Using Keen
=============================

This is a sample Android App that uses the [Keen IO Java/Android SDK](https://github.com/keenlabs/KeenClient-Java)
to capture and upload events to Keen IO.

## Building the Sample App

First, clone the repo:

`git clone https://github.com/edzamo13/fisa.git`



### Android Studio (Recommended)

* Android Studio Flamingo | 2022.2.1 Patch 2
Build #AI-222.4459.24.2221.10121639, built on May 12, 2023
Runtime version: 17.0.6+0-17.0.6b802.4-9586694 aarch64
* VM: OpenJDK 64-Bit Server VM by JetBrains s.r.o. macOS 13.4.1
GC: G1 Young Generation, G1 Old Generation
Memory: 2048M
Cores: 10
Metal Rendering is ON



### Gradle (command line)

* Build the APK: `./gradlew build`
------------------------------------------------------------
Gradle 8.2.1
------------------------------------------------------------

* Build time:   2023-07-10 12:12:35 UTC
* Revision:     a38ec64d3c4612da9083cc506a1ccb212afeecaa

* Kotlin:       1.8.20
* Groovy:       3.0.17
* Ant:          Apache Ant(TM) version 1.10.13 compiled on January 4 2023
* JVM:          20.0.1 (Homebrew 20.0.1)
* OS:           Mac OS X 13.4.1 x86_64

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


