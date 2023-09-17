package com.greatlearning.javafsd.gca.one;

/**
 * As per Great Learning Standard "DriverClass" is the name to be used for the
 * "Main" class. As the problem statement states "Driver class Main will be
 * used" the class is named as "Main"
 **/
public class Main {

	public static void main(String[] args) {

		// using system property to get line feed
		String newline = System.getProperty("line.separator");
		
		System.out.println("Welcome to the coding output of FSD G2B3");
		System.out.println("");

		// Creation of object for Admin Department and display of its functionalities
		AdminDepartment objAdminDept = new AdminDepartment();
		System.out.println("Welcome to " + objAdminDept.departmentName());
		System.out.println(objAdminDept.getTodaysWork());
		System.out.println(objAdminDept.getWorkDeadline());
		System.out.println(objAdminDept.isTodayAHoliday());
		System.out.println("");

		// Creation of object for Hr Department and display of its functionalities
		HrDepartment objHrDept = new HrDepartment();
		System.out.println("Welcome to " + objHrDept.departmentName());
		System.out.println(objHrDept.doActivity());
		System.out.println(objHrDept.getTodaysWork());
		System.out.println(objHrDept.getWorkDeadline());
		System.out.println(objHrDept.isTodayAHoliday());
		System.out.print(newline);

		// Creation of object for Tech Department and display of its functionalities
		TechDepartment objTechDept = new TechDepartment();
		System.out.println("Welcome to " + objTechDept.departmentName());
		System.out.println(objTechDept.getTodaysWork());
		System.out.println(objTechDept.getWorkDeadline());
		System.out.println(objTechDept.getTechStackInformation());
		System.out.println(objTechDept.isTodayAHoliday());
		System.out.print(newline);
	}

}
