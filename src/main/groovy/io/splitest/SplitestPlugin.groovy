package io.splitest

import org.gradle.api.Project
import org.gradle.api.Plugin

import io.splitest.task.AllTestTask

import io.splitest.task.UnitTestTask
import io.splitest.task.FunctionalTestTask
import io.splitest.task.IntegrationTestTask
import io.splitest.task.SanityTestTask

class SplitestPlugin implements Plugin<Project> {

	public static final String GROUP = 'Splitest'

    void apply(Project project) {
    
    	project.task('allTest', 
    		type: AllTestTask, 
    		group: GROUP,
    		description: "Execute all tests")
    
        project.task('unitTest', 
        	type: UnitTestTask, 
        	group: GROUP,
        	description: "Execute unit tests")
        	
        project.task('functionalTest', 
        	type: FunctionalTestTask, 
        	group: GROUP,
        	description: "Execute functional tests")
        	
        project.task('sanityTest', 
        	type: SanityTestTask, 
        	group: GROUP,
        	description: "Execute sanity tests")        	
        	
        project.task('integrationTest', 
        	type: IntegrationTestTask, 
        	group: GROUP,
        	description: "Execute integration tests")
        
    }
}