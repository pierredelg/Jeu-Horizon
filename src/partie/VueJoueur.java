package partie;
import description.*;

/**L'interface VueJoueur décrit toutes les opérations que peut demander un acteur (Robot ou Joueur via son IHM) lors du jeu. Ces opérations sont formées en 3 groupes:
 * <ul>
 * 	<li>Observations des données de l'équipe:
 * 		<li>le nom (getNom()),</li>
 * 		<li>la caisse (getCaisse()),</li>
 * 		<li>le défaut de qualité (getQualite()),</li>
 * 		<li>l'identifiant de la première tâche (getDebutId()),</li>
 * 		<li>l'identifiant de la dernière tâche (getFinId()),</li>
 * 		<li>la description statique du jeu (permettant entre autre d'obtenir la liste des tâches) (getDescription()).</li>
 * 	</li>
 * 	<li>Observations des données d'une tâche. Ces méthodes ont un paramètre précisant l'identifiant de la tâche vidée.
 * 		<li>la durée de la tâche (getDuree(String)). Cette durée peut changer en fonctions des évènements et des actions du jeu,</li>
 * 		<li>le niveau de réalisation actuel (getCurrent(String)),</li>
 * 		<li>l'état de la tâche (getEtat(String) - cf Etat).</li>
 * 	</li>
 * 	<li>Les actions possible pour l'acteur.
 * 		<li>Accélération d'une tâche (setAcceleration(String, boolean)).</li>
 * 		<li>Protection contre l'événement d'une tâche setProtection(String, Couleur, boolean)).</li>
 * 		<li>Réponse à une question (Quizz).</li>
 * 	</li>
 * </ul>
 * @author Karaouzene Nagi,Badaoui Nassim,Lahousse Ludovic,Delgrange Pierre.
 */

public interface VueJoueur {
	
	/**Fournit le numéro du tour courant. Le tour 0 existe. c'est normalement un tour Jalon.
	 * 
	 * @return Le numéro du tour courant.
	 */
	public int getNumeroTour();
	
	/**Fournit le nom de l'équipe.
	 * 
	 * @return Le nom de l'équipe
	 */
	public String getNom();
	
	/**Fournit le montant actuel de la caisse de l'équipe (en euros).
	 * 	<ul>
	 * 		<li>Valeur initiale : 300€</li>
	 *		<li>Peut être augmenté (de 5€) lors des tests.</li>
	 *		<li>Est décrémenté en fonction des décisions des joueurs.</li>
	 *</ul>
	 *@return Le montant actuel de la caisse de l'équipe.
	 */

	public int getCaisse();
	
	/**Fournit la qualité actuelle du produit. La valeur initiale est de 0. Elle est décrémentée de 2 (donc 2%) selon les aleas éventuels. La qualité finale du produit est calculée à partir de la durée de réalisation du projet et du montant restant de la caisse. La qualité propre à chaque équipe sera ensuite déduite du résultat.
	 * 
	 * @return Le modificateur de qualité du produit pour l'équipe considérée.
	 */
	public int getQualite();
	
	/**Retourne l'objet permettant d'acquérir la description de la configuration de jeu.
	 * 
	 * @return L'objet contenant la description statique du jeu.
	 */
	public Description getDescription();
	
	/**Fournit la durée réelle d'une tâche pour l'équipe. Si l'aléa lié à la tâche a été déterminée la valeur retournée inclus l'aléa éventuel, sinon il s'agit de la durée minimale. Pour obtenir la durée maximale, il faut interroger l'objet Description.
	 * 
	 * @param id - L'identifiant de la tâche.
	 * @return La durée réelle d'une tâche pour l'équipe (en semaines).
	 */
	public int getDuree(String id);
	
	/**Fournit l'état d'avancement de la réalisation d'une tâche pour l'équipe (en semaines). C'est une valeur entre 0 et la durée réélle de la réalisation. Cette valeur est mise à jour par la méthode de calcul DonneesJoueur.actualisation(int temps).
	 * 
	 * @param id - L'identifiant de la tâche.
	 * @return La durée réelle de la tâche. Attention: avant le tirage de l'aléa, il s'agit de la durée initiale.
	 */
	public int getCurrent(String id);
	
	/**Fournit l'état courant de la réalisation. Directement calculée par à partie du niveau d'avancement:
	 * 	<ul>
	 * 	<li>&lt; 0 : Etat.NON_ENTAMEE ,</li>
	 *	<li>= 0 : Etat.IMMINENT ,</li>
	 *	<li>&gt; 0 et &lt; dur&eacute;e r&eacute;elle : Etat.EN_COURS,</li>
	 *	<li>&ge; dur&eacute;e r&eacute;lle : Etat.TERMINEE.</li>
	 *	</ul>
	 *
	 *@param id - L'identifiant de la tâche.
	 *@return l'état courant de la réalisation.
	 */

	public Etat getEtat(String id);
	
	/**Active ou désactive l'accélération de la tâche (réducton de 1 de la durée réelle
	 * 
	 * @param id - L'identifiant de la tâche.
	 * @param active - true pour l'activation, false pour la désactivation.
	 */
	
	public void setAcceleration(String id,boolean active);
	
	/**Active ou désactive la protection contre un alea. L'aléa est directement déduit de la tâche associée et de la couleur choisie.
	 * 
	 * @param id - L'identifiant de la tâche.
	 * @param couleur - La couleur de l'alea prévenu (ou non)
	 * @param active - vrai pour l'activation de la protection, faux pour la desactivation.
	 */
	public void setProtection(String id,Couleur couleur,boolean active);
	
	/**Fournit l'identifiant de la première tâche du PERT. Equivalent à getDescription().getDebut().getId() . Le résultat sera le même pour toutes les équipes.
	 * 
	 * @return l'identifiant de la première tâche.
	 */
	public String getDebutId();
	
	/**Fournit l'identifiant de la dernière tâche du PERT. Equivalent à getDescription().getFin().getId() Le résultat sera le même pour toutes les équipes.
	 * 
	 * @return l'identifiant de la première tâche.
	 */
	public String getFinId();
	
	/**Termine le tour pour le joueur courant. Si cette méthode n'est pas appelée, le joueur courant peut continuer à jouer et peut envoyer des ordres supplémentaires.
	 * 
	 */
	public void FinDuTour();
	
}
