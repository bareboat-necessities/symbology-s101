import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
	kotlin("jvm") version "1.6.21"
	kotlin("plugin.serialization") version "1.6.21"
}

group = "kotlin.symbology.s101"
version = "0.0.1-SNAPSHOT"
java.sourceCompatibility = JavaVersion.VERSION_11

repositories {
	mavenCentral()
}

dependencies {
	implementation("org.jetbrains.kotlin:kotlin-stdlib")
	implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.3.2")
}

tasks.withType<KotlinCompile> {
	kotlinOptions {
		freeCompilerArgs = listOf("-Xjsr305=strict", "-opt-in=kotlin.RequiresOptIn")
		jvmTarget = "11"
	}
}

tasks.withType<Test> {
	useJUnitPlatform()
}

tasks.register("svg2java") {
	doLast {
		ant.withGroovyBuilder {
			"taskdef"(
				"name" to "svg2java",
				"classname" to "org.pushingpixels.flamingo.api.svg.SvgTranscoderTask",
				"classpath" to "svg2java/flamingo-svg-transcoder-ant-1.2.jar"
			)
			"svg2java"(
				"todir" to "build/icons",
				"verbose" to "true",
				"namingStrategy" to "default",
				"template" to "plain") {
				"fileset"(
					"dir" to "S-101/resources",
					"includes" to "**/*.svg"
				)
			}
		}
	}
}



