package utils;

public class Rond {
	private int r;
	private Point p;
	
	public Rond(Point p, int r) {
		this.p=p;
		this.r=r;
	}
	
	public String toString(){
		return "[ROND ["+p.getX()+";"+p.getY()+"], "+r+"]";
	}
}
