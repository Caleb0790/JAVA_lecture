package utils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Dessin {
	/*Pas de cl�e valeur, doublon auroris� acc�s indiff�rent d'ou ArrayList*/ 
	private List<Figure> collFigs=new ArrayList<Figure>();;
	
	public Dessin() {
	 
	}

	public boolean add(Figure f) {
		return collFigs.add(f);
	}
	
	public Collection<Figure> getFigures(){
		return collFigs;
	}
}
