package com.logic

import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction

abstract class AwesomeTask : DefaultTask() {

    @TaskAction
    fun doSomeWork(){
        println(1)
        println(1)  // iter 1 at 2025-09-09T18:48:18Z
        println(2)  // iter 2 at 2025-09-09T18:51:51Z
        println(3)  // iter 3 at 2025-09-09T18:54:58Z
        // add content here
    }

}
