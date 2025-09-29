/*
 * Copyright 2014-2024 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license.
 */

rootProject.name = "build-logic"

pluginManagement {
    repositories {
        mavenCentral {
            setUrl("https://cache-redirector.jetbrains.com/maven-central")
            name = "MavenCentral-JBCache"
        }
        maven("https://cache-redirector.jetbrains.com/plugins.gradle.org/m2") {
            name = "GradlePluginPortal-JBCache"
        }
        maven("https://storage.googleapis.com/gradleup/m2")
    }
    includeBuild("../build-settings-logic")
}

dependencyResolutionManagement {
    @Suppress("UnstableApiUsage")
    repositories {
        mavenCentral {
            setUrl("https://cache-redirector.jetbrains.com/maven-central")
            name = "MavenCentral-JBCache"
        }
        maven("https://cache-redirector.jetbrains.com/plugins.gradle.org/m2") {
            name = "GradlePluginPortal-JBCache"
        }
        maven("https://storage.googleapis.com/gradleup/m2")
    }

    versionCatalogs {
        create("libs") {
            from(files("../gradle/libs.versions.toml"))
        }
    }
}

plugins {
    id("dokkasettings")
}
