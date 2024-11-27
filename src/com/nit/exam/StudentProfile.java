package com.nit.exam;





public class StudentProfile {
	String name;
	double cgpa;
	JobProfile jobProfile;
	public StudentProfile(String name, double cgpa) {
		super();
		this.name = name;
		this.cgpa = cgpa;
	}
	
	@Override
	public String toString() {
		return "StudentProfile [name=" + name + ", cgpa=" + cgpa;
	}
	
	public void assignJobProfile(JobProfile jobProfile) {
		if(cgpa>=7.0) {
			System.out.println(PlacementManager.createJobprofile());
			System.out.println("Creating job profile....");
			System.out.println("Assiging  job profile to"+name+"....");
			JobOfferAccepted();
			//System.out.println("Assiging Job profile:");
			
			
			//System.out.println("Placement Cell:"+jobProfile.placementCell);
		}else {
			System.out.println("normal batch");
		}
	}
	public void JobOfferAccepted() {
		System.out.println("job offer is Accepted...by the student!");
		System.out.println(toString());
	}
	

}

