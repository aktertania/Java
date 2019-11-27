package Lab2.Aggregation;

public class AggregationTest {

	
		public static void main(String[] args) {

	        // Address object
	        Address home = new Address();
	        home.setId(1);
	        home.setLine("road # 111");
	        home.setCity("Dhaka");
	        home.setCountry("Bangladesh");

	        // Employee object
	        Employee employee = new Employee();
	        employee.setEmpId(01);
	        employee.setEmpName("Tania Akter");
	        employee.setAddress(home);
	        employee.setSalary(5000);

	        System.out.println(employee);

	        employee = null;

	        System.out.println(home);
	    }
	}
