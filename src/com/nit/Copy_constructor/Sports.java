package com.nit.Copy_constructor;

public class Sports {
	private String sportName;
	private int teamSize;
	private String sportType;
	public Sports() {
		
		this.sportName = "Unkonwn";
		this.teamSize = 0;  
		this.sportType = "Unknown"; 
	}

	
	public Sports(String sportName,int teamSize) {
		this.sportName=sportName;
		if(teamSize>0) {
			this.teamSize=teamSize;
		}
		else {
			this.teamSize=0;
			System.out.println("Error : team size must be positive");
		}
		this.sportType="Unknown";
	}
	
	public Sports(String sportName,int teamsize,String sportType) {
		this.sportName=sportName;
		if(teamSize>0) {
			this.teamSize=teamSize;
		}
		else {
			this.teamSize=0;
			System.out.println("error ");
			
		}
		this.sportType=sportType;
	}
	
	public void display() {
		System.out.println("Sport Name: "+sportName);
		System.out.println("enter team size: "+teamSize);
		System.out.println("Sport Type: "+sportType);
	}
	

}
