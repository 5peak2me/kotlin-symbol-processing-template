plugins {
    id("java-library")
    alias(libs.plugins.kotlin.jvm)
}
java {
    sourceCompatibility = JavaVersion.VERSION_11
    targetCompatibility = JavaVersion.VERSION_11
}
kotlin {
    compilerOptions {
        jvmTarget = org.jetbrains.kotlin.gradle.dsl.JvmTarget.JVM_11
        explicitApi()
    }
}
dependencies {
    implementation(libs.ksp.api)
    implementation(libs.kotlinpoet.ksp)
    implementation(project(":runtime"))
}
