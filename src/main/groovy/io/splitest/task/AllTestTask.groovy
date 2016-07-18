package io.splitest.task;

import org.gradle.api.tasks.TaskAction;

class AllTestTask extends CommonTestTask {

    @TaskAction
    def initialize() {
        def project = this.getProject();
        project.tasks.unitTest.execute();
        project.tasks.integrationTest.execute();
        project.tasks.functionalTest.execute();
    }
}