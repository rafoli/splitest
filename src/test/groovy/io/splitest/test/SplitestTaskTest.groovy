package io.splitest.test

import org.junit.Test
import org.gradle.testfixtures.ProjectBuilder
import org.gradle.api.Project
import static org.junit.Assert.*

import io.splitest.task.AllTestTask;

import io.splitest.task.UnitTestTask;
import io.splitest.task.IntegrationTestTask;
import io.splitest.task.FunctionalTestTask;
import io.splitest.task.SanityTestTask;

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
        
        def sanityTestTask = project.task('sanityTestTask', type: SanityTestTask)
        assertTrue(sanityTestTask instanceof SanityTestTask)
        
        def allTestTask = project.task('allTestTask', type: AllTestTask)
        assertTrue(allTestTask instanceof AllTestTask)
    }
}
