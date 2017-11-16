package utils;

public class Rond extends Figure implements Surfacable{
	private int r;
	private Point p;
	
	public Rond(Point p, int r) {
		this.p=p;
		this.r=r;
	}	
	
	public String toString(){
		return "[ROND ["+p.getX()+";"+p.getY()+"], "+r+"]";
	}

	@Override
	public Figure getRandomFigure() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public double surface() {
		return this.r*this.r*Math.PI;
	}

	@Override
	public Point[] getPoints() {
	
		Point p1[]= {this.p};
		return p1;
	}

	@Override
	public boolean couvre(Point p) {
		double a=(double)p.getX()-this.p.getX();
		double b=(double)p.getY()-this.p.getY();
		
		if(Math.sqrt(Math.pow(a, 2.0)+Math.pow(b, 2.0))<r)
			return true;
		return false;
	}
}
