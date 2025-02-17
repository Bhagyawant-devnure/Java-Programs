package com.nit.Assignment_19;

import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class EmployeeBonusCalculator {

	public static void main(String[] args) {
		BiPredicate<Employee,Integer> isEligibleForBonus = (employee,Interger)->
		employee.getPerformanceRating()>4&& employee.getTenure()
>=Interger;

BiFunction<Employee, Boolean, Double> calculateBonus = (employee, isEligible) ->
isEligible ? employee.getSalary() * 0.10 : 0.0;

// Create employee objects
Employee emp1 = new Employee("Alice", 60000, 5, 4.5);
Employee emp2 = new Employee("Bob", 50000, 2, 4.2);
Employee emp3 = new Employee("Charlie", 70000, 4, 3.8);
Employee emp4 = new Employee("Diana", 80000, 3, 4.7);
Employee emp5 = new Employee("Eve", 45000, 1, 4.9);

// Process each employee
processEmployee(emp1, isEligibleForBonus, calculateBonus);
processEmployee(emp2, isEligibleForBonus, calculateBonus);
processEmployee(emp3, isEligibleForBonus, calculateBonus);
processEmployee(emp4, isEligibleForBonus, calculateBonus);
processEmployee(emp5, isEligibleForBonus, calculateBonus);
}

// Method to process and print employee details
private static void processEmployee(Employee employee, BiPredicate<Employee, Integer> isEligibleForBonus,
                        BiFunction<Employee, Boolean, Double> calculateBonus) {
boolean eligible = isEligibleForBonus.test(employee, 3); // Check eligibility
double bonus = calculateBonus.apply(employee, eligible); // Calculate bonus

// Print details
System.out.println("Employee: " + employee.getName());
System.out.println("Salary: $" + employee.getSalary());
System.out.println("Bonus: $" + bonus);
System.out.println("-------------------------");
}
	}


