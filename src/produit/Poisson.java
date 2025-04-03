package produit;

public class Poisson extends Produit {
	private String dateDePeche;

	public Poisson(String dateDePeche) {
		this.nom = "poisson";
		this.dateDePeche = dateDePeche;
	}
	
	public String decrireProduit() {
		StringBuilder s = new StringBuilder(getNom());
		s.append(" pêchés ");
		s.append(dateDePeche);
		s.append(".");
		return s.toString();
	}

}
