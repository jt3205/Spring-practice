package com.edu.entity;

public abstract class Shape {
	String title;
	int data1;
	int data2;
	public Shape() {
		
	}
	public Shape(String title, int data1, int data2) {
		this.title = title;
		this.data1 = data1;
		this.data2 = data2;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setData1(int data1) {
		this.data1 = data1;
	}
	public void setData2(int data2) {
		this.data2 = data2;
	}
	abstract public void viewSize();
}
