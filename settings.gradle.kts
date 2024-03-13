@file:Suppress("UnstableApiUsage")

include(":reveldemo")


pluginManagement {
	repositories {
		google()
		mavenCentral()
		gradlePluginPortal()
		maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
		maven("https://maven.pkg.jetbrains.space/kotlin/p/wasm/experimental")
	}
}

dependencyResolutionManagement {
	repositories {
		google()
		mavenCentral()
		maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
		maven("https://maven.pkg.jetbrains.space/kotlin/p/wasm/experimental")
	}
}

rootProject.name = "reveal"
includeBuild("convention-plugins")
include(
	":reveal-common",
	":reveal-core",
	":reveal-shapes",
	":reveal-compat-android",
	":android-tests",
)
