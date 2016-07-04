package io.splitest.task;

class UnitTestTask extends CommonTestTask {

	public UnitTestTask() {
	    
		useJUnit {
			includeCategories 'io.splitest.category.UnitTest'
		}
	}
}