package com.logic

import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction

abstract class AwesomeTask : DefaultTask() {

    @TaskAction
    fun doSomeWork(){
        println(1)
        // add content here
    }

}
