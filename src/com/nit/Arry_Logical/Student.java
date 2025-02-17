package com.nit.Arry_Logical;

 record Student (int id,String name,double fess) implements Comparable<Student> {

	

	@Override
	public int compareTo(Student o) {
	
		/*return this.name.compareTo(o.name);*/
		return this.id-o.id;
	}
	

}

