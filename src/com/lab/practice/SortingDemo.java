package com.lab.practice;

import java.util.*;


record Employee(int id, String name, Double salary) {}

public class SortingDemo 
{

	public static void main(String[] args) 
	{
		List<Employee> employees = new ArrayList<>();
		
		employees.add(new Employee(222, "Manoj", 80653.09));
		employees.add(new Employee(333, "Ravi", 9876.00));
		employees.add(new Employee(111, "Bhagywant", 98653.09));
		employees.add(new Employee(555, "Nilam", 5863.00));
		employees.add(new Employee(444, "Priti", 48653.03));
		
		Collections.sort(employees, (e1,e2) -> e1.salary().compareTo(e2.salary()));
		employees.forEach(System.out::println);

	}

}
