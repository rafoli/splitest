package io.splitest.test

import org.junit.Test
import org.gradle.testfixtures.ProjectBuilder
import org.gradle.api.Project
import static org.junit.Assert.*

import io.splitest.task.UnitTestTask;
import io.splitest.task.IntegrationTestTask;
import io.splitest.task.FunctionalTestTask;

class SplitestTaskTest {
    @Test
    public void canAddTaskToProject() {
        Project project = ProjectBuilder.builder().build()

        def unitTestTask = project.task('unitTest', type: UnitTestTask)
        assertTrue(unitTestTask instanceof UnitTestTask)

        def integrationTestTask = project.task('integrationTestTask', type: IntegrationTestTask)
        assertTrue(integrationTestTask instanceof IntegrationTestTask)

        def functionalTestTask = project.task('functionalTestTask', type: FunctionalTestTask)
        assertTrue(functionalTestTask instanceof FunctionalTestTask)
    }
}
