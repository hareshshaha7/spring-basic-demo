package com.haresh.spring;

public class Triangle {
	
	private String type;
	private Point pointA;
	private Point pointB;
	private Point pointC;
	
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

	public Point getPointA() {
		return pointA;
	}

	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}

	public Point getPointB() {
		return pointB;
	}

	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}

	public Point getPointC() {
		return pointC;
	}

	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}

	public void draw() {
		System.out.println(getType() + " Triangle Drawn, with co-ordinates "+ pointA +", "+ pointB +", "+ pointC);
	}

}
