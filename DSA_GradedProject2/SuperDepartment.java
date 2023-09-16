package com.greatlearning.javafsd.gca.one;

//Super Class SuperDepartment
class SuperDepartment {

	/**
	 * There are two methods to return a String in Java: the System.out.println()
	 * method or the “return” statement. The "return" statement is used.
	 **/

	// creating method with return type String and no parameters
	public String departmentName() {
		return "Super Department";
	}

	public String getTodaysWork() {
		return "No Work as of now";
	}

	public String getWorkDeadline() {
		return "Nil";
	}

	public String isTodayAHoliday() {
		return "Today is not a holiday";
	}

}
