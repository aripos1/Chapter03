package com.javaex.ex02;

public class Point {

	private int x;
	private int y;

	public Point() {
	}

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public final int getX() {
		return x;
	}

	public final void setX(int x) {
		this.x = x;
	}

	public final int getY() {
		return y;
	}

	public final void setY(int y) {
		this.y = y;
	}

	

	@Override
	public boolean equals(Object obj) {
		
		boolean result;
		Point p = (Point) obj;

		if (this.x == p.x && (this.y == p.y)) {
			result = true;

		} else {

			result = false;
		}

		return result;
	}

}
