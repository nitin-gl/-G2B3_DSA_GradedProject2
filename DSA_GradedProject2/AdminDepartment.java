package com.greatlearning.javafsd.gca.one;

//Admin Department extends SuperDepartment
class AdminDepartment extends SuperDepartment {

	// creating method with return type String and no parameters
	public String departmentName() {
		return "Admin Department";
	}

	public String getWorkDeadline() {
		return "Complete by EOD";
	}

	public String getTodaysWork() {
		return "Complete your documents Submission";
	}

}