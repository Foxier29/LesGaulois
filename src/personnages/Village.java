package personnages;

public class Village {
	private String nom;
	private int nbVillageois=0;
	private Gaulois chef;
	private int NBVILLAGEOISMAX;
	private Gaulois[] villageois;
	public Village(String nom, Gaulois chef, int nB_VILLAGEOIS_MAX) {
		super();
		this.nom = nom;
		this.chef = chef;
		this.chef.setVillage(this);
		this.villageois = new Gaulois [nB_VILLAGEOIS_MAX];
		NBVILLAGEOISMAX = nB_VILLAGEOIS_MAX;
	}
	public String getNom() {
		return nom;
	}
	public Gaulois getChef()
	{
		return chef;
	}
	public void ajouterVillageois(Gaulois gaulois)
	{
		if (nbVillageois<NBVILLAGEOISMAX)
		{
		villageois[nbVillageois]=gaulois;
		nbVillageois++;
		gaulois.setVillage(this);}
		}
	public Gaulois trouverVillageois(int numVillageois)
	{
		if (numVillageois>nbVillageois || numVillageois-1<0)
		{
			System.out.print("Il n'y a pas autant d'habitants dans notre village \n");
			return null;
		}
		else {return villageois[numVillageois-1];}
	}
	private String nomchef()
	{
		return "Dans le village ' " + nom + " ' du chef " + chef.getNom() + " vivent les légendaires gaulois :";
	}
	public void afficherVillage()
	{
		
		System.out.println(nomchef());
		for (int i=0 ; i<nbVillageois ;i++)
			System.out.print("- "+villageois[i]+"\n");
	}
	public static void main(String[] args) {
		Gaulois abraracourcix=new Gaulois("Abraracourcix",8);
		Village village=new Village("Village des Irréductibles",abraracourcix,30);
		Gaulois asterix=new Gaulois("Astérix", 8);
		village.ajouterVillageois(asterix);
		Gaulois gaulois=village.trouverVillageois(1);
		System.out.println(gaulois);
		gaulois=village.trouverVillageois(2);
		System.out.println(gaulois);
		village.afficherVillage();
		Gaulois obelix=new Gaulois("Obélix", 25);
		village.ajouterVillageois(obelix);
		village.afficherVillage();
		Gaulois doublePolemix=new Gaulois("DoublePolémix", 4);
		abraracourcix.sePresenter();
		obelix.sePresenter();
		doublePolemix.sePresenter();
		
		
	}
}
