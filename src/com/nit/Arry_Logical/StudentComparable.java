package com.nit.Arry_Logical;

import java.util.Arrays;
import java.util.Scanner;

public class StudentComparable {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array ");
		int size = sc.nextInt();
		Student[] sts = new Student[size];

		for (int i = 0; i < size; i++) {
			System.out.println("Enter student id");
			int id = sc.nextInt();
			System.out.println("Enter student name");
			String name = sc.nextLine();
			name = sc.nextLine();
			System.out.println("enter total fees");
			double fess = sc.nextDouble();

			sts[i] = new Student(id, name, fess);
		}
		Arrays.sort(sts);
		System.out.println(Arrays.toString(sts));

		;

	}

}
