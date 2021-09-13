package com.oops;

interface A
{
	public void m1();// {System.out.println("Am from A class");}
}
interface B
{
	public void m1();// {System.out.println("Am from B class");}
}

public class Calculator implements A,B {
	public void mul(int fNum, int sNum) {
		int result = fNum * sNum;
		System.out.println("mul of two numbers " + result);
	}
	public static void main(String[] args) {
		Calculator cal = new Calculator();
		cal.mul(12, 12);
	
	}
	@Override
	public void m1() {
		// TODO Auto-generated method stub
		
	}
	}
