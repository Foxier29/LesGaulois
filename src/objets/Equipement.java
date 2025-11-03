package objets;

public enum Equipement {
	CASQUE("casque") , BOUCLIER("bouclier") ;
	private String Nom;
	
	private Equipement(String nom) {
		this.Nom=nom;
	}
	
	public String toString()
	{
		return Nom;
	}
	
}
