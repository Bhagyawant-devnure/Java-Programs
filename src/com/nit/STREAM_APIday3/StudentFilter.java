package com.nit.STREAM_APIday3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

record Student(String name,String course) {
	
}
public class StudentFilter {

	public static void main(String[] args) {
		List<Student>student1=new ArrayList<Student>();
		student1.add(new Student("alice","java"));
		student1.add(new Student("bob","python"));
		student1.add(new Student("david","c++"));
		student1.add(new Student("eve","javaScript"));
		filterStudentsBycourse(student1,"java");
		
		List<Student>student2=new ArrayList<Student>();
		student2.add(new Student("alice","php"));
		student2.add(new Student("bob","java"));
		student2.add(new Student("david","c++"));
		student2.add(new Student("eve","javaScript"));
		filterStudentsBycourse(student2,"java");
		
		
		
		}
	

	private static void filterStudentsBycourse(List<Student> student1, String course) {
		student1.stream().filter(student->student.course().equals(course))
		.forEach(student->System.out.println(student.name()));
		
	}

}
