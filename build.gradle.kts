plugins {
    id(BuildPlugin.ideaExt) version BuildPlugin.ideaExtVersion
    id(BuildPlugin.versions) version BuildPlugin.versionsVersion
}

buildscript {
    repositories {
        mavenLocal()
        google()
        mavenCentral()
    }
    dependencies {
        classpath(BuildPlugin.gradle)
        classpath(BuildPlugin.kotlinGradle)
        classpath(BuildPlugin.gradleVersionsPlugin)
    }
}

allprojects {
    repositories {
        mavenLocal()
        google()
        mavenCentral()
        maven { url = uri("https://dl.bintray.com/toktok/maven") }
        jcenter {
            content {
                includeModule("org.jetbrains.trove4j", "trove4j")
            }
        }
    }
}

tasks.register("clean").configure {
    delete("build")
}
