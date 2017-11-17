package utils;

public class Rond extends Figure implements Surfacable{
	private int r;
	private Point p;
	
	public Rond(Couleur c, Point p, int r) {
		super(c);
		this.p=p;
		this.r=r;
	}
	
	public Rond(Point p, int r) {
		this(Couleur.getCouleurDefaut(),p,r);
	}	
	
	@Override
	protected String getType() {
		// TODO Auto-generated method stub
		return "ROND";
	}
	
	public String toString(){
		return "["+getType()+" ["+p.getX()+";"+p.getY()+"], "+r+"]";
	}

	@Override
	public double surface() {
		return this.r*this.r*Math.PI;
	}

	@Override
	public Point[] getPoints() {
	
		Point p[]= {this.p};
		return p;
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
