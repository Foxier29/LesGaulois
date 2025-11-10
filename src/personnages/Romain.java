package personnages;

import objets.Equipement;

public class Romain {
	private String nom;
	private int force;
	private Equipement[] equipements=new Equipement [2];
	private int nbEquipement=0;
	public Romain(String nom, int force) {
		this.nom = nom;
		this.force = force;
		assert isInvariantVerified();
	
	}
	private boolean isInvariantVerified()
	{
		return force>=0;
	}
	public String getNom() {
		return nom;
	}
	public void parler(String texte) {
		System.out.println(prendreParole() +"\"" + texte +"\"");
	}
	private String prendreParole() {
		return "Le Romain " + nom + ": ";
	}
//	public void recevoirCoup(int forceCoup)
//	{
//		assert forceCoup>0;
//		int forcetemp=this.force;
//		this.force-=forceCoup;
//		if (force<1) 
//			{parler("J'abandonne !");} 
//		else 
//			{parler("Aie");}
//		assert isInvariantVerified();
//		assert this.force<forcetemp;
//			
//	}
	public Equipement[] recevoirCoup(int forceCoup) {
		Equipement[] equipementEjecte = null;
		forceCoup = calculresistanceequipement(forceCoup);
		force -= forceCoup;
		if (force==0) {
		parler("Aïe");}
		else {
		equipementEjecte = ejecterEquipement();
		parler("J'abandonne...");}
		return equipementEjecte;
		}
	private int calculresistanceequipement(int forceCoup) {
		private String texte = "Ma force est de " + this.force + ", et la force du coup est de" + forceCoup;
		int resistanceEquipement = 0;
		if (nbEquipement != 0) {
		texte += "\nMais heureusement, grace à mon équipement sa force est diminué de ";
		for (int i = 0; i < nbEquipement;) {
		if ((equipements[i] != null &&
		equipements[i].equals(Equipement.BOUCLIER)) == true) {
		resistanceEquipement += 8;
		} else {
		System.out.println("Equipement casque");
		resistanceEquipement += 5;
		}
		i++;
		}
		texte =+ resistanceEquipement + "!";
		}
		parler(texte);
		forceCoup -= resistanceEquipement;
		return forceCoup;
		}
	private Equipement[] ejecterEquipement() {
		Equipement[] equipementEjecte = new Equipement[nbEquipement];
		System.out.println("L'équipement de " + nom.toString() + " s'envole sous la force du coup.");
		//TODO
		int nbEquipementEjecte = 0;
		for (int i = 0; i < nbEquipement; i++) {
		if (equipements[i] == null) {
		continue;
		} else {
		equipementEjecte[nbEquipementEjecte] = equipements[i];
		nbEquipementEjecte++;
		equipements[i] = null;
		}
		}
		return equipementEjecte;
		}
	public static void main(String[] args) {
		Romain minus=new Romain("Minus", 6);
		minus.sEquiper(Equipement.CASQUE);
		minus.sEquiper(Equipement.CASQUE);
		minus.sEquiper(Equipement.BOUCLIER);
		minus.sEquiper(Equipement.CASQUE);
		
	}
	private void Equiper(int dejaEquipe,Equipement equipement)
	{
		equipements[dejaEquipe]=equipement;
		System.out.print("Le soldat "+nom+" s'Ã©quipe avec un "+equipement+".\n");
		nbEquipement++;
	}
	public void sEquiper(Equipement equipement)
	{
		switch(nbEquipement)
		{
		case 2 :
			System.out.println("Le soldat "+nom+" est bien dÃ©ja protÃ©gÃ©");
			break;
		case 1:
			if (equipement==equipements[0])
			{
				System.out.println("Le soldat "+nom+" possÃ¨de dÃ©ja un "+equipement+" !");
			}
			else
			{
				this.Equiper(1,equipement);
			}
			break;
		case 0 :
			this.Equiper(0,equipement);
		
		}
	}
}
