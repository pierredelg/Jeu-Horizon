package description;
import java.util.Random;

/**
 * La liste des couleurs possibles. Une couleur caractérise un alea possible
 * parmi tous les aleas envisagés à chaque étape. Dans le jeu, chaque couleur
 * est liée à une probabilité d'apparition.
 * 
 * @author Karaouzene Nagi,Badaoui Nassim,Lahousse Ludovic,Delgrange Pierre.
 *
 */

public enum Couleur {

	/**
	 * 3 chances sur 6.
	 */
	ROUGE("Rouge",3), 
	
	/**
	 * 2 chances sur 6
	 */
	JAUNE("Jaune",2),

	/**
	 * 1 chance sur 6
	 */
	VERT("Vert",1);
	
	private final String nom;
	private final int valeur;
	
	private Couleur(String nom, int valeur) {

		this.nom = nom;
		this.valeur = valeur;
	}

	public String getNom() {
		return nom;
	}

	public int getValeur() {
		return valeur;
	}

	/**
	 * Cette méthode retoune la couleur en fonction des probabilités associées (Méthode Random).
	 * @return La couleur tiré au sort
	 */
	public static Couleur tirage() {

		Random rand = new Random();
		int tirage = rand.nextInt(6);
		if (tirage < 2)
			return Couleur.JAUNE;
		else
			if (tirage > 1 && tirage < 5)
				return Couleur.ROUGE;
			else
				return Couleur.VERT;
	}

}
