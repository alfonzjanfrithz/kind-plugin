package com.github.alfonzjanfrithz.kindplugin.services

import com.intellij.openapi.project.Project
import com.github.alfonzjanfrithz.kindplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
