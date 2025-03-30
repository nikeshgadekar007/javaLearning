package com.practice;

public class Employee extends Person {

//	public String getId() {
//		return "my id is 6987";
//	}
//	
//	public int add(int num1, int num2) {
//		
//		return num1+ num2;
//	}
//	
//	public int add(int num1, int num2, int num3) {
//		
//		return num1+ num2+ num3;
//	}
//	void empName() {
//		System.out.println("my name is Gadekar");
//	}
//	void getData() {
//		super.personName();
//		empName();
//		
//	}
	
	int id;


	
	
	public Employee(int id) {
		this.id = id;
	}

	
	
	
	public int getId() {
		return id;
	}




	public void setId(int id) {
		this.id = id;
	}




//	@Override
//	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + id;
//		return result;
//	}
//
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Employee other = (Employee) obj;
//		if (id != other.id)
//			return false;
//		return true;
//	}
	
	
	
	
	
}
