package com.test1;


public class Sample1 {
	private void add() {
		System.out.println("add is a new");
	}
	private void m1() {
		System.out.println("test1");
	}
	private void a() {
		System.out.println("a is a old");

	}
	public static void main(String[] args) {
		Sample1 s=new Sample1();
		s.add();
		s.a();
	}

}
