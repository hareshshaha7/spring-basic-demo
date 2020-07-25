package com.haresh.spring;

import java.util.List;

public class Rectangle {
	List<Point> points;

	public List<Point> getPoints() {
		return points;
	}

	public void setPoints(List<Point> points) {
		this.points = points;
	}

	public String toString() {
		return "Rectangle [points=" + points + "]";
	}
	
}
