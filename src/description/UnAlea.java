package description;

import description.Alea;

/**
 * Classe permettant la représetation d'un Aléa
 * @author Lahousse Ludovic, Pierre Delgrange, Nagi Karaouzéne, Nassim Badaoui
 *
 */
public class UnAlea implements Alea{
	
	private String nom;
	private TypeAlea type;
	private int gravite;
	private Couleur couleur;
	
	/**
	 * Construit un Aléa
	 * @param nom 
	 * @param type
	 * @param gravite
	 * @param couleur
	 */
	public UnAlea(String nom, TypeAlea type, int gravite, Couleur couleur) {
		this.nom = nom;
		this.type = type;
		this.gravite = gravite;
		this.couleur = couleur;
	}
	
	/**
	 * Indique la gravité d'un alea. Il s'agit d'un entier.
	 * @return Le niveau de gravité de cet Aléa
	 */
	@Override
	public int getGravite() {
		
		return this.gravite;
	}

	/**
	 * Indique le type d'impact de l'alea.
	 * @return Le type de cet aléa
	 */
	@Override
	public TypeAlea getType() {
		
		return this.type;
	}
	
	/**
	 * Indique la couleur de l'aléa.
	 * @return La couleur de cet aléa
	 */
	public Couleur getCouleur() {
		
		return this.couleur;
	}
	
	/**
	 * Indique le nom de l'Aléa.
	 * @return le nom de cet aléa
	 */
	public String getNom() {
		
		return this.nom;
	}
	

	/**
	 * Fournit une chaîne de caractére à propos de l'aléa
	 * @return Les informations de cet aléa
	 */
	public String toString() {
		
		return "\nCouleur: "+this.couleur+"\nNom: "+this.nom+"\nType: "+this.type+"\nGravité: "+this.gravite;
	}

}

		
		
