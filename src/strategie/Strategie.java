package strategie;
import partie.VueJoueur;

/**
 * Cette interface décrit les méthodes que peut employer le moteur du jeu pour obtenir les décisions du joueur. Les classes concrètes implémentent cette interface pourront représenter
 *<ul>
 *   <li>un joueur simple avec une IHM texte</li>
 *   <li>un joueur avec une IHM graphique</li>
 *   <li>une intelligence artificielle</li>
 *   <li>un joueur sur le réseau</li>
 *</ul>
 *
 * @author Ludovic Lahousse, Pierre Delgrange, Nassim Badaoui, Nagi Karaouzéne
 *
 */

public interface Strategie {

	
	/**
	 * Saisie des décisions d'accélération et de protection.
	 * @param vue - L'interface du jeu
	 */
	public void jouerEtape(VueJoueur vue);
	
	
	/**
	 * Validation d'un tour simple.
	 * @param vue - L'interface du jeu
	 */
	public void jouerJalon(VueJoueur vue);
	
	
	/***
	 * Réponse à un quizz.
	 * @param vue - L'interface du jeu
	 */
	public void jouerTest(VueJoueur vue);
	
	
	
}
