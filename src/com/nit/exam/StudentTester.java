package com.nit.exam;

public class StudentTester {

	public static void main(String[] args) {
		JobProfile job=new JobProfile();
//		PlacementManager p=new PlacementManager();
//		p.createJobprofile();
		StudentProfile student=new StudentProfile("raj", 7.0);
		student.assignJobProfile(job);
	
		
	}

}
