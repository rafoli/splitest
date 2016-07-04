package io.splitest

import org.gradle.api.Project
import org.gradle.api.Plugin

class SplitestPlugin implements Plugin<Project> {
    void apply(Project project) {
    
        project.task('unitTest', type: UnitTest)
        project.task('functionalTest', type: FunctionalTest)
        project.task('integrationTest', type: IntegrationTest)
        
    }
}