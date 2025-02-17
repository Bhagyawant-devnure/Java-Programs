package com.nit.Exception_Assignment_4;

public class childClass extends ParentClass {
	@Override
	public void  loadingClass(String Classname) {
		if(!Classname.isEmpty()) {
			
			try {
				Class.forName(Classname);
				super.loadingClass(Classname);
				System.out.println(Classname);
			} 
			catch (ClassNotFoundException e) {
				System.out.println(e.getMessage());
				e.printStackTrace();
			}
			
		}else {
		throw new IllegalArgumentException("Classname cannot be empty.");
		}
		
	}
	
	public static void main(String[] args) {
		childClass c= new childClass();
		c.loadingClass("java.lang.String");
	}

}
