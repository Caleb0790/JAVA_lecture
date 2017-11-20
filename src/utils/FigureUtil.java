package utils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Random;

public class FigureUtil {
	
	private static int MIN_NUM=0;
	private static int MAX_NUM=100;
	
	
	private static int getRandNum() {
		Random r = new Random();
		return r.nextInt((MAX_NUM - MIN_NUM) + 1) + MIN_NUM;
	}
	
	private static Point getRandomPoint() {
		return new Point(getRandNum(),getRandNum());
	}
	
	public static Rond getRandomRond() {
		return new Rond(getRandomPoint(), getRandNum());
	}
	
	public static Carre getRandomCarre(){
		return new Carre(getRandomPoint(), getRandNum());
	}
	
	public static Rectangle getRandomRectangle() {
		return new Rectangle(getRandomPoint(),getRandNum(),getRandNum());
	}
	
	public static Segment getRandomSegment() {
		return new Segment(getRandomPoint(),getRandNum(), Math.random() < 0.5);
	}

	
	public static Figure getRandomFigure() {
		Figure f;
		Random random= new Random();
		int i=random.nextInt(4);
		switch(i) {
			case 0: f=getRandomRond(); break;
			case 1: f=getRandomCarre(); break;
			case 2: f=getRandomRectangle(); break;
			case 3: f=getRandomSegment(); break;
			default: f=null;
		}
		return f;
	}
	
	public static Collection<Figure> genere(int number){
		Collection<Figure> figures= new ArrayList<>();
		int i=0;
		while(i<number) {
			figures.add(getRandomFigure());
			i++;
		}
		return figures;
	}
	
	public static Surfacable getRandomSurfacable() {
		Surfacable f;
		Random random= new Random();
		int i=random.nextInt(3);
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
	
	public static Figure getFigureEn(Point p, Dessin d) {
		Iterator<Figure> interator=d.getFigures().iterator();
		while (interator.hasNext()) {
			Figure figure = (Figure) interator.next();
			if(figure.couvre(p))
				return figure;
		}
		return null;
	}
	
}
