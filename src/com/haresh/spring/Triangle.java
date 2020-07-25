package com.haresh.spring;

public class Triangle {
	
	private String type;
	private Point a;
	private Point b;
	private Point c;
	
	public Triangle() {
	}

	public Triangle(String type) {
		this.type = type;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	
	public Point getA() {
		return a;
	}

	public void setA(Point a) {
		this.a = a;
	}

	public Point getB() {
		return b;
	}

	public void setB(Point b) {
		this.b = b;
	}

	public Point getC() {
		return c;
	}

	public void setC(Point c) {
		this.c = c;
	}

	public void draw() {
		System.out.println(getType() + " Triangle Drawn, with co-ordinates "+ a +", "+ b +", "+ c);
	}

}
