package com.oops;
class Parent
{
	int age=90;

}
public class Child extends Parent{
	int age=82;
	public void displayAge()
	{
		int age=28;
		System.out.println(this.age+"  My Age :"+age+"  "+super.age);
	}
	public static void main(String[] args) {
		Child child=new Child();
		child.displayAge();
	}
}
