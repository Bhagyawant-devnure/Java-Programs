package com.nit.Copy_constructor;

import java.util.Scanner;

public class StudentGradeCalculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Student name");
		String name = sc.nextLine();
		System.out.println("Enter student marks: ");
		int marks = sc.nextInt();
		
		Student s1 = new Student(name,marks);
		StudentGrade obtainGrade =  CalculateStudentGrade.getcalculateGrade(s1);
		System.out.println(obtainGrade);
		sc.close();
	}

}
