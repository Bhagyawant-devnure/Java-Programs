package com.nit.reexam27abstract;

public class FactoryClass {
	public static Language Factory(String lang) {
		if(lang.equalsIgnoreCase("hindi")) {
			return new Hindi();
		}
	else if(lang.equalsIgnoreCase("telugu")) {
		return new Telugu();}
	 else {
		return new Non();
	}}

}

