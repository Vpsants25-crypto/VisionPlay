plugins {
 id("com.android.application")
 id("org.jetbrains.kotlin.android")
 id("org.jetbrains.kotlin.plugin.compose")
}
android {
 namespace = "com.visionplay.app"
 compileSdk = 35
 defaultConfig { applicationId = "com.visionplay.app"; minSdk = 26; targetSdk = 35; versionCode = 1; versionName = "1.0" }
 buildFeatures { compose = true }
 compileOptions { sourceCompatibility = JavaVersion.VERSION_17; targetCompatibility = JavaVersion.VERSION_17 }
 kotlinOptions { jvmTarget = "17" }
}
dependencies {
 implementation(platform("androidx.compose:compose-bom:2025.05.01"))
 implementation("androidx.activity:activity-compose:1.10.1")
 implementation("androidx.compose.ui:ui")
 implementation("androidx.compose.ui:ui-tooling-preview")
 implementation("androidx.compose.material3:material3")
 implementation("androidx.compose.foundation:foundation")
 implementation("androidx.media3:media3-exoplayer:1.6.1")
 implementation("androidx.media3:media3-ui:1.6.1")
 implementation("androidx.media3:media3-session:1.6.1")
 implementation("com.google.guava:guava:33.3.1-android")
 debugImplementation("androidx.compose.ui:ui-tooling")
}
