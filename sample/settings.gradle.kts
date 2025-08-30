rootProject.name = "basic-sound-sample"

pluginManagement {
    repositories {
        gradlePluginPortal()
        mavenCentral()
    }
}

includeBuild("..") {
    dependencySubstitution {
        substitute(module("app.lexilabs.basic:basic-sound")).using(project(":basic-sound"))
    }
}
