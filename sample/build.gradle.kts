plugins {
    kotlin("jvm") version "2.1.21"
    application
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(fileTree("../basic-sound/build/libs") { include("basic-sound-jvm-*.jar") })
}

application {
    mainClass.set("MainKt")
}
