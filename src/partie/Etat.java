package partie;

public enum Etat {

	
	/**
	 * Le réalisation est en cours. Le temps courant est strictement positif mais inférieur à la durée réelle de la tâche.
	 */
	EN_COURS,
	
	
	/**
	 *La réalisation n'est pas encore entamée mais toutes les conditions sont respectées pour un démarrage immédiat.
	 */
	IMMINENT,
	
	
	/**
	 * La réalisation n'est pas encore entamée. (Le temps courant de réalisation est nul).
	 */
	NON_ENTAMEE,
	
	
	/**
	 * La réalisation est terminée. Le temps courant de la tâche est égal à sa durée.
	 */
	TERMINEE;
	
	
}
