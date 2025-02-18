package com.Collection.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

class Employee{
	String name;
	private String position;
	private double salary;
	public Employee(String name, String position, double salary) {
		super();
		this.name = name;
		this.position = position;
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", position=" + position + ", salary=" + salary + "]";
	}
	
	}

class Directory {
	ArrayList<Employee> emp=new ArrayList<>();
	
	
	public void addEmployee(Employee employee) {
		this.emp.add(employee);;
		
	}
	
	public void displayAllEmployees()
	{
		emp.forEach(System.out::println);
	}
	public void updateEmployee( String name,String newPosition)
	{
		/*if(emp.size()<=i)
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter name : ");
			String name=sc.nextLine();
			System.out.println("Enter pso : ");
			String newposition = sc.nextLine();
			Employee employee =emp.get(i);
		employee.setPosition(newposition);
		employee.getName();
		}
		else {
			System.out.println("index doesn't exist...");
		}*/
		 for (Employee e : emp) {
	            if (e.name.equalsIgnoreCase(name)) {
	                e.setPosition(newPosition);
	                System.out.println(name + " updated to " + newPosition);
	                return;
	            }
	        }
	        System.out.println("Employee not found.");
		
	
	}
		
	
	
	public void deleteEmployee(String name) {
		
		emp.remove(name);
		
		
	}
}

public class EmployeeDirectoryExample {

	public static void main(String[] args) {
		
		Directory directory= new Directory();
		Employee emp1=new Employee("raj", "developer", 50000);
		Employee emp2=new Employee("ram", "web developer", 60000);
		Employee emp3=new Employee("sai", "java developer", 150000);
		
		directory.addEmployee(emp1);
        directory.addEmployee(emp2);
        directory.addEmployee(emp3);
        
        System.out.println("\nAll Employees:");
        directory.displayAllEmployees();

        directory.updateEmployee("bhagyawant", "Senior Developer");

        System.out.println("\nAfter Update:");
        directory.displayAllEmployees();

        directory.deleteEmployee("sai");

        System.out.println("\nAfter Deletion:");
        directory.displayAllEmployees();
		
		
		
	}

}
