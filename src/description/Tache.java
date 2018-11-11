package description;


import java.util.Collection;

import description.Alea;


/**
 * Représente une tâche telle que définie par la structure du jeu.
 * @author Lahousse Ludovic, Pierre Delgrange, Nagi Karaouzene, Nassim Badaoui
 *
 */

public interface Tache {
	
	/**
	 * Le cout de l'accélération en euros. Une accélération réduit la durée effective de la tâche d'une semaine. Une tâche ne peut être accélérée qu'une seule fois.
	 * @return Le cout d'accélération
	 */
	public int coutAcceleration();
	
	/**
	 * Fournit l'alea associé à une couleur pour la tâche courante. Chaque couleur détermine un alea et un seul.
	 * @param couleur
	 * @return L'alea associé à la couleur
	 * 
	 */
	public Alea getAlea(Couleur couleur);
	
	/**
	 * Fournit la description de la tâche (exemple: "Réaliser la promotion du produit"). Purement documentaire.
	 * @return La description de la tâche (de l'ordre de 10 à 30 caractères).
	 */
	public String getDescription();
	
	/**
	 * Fournit la durée initiale de la tâche. C'est la durée qu'a la tâche quand aucun alea n'est actif et que la tâche n'est pas accélérée.
	 * @return La durée initiale de la tâche
	 */
	public int getDureeInitiale();
	
	/**
	 * Fournit la durée maximale de la tâche. C'est la durée que prend la tâche quand elle n'est pas accélérée et que l'alea de type DELAI le plus grave se produit.
	 * @return La durée maximale de la tâche
	 */
	public int getDureeMax();
	
	/**
	 * Donne l'identifiant de la tâche. Toute tâche a un identifiant et un seul. Un identifiant désigné ne désigne pas plus d'une tâche.
	 * @return La tâche désignée
	 */
	public String getId();
	
	/**
	 * Fournit la liste des tâches précédentes. La tâche courante ne peut pas être entamée tant que toutes les tâches précédentes n'ont pas été achevées.
	 * @return La collection des tâches précédentes. La tâche initiale retourne une liste vide.
	 */
	public Collection<Tache> getPredecesseurs();
	
	/**
	 * Fournit la liste des tâches suivantes. La fin de la tâche courante peut éventuellement permettre le commencement de chacune des tâches suivantes à conditions que tous leurs prédécesseurs respectifs soit terminés.
	 * @return La liste des tâches suivantes. La tâche terminale retourne une liste vide.
	 */
	public Collection<Tache> getSuccesseurs();

	
}
