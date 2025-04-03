package produit;


public enum Unite {
	GRAMME("g"),KILOGRAMME("kg"),LITRE("l"),CENTILITRE("cl"),MILLILITRE("ml"),PIECE("piece");
	
	String nom;
	private Unite(String nom) {
		this.nom = nom;
	}
	
	@Override
	public String toString() {
		return this.nom;
	}
}
