/*Question : 2
---------------
Create an Employee class with the following attributes:

id (int): The unique identifier for each employee.
name (String): The name of the employee.
salary (double): The base salary of the employee.
department (String): The department to which the employee belongs.
In addition to these attributes, implement the following:

Static Method for Employee Creation: Add a static method named createEmployee() in the Employee class. This method should:

Prompt the user to enter values for id, name, salary, and department.
Initialize a new Employee object with the provided values.
Return the created Employee object.
Business Logic Method: Add a method calculateAnnualSalary() that:

Calculates and returns the annual salary of the employee based on their salary (monthly salary).
Adds a bonus based on the department:
Sales: 10% bonus of annual salary.
Engineering: 15% bonus of annual salary.
HR: 8% bonus of annual salary.
Other: 5% bonus of annual salary.
Implement toString method  to return the employee's details in this format: "ID: <id>, Name: <name>, Department: <department>, Monthly Salary: <salary>, Annual Salary (with Bonus): <calculated_annual_salary>".

Create a ELC class TestEmployee:
Main Method:

Ask the user how many Employee objects they want to create.
Use a loop to call createEmployee() to create the specified number of employees, storing each in an array.
After all employees are created, use another loop to display each employee's details, including the calculated annual salary with bonus.
*/


package com.nit.factoryMethod;

import java.util.Scanner;

public class Employee {
	
	int id;
	String name;
	String department;
	double salary;
	double bonus;
	double annualsalary;
	
	public Employee(int id, String name, String department, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
		this.salary = salary;
	}

	
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", department=" + department + ", salary=" + salary
				+ ", bonus=" + bonus + ", annualsalary=" + annualsalary + "]";
	}



	public static Employee creatEmployee() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter id:");
		int id = sc.nextInt();
		
		System.out.println("Enter employee name: ");
		String name = sc.nextLine();
		 name = sc.nextLine();
		 
		 System.out.println("enter employee department");
			String department = sc.nextLine();
			
		 
		System.out.println("Enter employee salary");
		double salary = sc.nextDouble();
		
		
		return new Employee(id,name,department,salary);
}
	
	public double calculateAnnualSalary() {
		
		annualsalary=this.salary*12;
		if(department.equalsIgnoreCase("sales")) {
			bonus=( annualsalary*10)/100;
		}
		else if(department.equalsIgnoreCase("Engineering")) {
			bonus=(annualsalary*15)/100;
		}
		else if(department.equalsIgnoreCase("HR")) {
			bonus=(annualsalary*8)/100;
			
		}
		else{
			bonus=(annualsalary*5)/100;
		}
		return annualsalary+bonus;
	}

	
	
	
	

}
