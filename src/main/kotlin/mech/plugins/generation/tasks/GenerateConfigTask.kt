package mech.plugins.generation.tasks

import org.gradle.api.DefaultTask

open class GenerateConfigTask : DefaultTask() {
    fun buildConfigField(type: String, name: String, value: String) {
    }
}