package utils;

import java.util.Random;

public class FigureUtil {
	
	private static Random random= new Random();
	
	public static Rond getRandomRond() {
		return new Rond(new Point(random.nextInt(100),random.nextInt(100)), random.nextInt(100));
	}
	
	public static Carre getRandomCarre(){
		return new Carre(new Point(random.nextInt(100),random.nextInt(100)), random.nextInt(100));
	}
	
	public static Rectangle getRandomRectangle() {
		return new Rectangle(new Point(random.nextInt(100),random.nextInt(100)),random.nextInt(100),random.nextInt(100));
	}
	
	public static Figure getRandomFigure() {
		Figure f;
		int i=random.nextInt(2);
		switch(i) {
			case 0: f=getRandomRond(); break;
			case 1: f=getRandomCarre(); break;
			case 2: f=getRandomRectangle(); break;
			default: f=null;
		}
		return f;
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
