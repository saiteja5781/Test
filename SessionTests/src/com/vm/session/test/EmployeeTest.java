package com.vm.session.test;

public class EmployeeTest {
	
	// instance variables
	private static String firstName;
	private static String lastName;
	
	
	public EmployeeTest(String fn, String ln) {
		super();
		firstName = fn;
		lastName =ln ;
	}
	
	// check the first name and last name
	 public static EmployeeTest checkName() {
         if (firstName == null && lastName == null)
        	 throw new IllegalArgumentException("Entry Missing");
		return null;
    }
	
	 // check the length of first name and last name
	 private static EmployeeTest checkLength() {
			if (firstName.length() <3 && lastName.length() <3)
	       	 throw new IllegalArgumentException("name should be minimum 3 character");
			return null;
		
		}
	
	public static void main(String[] args) {
		
		EmployeeTest epmtest= new EmployeeTest("",""); // passing parameters 
		
		EmployeeTest s = EmployeeTest.checkName();
		System.out.println(s);
		
		EmployeeTest s1 = EmployeeTest.checkLength();
		System.out.println(s1);
	}

	
}
