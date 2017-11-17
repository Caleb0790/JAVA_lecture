package utils;

public class Rectangle extends Figure implements Surfacable{

	private Point p;
	private Point p1;
	private Point p2;
	private Point p3;
	private int h;
	private int l;
	
	public Rectangle(Point p, int h, int l, Couleur c) {
		super(c);
		this.h=h;
		this.l=l;
		this.p= new Point(p.getX(),p.getY());
		this.p1= new Point(this.p.getX()+l, this.p.getY());
		this.p2= new Point(this.p.getX()+l, this.p.getY()+h);
		this.p3= new Point(this.p.getX(), this.p.getY()+h);
	}
	
	public Rectangle(Point p, int h, int l) {
		this(p,h,l,Couleur.getCouleurDefaut());

	}
	
	public Point getPointBasGuache() {return p3;}
	public Point getPointBasDroite() {return p2;}
	public Point getPointHautGauche() {return p;}
	public Point getPointHautDroite() {return p1;}
	
	@Override
	protected String getType() {
		return "RECT";
	}
	
	public String toString() {
			return "["+getType()+" ["+p.getX()+";"+p.getY()+"]["+p1.getX()+";"+p1.getY()+"]["+p2.getX()+";"+p2.getY()+"]["+p3.getX()+";"+p3.getY()+"]]";
	}

	@Override
	public double surface() {
		return (double)h*l;
	}

	@Override
	public Point[] getPoints() {
		Point points[]= {this.p, this.p1, this.p2, this.p3};
		return points;
	}

	@Override
	public boolean couvre(Point p) {
		
		if(p.getX() < this.p.getX())
			return false;
		if(p.getX() > this.p1.getX())
			return false;
		if(p.getY() < this.p.getY())
			return false;
		if(p.getY() > this.p3.getY())
			return false;
		
		return true;
	}
}
