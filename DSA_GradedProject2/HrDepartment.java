package com.greatlearning.javafsd.gca.one;

//Hr Department extends SuperDepartment
class HrDepartment extends SuperDepartment {

	// creating method with return type String and no parameters
	public String departmentName() {
		return "Hr Department";
	}

	// a single quotation mark (single quote) character is denoted by \' in java
	public String getTodaysWork() {
		return "Fill today\'s timesheet and mark your attendance";
	}

	public String getWorkDeadline() {
		return "Complete by EOD";
	}

	public String doActivity() {
		return "team Lunch";
	}
}