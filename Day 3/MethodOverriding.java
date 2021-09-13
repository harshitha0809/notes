package com.oops;

abstract class Parents {
	void properties() {
		System.out.println("100 crores");
	}

	void marriage() {
		System.out.println("xyz");
	}
	abstract void  studies();
	
}

public class MethodOverriding extends Parents {
	@Override
	void marriage() {
		System.out.println("hari");
	}
	void m1() {
		System.out.println("Child method");
	}
	public static void main(String[] args) {
		MethodOverriding obj=new MethodOverriding();
		obj.marriage();
		obj.properties();
		obj.m1();
	}
	@Override
	void studies() {
	
	}
}
