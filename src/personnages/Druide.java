package personnages;

import objets.Chaudron;

public class Druide {
	private String nom;
	private int force;
	private Chaudron chaudron=new Chaudron();
	
	public Druide(String nom, int force) {
		super();
		this.nom = nom;
		this.force = force;
	}
	public String getNom() {
		return nom;
	}
	private String prendreParole()
	{
		return "Le druide " + nom + " : ";
	}
	public void parler(String texte)
	{
		System.out.println(prendreParole()+"\""+texte+"\"");
	}
	public void fabriquerPotion(int quantite , int forcePotion)
	{
		chaudron.remplirChaudron(quantite,forcePotion);
		System.out.println("J'ai concocté "+quantite+" doses de potion magique. Elle a une force de "+ forcePotion + ".");
	}
	public void booster(Gaulois gaulois)
	{
		String nomG=gaulois.getNom();
		if (chaudron.resterPotion())
		{
			if (nomG=="Obélix")
			{
				System.out.println("Nom, "+ nomG + " Non! ... Et tu le sais très bien !");
			}
			else
			{
				force=chaudron.prendreLouche();
				gaulois.boirePotion(force);
				System.out.println("Tiens " + nomG + " un peu de potion magique.");
			}
		}
		else
		{
			System.out.println("Désolé " + nomG + " il n'y a plus une seule goutte de potion. ");
		}
				
	}
}
