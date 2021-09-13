package com.oops;

class Calc {
	public void add(double a, double b) {
		System.out.println("Addition of two float numbers : " + (a + b));
	}

//	public void add(int a, int b) {
//		System.out.println("Addition of two int numbers : " + (a + b));
//	}

//	public void add(int a, int b, int c) {
//		System.out.println("Addition of three numbers : " + (a + b + c));
//	}
//
//	public void add(int a, float b) {
//		System.out.println("Addition of int,float numbers : " + (a + b));
//	}
//
//	public void add(float a, int b) {
//		System.out.println("Addition of float,int numbers : " + (a + b));
//	}

	public static void main(String[] args) {
		Calc calc = new Calc();
		calc.add(12.34, 14.1);
		calc.add('a','b');//type promotion

	}
}