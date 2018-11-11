package partie;

import strategie.*;

/**
 *Représentation de l'état d'une équipe au cours de la partie. 'état est complètement décrit par:
 *<ul>
 *	<li>Le montant de la caisse (300 € au départ),</li>
 *	<li>La qualité du produit (0% au départ),</li>
 *	<li>L'ensemble des Realisation pour cette équipe.</li>
 *</ul>
 *		A l'initialisation une réalisation (et une seule) est créée pour chaque tâche définie dans le jeu. Par la suite, les réalisations de chaque équipe évoluent indépendamment les une des autres (en fonction du choix des joueurs et des évènements.
 *		nb. Comme chaque tâche est identifiée par un id (String), Toute réalisation est déterminée par l'équipe concernée et l'id de la tâche correspondante (@link #getRealisation(String)).
 *	
 *Les méthodes uneSemaine() et getGraphe() ont été supprimées car non imposées dans le projet.
 * @author Lahousse Ludovic, Pierre Delgrange, Nagi Karaouzene, Nassim Badaoui
 *
 */
public interface DonneeJoueur {
	
	/** Méthode de calcul du niveau d'avancement d'un projet. Le calcul est effectué pour toutes les réalisations (tâches) du projet.
	 * 
	 * @param temps - le numéro de semaine du calendrier (0 = semaine de démarage du projet)
	 */

 	public void actualisation(int temps);
 	
 	public void baisseQualite(int delta);
 	
 	public void depense(int somme); 
 	
 	/** Fournit le montant actuel de la caisse de l'équipe (en euros).
 	 * <ul>
 	 * 	<li>Valeur initiale : 300€</li>
 	 * 	<li>Peut être augmenté (de 5€) lors des tests.</li>
 	 * 	<li>Est décrémenté en fonction des décisions des joueurs.</li>
 	 * </ul>
 	 * @return Le montant actuel de la caisse de l'équipe.
 	 */
 	
 	public int getCaisse();
 	
 	/** Fournit le nom de l'équipe.
 	 * 
 	 * @return le nom de l'équipe.
 	 */
 	public String getNom();
 	
 	/**Fournit la qualité actuelle du produit. La valeur initiale est de 0. Elle est décrémentée de 2 (donc 2%) selon les aleas éventuels. La qualité finale du produit est calculée à partir de la durée de réalisation du projet et du montant restant de la caisse. La qualité propre à chaque équipe sera ensuite déduite du résultat.
 	 * 
 	 * @return Le modificateur de qualité du produit pour l'équipe considérée.
 	 */
 	
 	public int getQualite();
 	
 	/**
 	 * @param id - L'identifiant de la tâche réalisée.
 	 * @return La réalisation de la tâche (pour l'équipe courante).
 	 */
 	
 	public Realisation getRealisation(String id);
 	
 	/**Fournit l'objet qui prend les décisions pour l'équipe. Ce peut être une IHM ou un robot.
 	 * 
 	 * @return IHM ou Robot (implement Strategie)
 	 */
 	
 	public Strategie getStrategie();
}
