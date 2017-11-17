package utils;

public enum Couleur {
	//Rouge, Vert, Bleu, Jaune, Noir;
	Rouge('R'), Vert('V'), Bleu('B'), Jaune('J'), Noir('N');
	
	char code;
	
	Couleur(char c){
		code=c;
	}
	
	char getCouleurCode() {
		return code;
	}
	
	static Couleur getCouleurDefaut() {
		return Couleur.Noir;
	}
	
}
