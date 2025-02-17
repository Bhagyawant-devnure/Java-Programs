/*package com.nit.Assignment_12;

public class HospitalStaff {
	
	private String name;
	private int age;
	private String role;
	
	public HospitalStaff(String name, int age, String role) {
		super();
		this.name = name;
		this.age = age;
		this.role = role;
		
		
	}
	public void work() {
		System.out.println(role +" "+name+"is working");
	}
	public String getname() {
		return name;
	}
	public String getrole() {
		return role;
	}
	public int getage() {
		return age;
		}
	}
	

	 class Doctor extends HospitalStaff{
		 private String specialization;

		public Doctor(String name, int age, String role, String specialization) {
			super(name, age, role);
			this.specialization = specialization;
		}
		@Override
		public void work() {
			System.out.println(name+"with specialization in "+ specialization+"is treating patients");
		}
		 public String getspecialization() {
		        return specialization;
		    }}
		
		class nurse extends HospitalStaff{
			private int yearsOfExperience;

			public nurse(String name, int age, String role, int yearsOfExperience) {
				super(name, age, role);
				this.yearsOfExperience = yearsOfExperience;
			}
			@Override
			public void work() {
				System.out.println(role + "years of experience taking care of patients");
			}
			 public int getYearsOfExperience() {
			        return yearsOfExperience;
			    }
		
}*/

package com.nit.Assignment_12;

// Base class
public class HospitalStaff {

    private String name;
    private int age;
    private String role;

    // Constructor
    public HospitalStaff(String name, int age, String role) {
        this.name = name;
        this.age = age;
        this.role = role;
    }

    // Method to simulate work
    public void work() {
        System.out.println(role + " " + name + " is working.");
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public String getRole() {
        return role;
    }

    public int getAge() {
        return age;
    }
}

// Subclass: Doctor
class Doctor extends HospitalStaff {
    private String specialization;

    // Constructor
    public Doctor(String name, int age, String specialization) {
        super(name, age, "Doctor");
        this.specialization = specialization;
    }

    @Override
    public void work() {
        System.out.println(getName() + " with specialization in " + specialization + " is treating patients.");
    }

    // Getter for specialization
    public String getSpecialization() {
        return specialization;
    }
}

// Subclass: Nurse
class Nurse extends HospitalStaff {
    private int yearsOfExperience;

    // Constructor
    public Nurse(String name, int age, int yearsOfExperience) {
        super(name, age, "Nurse");
        this.yearsOfExperience = yearsOfExperience;
    }

    @Override
    public void work() {
        System.out.println(getRole() + " " + getName() + " with " + yearsOfExperience + " years of experience is taking care of patients.");
    }

    // Getter for years of experience
    public int getYearsOfExperience() {
        return yearsOfExperience;
    }
}

