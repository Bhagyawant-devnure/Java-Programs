/*ue 2 :
=========
Tast : Employee Payroll Management System
Imagine you are developing a system to manage payroll for employees in a company. 
The system calculates salaries for different types of employees based on their roles. 
For example, full-time employees receive a fixed salary, while part-time employees are paid based on the hours they work. 
Additionally, the system should provide details about each employee.

Requirements
1. Abstract Class Employee
Purpose: Defines the common attributes and behavior for all employees.
Modifiers: abstract, public.
Attributes:
employeeId (Type: int, Modifier: private) - Unique ID for the employee.
name (Type: String, Modifier: private) - Name of the employee.
Constructor:
A protected constructor with parameters employeeId and name.
Methods:
Setters and Getters: Protected methods for all attributes.
showDetails(): A protected method that prints the employee ID and name.
abstract calculateSalary(): An abstract method to calculate the employee's salary.

2. Concrete Subclasses
2.1 FullTimeEmployee Class
Inherits from Employee.
Additional Attribute:
monthlySalary (Type: double, Modifier: private) - Fixed monthly salary for the employee.
Constructor:
A public constructor with parameters employeeId, name, and monthlySalary.
Methods:
Overrides calculateSalary():
Returns the monthlySalary.
Overrides showDetails():
Prints details including the monthly salary.

2.2 PartTimeEmployee Class
Inherits from Employee.
Additional Attributes:
hourlyRate (Type: double, Modifier: private) - Hourly rate for the employee.
hoursWorked (Type: int, Modifier: private) - Number of hours worked by the employee.
Constructor:
A public constructor with parameters employeeId, name, hourlyRate, and hoursWorked.
Methods:
Overrides calculateSalary():
Calculates the salary as hourlyRate * hoursWorked.
Overrides showDetails():
Prints details including the hourly rate and hours worked.

3. PayrollSystem Class
Purpose: Test the functionality of the payroll system.
Flow:
Create instances of FullTimeEmployee and PartTimeEmployee.
Display the details of each employee using the showDetails() method.
Calculate and display the salary for each employee using calculateSalary().



Sample Output :
-----------------

Full-Time Employee Details:
Employee ID: 101, Name: Alice
Monthly Salary: Rs.50000.00
Calculated Salary: Rs.50000.00



Part-Time Employee Details:
Employee ID: 102, Name: Bob
Hourly Rate: Rs.200.00, Hours Worked: 25
Calculated Salary: Rs.5000.00

*/


package com.nit.reexam27abstract;

public abstract class Employee {
	private int employeeId;
	private String name;
	public Employee(int employeeId, String name) {
		super();
		this.setEmployeeId(employeeId);
		this.setName(name);
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void showDetails() {
		System.out.println("enter your id: "+employeeId);
		System.out.println("enter name:"+name);
		
	}
	public abstract double calculateSalary();
		
	

}
