package io.splitest.task;

class IntegrationTestTask extends CommonTestTask {

	public FunctionalTestTask() {
		useJUnit {
			includeCategories 'io.splitest.category.IntegrationTest'
		}
	}
}