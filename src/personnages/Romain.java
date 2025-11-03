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
	public void recevoirCoup(int forceCoup)
	{
		assert forceCoup>0;
		int forcetemp=this.force;
		this.force-=forceCoup;
		if (force<1) 
			{parler("J'abandonne !");} 
		else 
			{parler("Aie");}
		assert isInvariantVerified();
		assert this.force<forcetemp;
			
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
		System.out.print("Le soldat "+nom+" s'équipe avec un "+equipement+".\n");
		nbEquipement++;
	}
	public void sEquiper(Equipement equipement)
	{
		switch(nbEquipement)
		{
		case 2 :
			System.out.println("Le soldat "+nom+" est bien déja protégé");
			break;
		case 1:
			if (equipement==equipements[0])
			{
				System.out.println("Le soldat "+nom+" possède déja un "+equipement+" !");
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
