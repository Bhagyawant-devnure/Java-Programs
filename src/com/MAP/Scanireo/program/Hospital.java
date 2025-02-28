package com.MAP.Scanireo.program;

import java.util.ArrayList;
import java.util.List;

public class Hospital {
	private int hospitalCode;
	private String hospitalName;
	private String contactPerson;
	private String contactNumber;
	private String location;
	private List<String> listOfTreatments;
	public int getHospitalCode() {
		return hospitalCode;
	}
	public void setHospitalCode(int hospitalCode) {
		this.hospitalCode = hospitalCode;
	}
	public String getHospitalName() {
		return hospitalName;
	}
	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}
	public String getContactPerson() {
		return contactPerson;
	}
	public void setContactPerson(String contactPerson) {
		this.contactPerson = contactPerson;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	public List<String> getListOfTreatments() {
		return listOfTreatments;
	}
	public void setListOfTreatments(List<String> listOfTreatments) {
		this.listOfTreatments = listOfTreatments;
	}
	
	public Hospital(int hospitalCode, String hospitalName, String contactPerson, String contactNumber, String location,
			List<String> listOfTreatments) {
		super();
		this.hospitalCode = hospitalCode;
		this.hospitalName = hospitalName;
		this.contactPerson = contactPerson;
		this.contactNumber = contactNumber;
		this.location = location;
		this.listOfTreatments = listOfTreatments;
	}
	@Override
	public String toString() {
		return "Hospital [hospitalCode=" + hospitalCode + ", hospitalName=" + hospitalName + ", contactPerson="
				+ contactPerson + ", contactNumber=" + contactNumber + ", location=" + location + ", listOfTreatments="
				+ listOfTreatments + "]";
	}
	
	
	

}
