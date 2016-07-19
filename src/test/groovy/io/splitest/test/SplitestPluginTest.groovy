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

class SplitestPluginTest {
    @Test
    public void splitestPluginAddsUnitTaskToProject() {
        Project project = ProjectBuilder.builder().build()
        project.pluginManager.apply 'io.splitest'

        assertTrue(project.tasks.unitTest instanceof UnitTestTask)
    }

    @Test
    public void splitestPluginAddsIntegrationTaskToProject() {
        Project project = ProjectBuilder.builder().build()
        project.pluginManager.apply 'io.splitest'

        assertTrue(project.tasks.integrationTest instanceof IntegrationTestTask)
    }

    @Test
    public void splitestPluginAddsFunctionalTaskToProject() {
        Project project = ProjectBuilder.builder().build()
        project.pluginManager.apply 'io.splitest'

        assertTrue(project.tasks.functionalTest instanceof FunctionalTestTask)
    }
    
    @Test
    public void splitestPluginAddsSanityTaskToProject() {
        Project project = ProjectBuilder.builder().build()
        project.pluginManager.apply 'io.splitest'

        assertTrue(project.tasks.sanityTest instanceof SanityTestTask)
    }
    
    @Test
    public void splitestPluginAddsAllTaskToProject() {
        Project project = ProjectBuilder.builder().build()
        project.pluginManager.apply 'io.splitest'

        assertTrue(project.tasks.allTest instanceof AllTestTask)
    }
}
