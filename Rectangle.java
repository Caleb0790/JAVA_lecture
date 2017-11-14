package utils;

public class Rectangle {

	private Point p;
	private Point p1;
	private Point p2;
	private Point p3;
	private int h;
	private int l;
	
	public Rectangle(Point p, int h, int l) {
		this.p=p;
		this.h=h;
		this.l=l;
		this.p1= new Point(this.p.getX()+l, this.p.getY());
		this.p2= new Point(this.p.getX()+l, this.p.getY()+h);
		this.p3= new Point(this.p.getX(), this.p.getY()+h);
	}
	
	public Point getPointBasGuache() {return p3;}
	public Point getPointBasDroite() {return p2;}
	public Point getPointHautGauche() {return p;}
	public Point getPointHautDroite() {return p1;}
	
	public String toString() {
			return "[RECT ["+p.getX()+";"+p.getY()+"]["+p1.getX()+";"+p1.getY()+"]["+p2.getX()+";"+p2.getY()+"]["+p3.getX()+";"+p3.getY()+"]]";
	}
}
