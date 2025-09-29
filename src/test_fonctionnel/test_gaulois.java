package test_fonctionnel;

import personnages.Gaulois;

public class test_gaulois {
	public static void main(String[] args) {
		Gaulois asterix=new Gaulois("Astérix", 8);
		Gaulois obelix=new Gaulois("Obélix", 16);
		asterix.parler("Bonjour Obélix.");
		obelix.parler("Bonjour Astérix. Ca te dirais d'aller chasser des sangliers ?");
		asterix.parler("Oui très bonne idée.");
	}
}
