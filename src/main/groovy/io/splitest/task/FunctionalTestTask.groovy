package io.splitest.task;

class FunctionalTestTask extends CommonTestTask {

	public FunctionalTestTask() {
		useJUnit {
			includeCategories 'io.splitest.category.FunctionalTest'
		}
	}
}