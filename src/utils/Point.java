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
		return this.x;
	}

	public int getY() {
		return this.y;
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
	
	public void affiche() {
		System.out.println(toString());
	}

	public boolean equals(Object o) {
		if (o instanceof Point) {

			Point p = (Point) o;

			if (this.x == p.getX() && this.y == p.getY())
				return true;
		}
		return false;
	}
}
