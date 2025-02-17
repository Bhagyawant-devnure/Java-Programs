package com.nit.reexam27abstract;

public class MembershipFactory {
 public static Membership Factory(String membershipType) {
	 if(membershipType.equalsIgnoreCase("Gold")) {
		 return new GoldMember();
	 }
		 else if (membershipType.equalsIgnoreCase("silver")) {
	            return new SilverMember();
	        } else {
	            return new NonMember();
	        }
	 }
 }
	    
	 
	 
 

