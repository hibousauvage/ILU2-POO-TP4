package produit;

import personnages.Gaulois;

public class Sanglier extends Produit {
	private int poids;
	private Gaulois chasseur;


	public Sanglier(Gaulois chasseur, int poids,Unite unite) {
		this.nom = "sanglier";
		this.chasseur = chasseur;
		this.poids = poids;
		this.unite = unite;
	}
	
	public String decrireProduit() {
		StringBuilder s = new StringBuilder(getNom());
		s.append(" de ");
		s.append(poids);
		s.append(" ");
		s.append(unite);
		s.append("chassé par ");
		s.append(chasseur.getNom());
		s.append(".");
		return s.toString();		
	}

}
