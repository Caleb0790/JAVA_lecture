package utils;

public class Test {

	public static void main(String[] args) {
	
		Point p=new Point(2,3);
		System.out.println(p.getX());
		System.out.println(p.getY());
		System.out.println(p.toString());
		
		Rond r=new Rond(p, 4);
		System.out.println(r.toString());
		
		Rectangle rec= new Rectangle(p, 5,6);
		System.out.println(rec.toString());
		
		Carre c=new Carre(p,5);
		System.out.println(c.toString());
	}

}
