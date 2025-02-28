package com.MAP.Scanireo.program;

import java.util.List;

public class HospitalFinder {

	public static void main(String[] args) {
	  Hospital hospital = new Hospital(101, "Ayush", "Abhi", "808028", "Ameerpet", List.of("Backpain,Hairfall"));
	  HospitalService service = new HospitalService();
	  service.addHospital(hospital);
	  service.getHospitals(hospital);
	  service.getHospitalDetails(2);
	  System.out.println(hospital);
	 
	 
	 
	}

}
