package utils;

public class FigureUtil {
	
	
	public static Rond getRandomRond() {
		return new Rond(new Point((int)Math.random(),(int)Math.random()), (int)Math.random());
	}
	
	public static Point[] getPoints(Figure... f) {
		int nbPoints=0;
		for(Figure fig: f)
			nbPoints += fig.getPoints().length;
		Point[] points = new Point[nbPoints];
		int i=0;
		for(Figure fig : f) {
			Point[] temps= fig.getPoints();
			int taille=temps.length;
			for(int j=0; j<taille; j++,i++) {
				points[i]=temps[j];
			}
		}
		return points;
	}
}
