/*Que - 2
------------
Employee Bonus Calculation Program
Objective
Develop a Java program to calculate the annual bonus for employees based on their performance and tenure.
 The bonus calculation will use BiPredicate and BiFunction to determine eligibility and compute the bonus amount. 
 The program should be easy to understand and follow, with clear instructions for each step.

Requirements :
Define the Employee Class: The Employee class should have the following attributes and methods:

Employee Class(BLC):
--------------------------
attributes :
name: String : private,
salary : double : private
tenure (in years) : int : private, and 
performanceRating(on a scale of 1 to 5) : double : private

methods : 
parameterized constructor to initialise all attributes.
Getters for each attribute.


class EmployeeBonusCalculator(ELC)
-------------------------------------------
Define a main class named EmployeeBonusCalculator(ELC)
In main method : 

Define the BiPredicate:
The BiPredicate<Employee, Integer> will check if an employee's performance rating is above a given threshold(4)
 and if their tenure is at least 3 years then return true or else false.

Define the BiFunction:
The BiFunction<Employee, Boolean, Double> will calculate the bonus amount.
 If the employee is eligible based on BiPredicate return value, 
 they will receive a 10% bonus on their salary. If not, the bonus will be 0.


Create 5 employee objects with different values for name, salary, tenure, and performance rating.
Use the BiPredicate to determine if each employee is eligible for a bonus.
Use the BiFunction to calculate the bonus for each employee.
Print the employee's name, salary, and bonus amount.

Implement Test Cases:

Define and run test cases to ensure the logic is working correctly*/

package com.nit.Assignment_19;

public class Employee {
	
	private String name;
	private double salary;
	private int  tenure;
	private double performanceRating;
	
	public Employee(String name, double salary, int tenure, double performanceRating) {
		super();
		this.name = name;
		this.salary = salary;
		this.tenure = tenure;
		this.performanceRating = performanceRating;
	}
	public String getName() {
		return name;
	}
	public double getSalary() {
		return salary;
	}
	public int getTenure() {
		return tenure;
	}
	public double getPerformanceRating() {
		return performanceRating;
	}
	

}
