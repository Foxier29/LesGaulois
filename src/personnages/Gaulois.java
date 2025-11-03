package personnages;

public class Gaulois {
	private String nom;
	private int force;
	private int effetPotion=1;
	private Village village;
	
	public void setVillage(Village village) {
		this.village = village;
	}
	public Gaulois(String nom, int force) {
		this.nom = nom;
		this.force = force;}
	public String getNom() {
		return nom;
	}
	public void parler(String texte) {
		System.out.println(prendreParole() + "\"" + texte + "\"");

	}
	private String prendreParole() {
		return "Le gaulois " + nom + " : ";
	}
	public static void main(String[] args) {
		Gaulois asterix=new Gaulois("Ast�rix", 8);
		System.out.println(asterix);
	}
	@Override
	public String toString() {
		return nom;
	}
	public void frapper(Romain romain)
	{
		System.out.println(nom + " envoie un grand dans la machoire de "+ romain.getNom());
		romain.recevoirCoup((force*effetPotion)/3);
		if (effetPotion>1)
		{
			effetPotion=effetPotion-1;
		}
	}
	public void boirePotion(int forcePotion)
	{
		effetPotion=forcePotion;
	}
	public void sePresenter()
	{
		if(village==null)
		{
			System.out.print("Bonjour, je m'appelle " +nom+". Je voyage de villages en villages \n");
		}
		else if (this==village.getChef())
		{
			System.out.print("Bonjour, je m'appelle " +nom+ ". Je suis le chef du village "+ village.getNom()+'\n');
		}
		else 
		{
			System.out.print("Bonjour, je m'appelle " +nom+". J'habite le village "+village.getNom()+'\n');
		}
		
	}
	
}
