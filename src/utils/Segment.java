package utils;

public class Segment extends Figure{

	private Point p, p2;

	public Segment(Point debut, int longueur, boolean horizontal) {
		this.p= new Point(debut.getX(),debut.getY());
		this.p2= new Point(debut.getX() + (horizontal?longueur:0),debut.getY()+(horizontal?0:longueur));
	}
	
	public Figure getRandomFigure(Object o) {
		return null;
	}

	@Override
	public String toString() {
		return "[["+this.p.getX()+";"+this.p.getY()+"] à ["+this.p2.getX()+";"+this.p2.getY()+"]]";
	}

	@Override
	public Point[] getPoints() {
		Point points[]= {this.p, this.p2};
		return points;
	}

	@Override
	public boolean couvre(Point p) {
		
		if(p.getX() < this.p.getX())
			return false;
		if(p.getX() > this.p2.getX())
			return false;
		if(p.getY() < this.p.getY())
			return false;
		if(p.getY() > this.p2.getY())
			return false;
		
		return true;
	}

	@Override
	protected String getType() {
		// TODO Auto-generated method stub
		return null;
	}
}
