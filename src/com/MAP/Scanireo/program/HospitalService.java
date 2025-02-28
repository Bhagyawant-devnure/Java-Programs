package com.MAP.Scanireo.program;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class HospitalService {
	
		ArrayList<Hospital> h1= new ArrayList<>();
		
		public void addHospital(Hospital h2) {
			h1.add(h2);
	}
		
		public Map<Integer, String>  getHospitals(Hospital h2){
			Map<Integer, String> map= new HashMap<Integer, String>();
			map.put(h2.getHospitalCode(),h2.getHospitalName());
			
			return map;
			
		}
		
		public Hospital getHospitalDetails(int code) {
			for(Hospital h2:h1) {
				if(h2.getHospitalCode()==code) {
					return h2;
				}
			}
			return null;
		}
		

}
