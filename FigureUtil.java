package utils;

public class FigureUtil {
	public static Rond getRandomRond() {
		return new Rond(new Point((int)Math.random(),(int)Math.random()));
	}
}
