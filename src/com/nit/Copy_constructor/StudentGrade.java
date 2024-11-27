package com.nit.Copy_constructor;

public class StudentGrade {
	private Student student;
	private char studentGrade;
	public StudentGrade(Student student, char studentGrade) {
		super();
		this.student = student;
		this.studentGrade = studentGrade;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public char getStudentGrade() {
		return studentGrade;
	}
	public void setStudentGrade(char studentGrade) {
		this.studentGrade = studentGrade;
	}
	@Override
	public String toString() {
		return "StudentGrade [student=" + student + ", studentGrade=" + studentGrade + "]";
	}
	

}
