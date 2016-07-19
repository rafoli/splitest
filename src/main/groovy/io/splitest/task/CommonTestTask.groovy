package io.splitest.task;

import org.gradle.api.tasks.testing.Test;

class CommonTestTask extends Test {

	public CommonTestTask() {
     	
		testLogging {
	        events "passed", "skipped", "failed"
	        showExceptions true
	        exceptionFormat "full"
	        showCauses false
	        showStackTraces false
	        
	
	        afterSuite { desc, result ->
	            if (!desc.parent) {            
	                def output = "Results: ${result.resultType} (${result.testCount} tests, ${result.successfulTestCount} successes, ${result.failedTestCount} failures, ${result.skippedTestCount} skipped)"
	                def startItem = '|  ', endItem = '  |'
	                def repeatLength = startItem.length() + output.length() + endItem.length()
	                println('\n' + ('-' * repeatLength) + '\n' + startItem + output + endItem + '\n' + ('-' * repeatLength))
	            }
	        }
    	}
	}
}