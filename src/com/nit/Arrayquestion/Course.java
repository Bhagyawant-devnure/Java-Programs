package com.nit.Arrayquestion;

public class Course {

	int courseId;
	String courseName;
	double courseFee;
	
	public int getCourseId() {
		return courseId;
	}

	public String getCourseName() {
		return courseName;
	}

	public double getCourseFee() {
		return courseFee;
	}

	public Course(int courseId, String courseName, double courseFee) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
		this.courseFee = courseFee;
	}

	@Override
	public String toString() {
		return "Course [courseId=" + courseId + ", courseName=" + courseName + ", courseFee=" + courseFee + "]";
	}
	
	
	
}

class Offer{
	String offerText;

	public Offer(String offerText) {
		super();
		this.offerText = offerText;
	}
	
	public String getofferText() {
		return offerText;
	}
}

class EducationInstitute{
	Course []Course= {};//has-A RealtionShip
	Offer [] offer={};
	
	public EducationInstitute(com.nit.Arrayquestion.Course[] course, Offer[] offer) {
		super();
		Course = course;
		this.offer = offer;
	}

	public Course[] getCourse() {
		return Course;
	}

	public Offer[] getOffer() {
		return offer;
	}
	
	public  synchronized void enrollStudentInCourse(int courseId,String studentName) {
		
		for(Course course:Course) {
			if(course.getCourseId()	==courseId)
				{
				System.out.println(studentName+"has enrolled in the course"+course.getCourseName());
				return ;
				}}
		System.out.println(" course not found");
	}
	
}

class Student{
  String name;
  EducationInstitute institute;
  
public Student(String name, EducationInstitute institute) {
	super();
	this.name = name;
	this.institute = institute;
}

public void viewCourseAndFees() {
	
}

public void viewOffers() {
	
}
public void enrollInCourse(int courseId) {
	
}
  
  
}
