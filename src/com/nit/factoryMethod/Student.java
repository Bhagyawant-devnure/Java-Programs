/*Question : 1
---------------
Create a Student class with the following attributes:

name (String): The name of the student.
age (int): The age of the student.
grade (String): The grade of the student.

In addition to these attributes, implement the following:

Static Method: Create a static method called createStudent() in the Student class. This method should:

Prompt the user to enter values for name, age, and grade.
Initialize a new Student object with the provided values.
Return the created Student object.

Implement a toString() to the Student class, which prints the student's details in the format: "Name: <name>, Age: <age>, Grade: <grade>".

Create a ELC class TestStudent
Main Method: In the main method, write code to:

Ask the user for the number of Student objects they want to create.
Use a loop to call the createStudent() method the specified number of times, storing each Student object in an array.
After creating all Student objects, use a loop to display the details of each student using the displayStudent() method.

*/





package com.nit.factoryMethod;

import java.util.Scanner;

public class Student {
	
	String StudentName;
	int StudentAge;
	String grade;
	public Student(String studentName, int studentAge, String grade) {
		super();
		StudentName = studentName;
		StudentAge = studentAge;
		this.grade = grade;
	}
	@Override
	public String toString() {
		return "Student [StudentName=" + StudentName + ", StudentAge=" + StudentAge + ", grade=" + grade + "]";
	}
	
	public static Student getStudentobj() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter student name");
		String StudentName = sc.nextLine();
		
		
		System.out.println("Enter student age");
		int StudentAge = sc.nextInt();
		sc.nextLine();
		
		System.out.println("enter grade");
		String grade=sc.nextLine();

		
		return new Student(StudentName,StudentAge,grade);
		
	}

}
