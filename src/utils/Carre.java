package utils;

public class Carre extends Rectangle{

	private Point p;
	private Point p1;
	private Point p2;
	private Point p3;

	
	public Carre(Point p, int c){
		super(p, c, c);
		this.p=p;
		this.p1= new Point(this.p.getX()+c, this.p.getY());
		this.p2= new Point(this.p.getX()+c, this.p.getY()+c);
		this.p3= new Point(this.p.getX(), this.p.getY()+c);
	}
	
	public Point getPointBasGuache() {return p3;}
	public Point getPointBasDroite() {return p2;}
	public Point getPointHautGauche() {return p;}
	public Point getPointHautDroite() {return p1;}
	
	@Override
	protected String getType() {
		// TODO Auto-generated method stub
		return "CARRE";
	}
	
	public String toString() {
			return "["+getType()+" ["+p.getX()+";"+p.getY()+"]["+p1.getX()+";"+p1.getY()+"]["+p2.getX()+";"+p2.getY()+"]["+p3.getX()+";"+p3.getY()+"]]";
	}
}
