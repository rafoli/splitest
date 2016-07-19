package io.splitest.task;

class SanityTestTask extends CommonTestTask {

	public SanityTestTask() {
		useJUnit {
			includeCategories 'io.splitest.category.SanityTestTask'
		}
	}
}