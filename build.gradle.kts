buildscript {
    repositories {
        google()
        mavenCentral()
    }
    dependencies {
        classpath("com.android.tools.build:gradle:8.4.0")  // This is correct.
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:2.0.10")
        classpath("com.google.gms:google-services:4.4.2")
        classpath("androidx.navigation:navigation-safe-args-gradle-plugin:2.7.1")
        // Other classpaths...
    }
}
