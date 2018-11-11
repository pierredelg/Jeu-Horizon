package description;

/**
 * Un TypeAlea définit l'impact qu'a l'apparition d'un aléa non contré sur l'environnement d'un joueur.
 * @author Karaouzene Nagi,Badaoui Nassim,Lahousse Ludovic,Delgrange Pierre.
 *
 */
public enum TypeAlea {

	/**
	 * Impact sur le temps de réalisation d'une tâche.
	 * Chaque niveau de gravité ajoute 1 semaine.
	 */
	 DELAI,

	/**
	 * Impact sur la qualité du produit fini.
	 * Chaque niveau diminue la qualité finale de 2%
	 */
     QUALITE,

	/**
	 * Impact sur le cout.
	 * Pour chaque niveau, on déduit immédiatement 10% de la caisse.
	 */
	COUT;

}
