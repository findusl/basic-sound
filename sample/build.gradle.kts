plugins {
    kotlin("jvm") version "2.1.21"
    application
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("app.lexilabs.basic:basic-sound:0.2.6-beta01")
}

application {
    mainClass.set("MainKt")
}
