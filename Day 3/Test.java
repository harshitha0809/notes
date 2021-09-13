package com.oops;

public class Test {
	public Test() {
		System.out.println("default constructor");
	}
	public Test(String name) {
		System.out.println("param constructor : "+name);
	}
	public void sleeping() {
		System.out.println("allow us to sleep for some time....");
	}

	public static void main(String[] args) {
		Test test1 = new Test();
		Test test = new Test("fiserv");// jvm
		test.sleeping();

	}
}
