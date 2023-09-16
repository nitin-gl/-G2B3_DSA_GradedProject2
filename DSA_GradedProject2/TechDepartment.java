package com.greatlearning.javafsd.gca.one;

//Tech Department extends SuperDepartment
class TechDepartment extends SuperDepartment {

	// creating method with return type String and no parameters
	public String departmentName() {
		return "Tech Department";
	}

	public String getTodaysWork() {
		return "Complete coding of module 1";
	}

	public String getWorkDeadline() {
		return "Complete by EOD";
	}

	public String getTechStackInformation() {
		return "Core Java";
	}
}