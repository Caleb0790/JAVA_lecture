package utils;

public class Test {

	public static void main(String[] args) {
	
		/* *********************************************
		 * Java10 : Classes
		 * *********************************************/
		System.out.println("JAVA10: Classes");
		System.out.println("=================================");
		Point p=new Point(2,3);
		System.out.println(p.getX());
		System.out.println(p.getY());
		System.out.println(p.toString());
		
		Rond r=new Rond(p, 4);
		System.out.println(r.toString());
		
		Rectangle rec= new Rectangle(p, 5,6);
		System.out.println(rec.toString());
		
		/* *********************************************
		 * Java12 : Heritage
		 * *********************************************/
		System.out.println();
		System.out.println("JAVA12: Heritage");
		System.out.println("=================================");
		
		Carre c=new Carre(p,5);
		c.afficher();
		
		/* *********************************************
		 * Java13 : Egalité de points
		 * *********************************************/
		System.out.println();
		System.out.println("JAVA13: Egalité de points");
		System.out.println("=================================");		
		
		Point p2= new Point(2,3);
		Object o= new Point(2,3);
		
		System.out.print("P1: ");
		p2.affiche();
		System.out.println("P2: Object with same position");
		
		System.out.println("Equal= "+p2.equals(o));
			
		/* *********************************************
		 * Java14 : Classe abstraite
		 * *********************************************/
		System.out.println();
		System.out.println("JAVA14: Classe abstraite");
		System.out.println("=================================");
		
		for(int i=0; i<5; i++)
			FigureUtil.getRandomFigure().afficher();
			
		
		/* *********************************************
		 * Java15 : Interface
		 * *********************************************/
		System.out.println();
		System.out.println("JAVA15: Interface");
		System.out.println("=================================");
		
		Surfacable f=null;
		for(int i=0; i<5; i++) {
			f= FigureUtil.getRandomSurfacable();
			System.out.println("Surface="+f.surface()+" ");
			((Figure) f).afficher(); 
			System.out.println("---------------------------------");
		}
		
		/* *********************************************
		 * Java20 : Tableau
		 * *********************************************/
		System.out.println();
		System.out.println("JAVA20: Tableau");
		System.out.println("=================================");
		
		Figure f2=FigureUtil.getRandomFigure();
		System.out.println("Random "+f2.getType());
		Point points[]= f2.getPoints();
		for(int i=0; i<points.length; i++)
			points[i].affiche();
		System.out.println("Has "+points.length+" Point.");
		
		
		/* *********************************************
		 * Java30 : Enumeration
		 * *********************************************/
		System.out.println();
		System.out.println("JAVA30: Enumeration");
		System.out.println("=================================");
				
		//Point p3= new Point(9,6);
		//p3.affiche();
		//r.afficher();
		//System.out.println(r.couvre(p3));
		
		Couleur cb=Couleur.Bleu;
		System.out.println("Color: "+cb);
		System.out.println("Color code: "+cb.getCouleurCode());
		System.out.println("Default: "+Couleur.getCouleurDefaut());
		
		Segment s3=new Segment(p2, 52, true, cb);
		s3.afficher();
		
	}

}
