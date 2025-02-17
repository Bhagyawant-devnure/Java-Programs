package com.nit.Assignment_12;

public class HospitalManagementSystem {
    public static void main(String[] args) {
        // Create objects
        Doctor doctor = new Doctor("dr-bhagawant", 40, "Cardiology");
        Nurse nurse = new Nurse("kavya", 30, 5);

        // Call work methods
        doctor.work();
        nurse.work();
    }
}

