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
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public Point[] getPoints() {
	
		Point p1[]= {this.p};
		return p1;
	}
}
