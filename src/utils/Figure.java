package utils;

public abstract class Figure {

	public Figure() {

	}
	
	public abstract String toString();
	
	public void afficher() {
		System.out.println(this.toString());
	}
	
	public boolean equals(Object o){
		if(!(o instanceof Figure))
			return false;
		else 
			return false;
	}
	
	public abstract Point[] getPoints();
	
	public abstract boolean couvre(Point p);
	
	protected abstract String getType();
}
