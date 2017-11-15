package utils;

public class Point{
	private int x;
	private int y;
	private static int INIT_X = 25;
	private static int INIT_Y = 25;

	public Point() {
		this(INIT_X, INIT_Y);
	}

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}

	public String toString() {
		String s = "[" + x + ";" + y + "]";
		return s;
	}

	public boolean equals(Object o) {
		if (super.equals(o)) {

			Point p = (Point) o;

			if (this.x == p.getX() && this.y == p.getY())
				return true;
		}
		return false;
	}
}
