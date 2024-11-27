package com.nit.Copy_constructor;

public class CalculateStudentGrade {
	public static StudentGrade getcalculateGrade(Student obj) {
		
		 int marks = obj.getMarks();
		if(marks>90) {
			return new StudentGrade(obj,'A');
			}
		else if(marks>=70) {
			return new StudentGrade(obj,'B');
		}
		else if(marks>=60) {
			return new StudentGrade(obj,'C');
		}
		else {
			return new StudentGrade(obj,'D');
		}
	}

}
