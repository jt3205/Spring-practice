package com.edu.entity;

public class Triangle extends Shape {
	public Triangle(String title, int data1, int data2) {
		super.title = title;
		super.data1 = data1;
		super.data2 = data2;
	}

	@Override
	public void viewSize() {
		System.out.println(title + "ÀÇ ³ĞÀÌ´Â " + (double) data1 * data2 / 2);
	}

}
