plugins {
    `kotlin-dsl`
}

group = "se.eelde.android.shorty.conventions"

dependencies {
    compileOnly(libs.com.android.tools.build.gradle)
    compileOnly(libs.org.jetbrains.kotlin.kotlin.gradle.plugin)
}

gradlePlugin {
    plugins {
        register("androidApplication") {
            id = "shorty.application"
            implementationClass = "se.eelde.shorty.conventions.AndroidApplicationConventionPlugin"
        }

        register("androidModule") {
            id = "shorty.module"
            implementationClass = "se.eelde.shorty.conventions.AndroidModuleConventionPlugin"
        }
    }
}