package description;

import java.util.*;

import description.Alea;

public class UneTache implements Tache {
	
	private String Id;
	private String description;
	private int duree;
	private int retard;
	private int coutAcceleration;
	private Alea alea1;
	private Alea alea2;
	private Alea alea3;
	private Collection<Tache>predecesseurs;
	private Collection<Tache>successeurs;
	

	/**
	 * Construit une Tache
	 * @param Id
	 * @param description
	 * @param duree
	 * @param retard
	 * @param coutAcceleration
	 * @param rouge
	 * @param jaune
	 * @param vert
	 */
	public UneTache(String Id, String description, int duree, int retard, int coutAcceleration, Alea rouge, Alea jaune, Alea vert) {
		this.Id = Id;
		this.description = description;
		this.duree = duree;
		this.retard = retard;
		this.coutAcceleration = coutAcceleration;
		this.alea1 = rouge;
		this.alea2 = jaune;
		this.alea3 = vert;
		predecesseurs = new ArrayList<>();
		successeurs = new ArrayList<>();
	}
	
	/**
	 * Le cout de l'accélération en euros. Une accélération réduit la durée effective de la tâche d'une semaine. Une tâche ne peut être accélérée qu'une seule fois.
	 * @return Le cout d'accélération de la tâche
	 */
	@Override
	public int coutAcceleration() {
		
		return this.coutAcceleration;
	}
	
	/**
	 * Fournit l'alea associé à une couleur pour la tâche courante. Chaque couleur détermine un alea et un seul.
	 * @param couleur - La couleur déterminante
	 * @return L'alea associé à la couleur
	 */
	@Override
	public Alea getAlea(Couleur couleur) {
		
		if(couleur.name().equalsIgnoreCase("Rouge")){
			return this.alea1;
		}
		else {
			if(couleur.name().equalsIgnoreCase("Jaune")){
				return this.alea2;
			}
			else {
				return this.alea3;
			}
		}
	}

	/**
	 * Fournit la description de la tâche.
	 * @return La description de la tâche 
	 */
	@Override
	public String getDescription() {
		
		return this.description;
	}

	/**
	 * Fournit la durée initiale de la tâche. C'est la durée qu'a la tâche quand aucun alea n'est actif et que la tâche n'est pas accélérée.
	 * @return La durée initiale de la tâche.
	 */
	@Override
	public int getDureeInitiale() {
		
		return this.duree;
	}

	/**
	 * Fournit la durée maximale de la tâche. C'est la durée que prend la tâche quand elle n'est pas accélérée et que l'alea de type DELAI le plus grave se produit.
	 *@return  La durée maximale de la tâche
	 */
	@Override
	public int getDureeMax() {
		
		return this.getDureeInitiale()+this.retard;
	}
	
	/**
	 * Modifie la duree initiale de la tâche en fonction de l'alea delai
	 * @param gravite
	 */
	public void setDureeInitiale(int gravite) {
		
		this.duree += gravite;
	}

	/**
	 * Donne l'identifiant de la tâche. Toute tâche a 1 identifiant et un seul. Un identifiant désigne ne désigne pas plus d'une tâche.
	 *@return  L'identifiant de la tâche désignée
	 */
	@Override
	public String getId() {
		
		return this.Id;
	}

	/**
	 * Fournit la liste des tâches précédentes. La tâche courante ne peut pas être entamée tant que toutes les tâches précédentes n'ont pas été achevées.
	 *@return  La collection des tâches précédentes. La tâche initiale retourne une liste vide.
	 */
	@Override
	public Collection<Tache> getPredecesseurs() {
	
		return this.predecesseurs;
	}

	/**
	 * Fournit la lliste des tâches suivantes. La terminaison de la tâche courante peut éventuellement permettre le commencement de chacune des tâches suivantes à conditions que tous leurs prédécesseurs respectifs soit terminés.
	 *@return  La liste des tâches suivante. La tâche terminale retourne une liste vide.
	 */
	@Override
	public Collection<Tache> getSuccesseurs() {
		
		return this.successeurs;
	}
	
	/**
	 * Méthode permettant d'ajouter un predecesseur (Tache)
	 * @param t
	 */
	public void addPredecesseurs(Tache t) {
		
		this.predecesseurs.add(t);
	}
	
	/**
	 * Méthode permettant d'ajouter un successeur (Tache)
	 * @param t
	 */
	public void addSuccesseurs(Tache t) {
		
		this.successeurs.add(t);
	}
	
	/**
	 * Fournit les informations sur une Tâche
	 * @return Les données de la Tâche
	 */
	public String toString() {
		
		return "Tâche numéro: "+this.Id+"\nDescription: "+this.description+"\nDuréé prévue: "+this.duree+" semaines\nRetard éventuel: "
				+this.retard+" semaines\nCout accélération: "+this.coutAcceleration+" euros\nAléa de cette Tâche:\n"+this.alea1
				+"\n"+this.alea2+"\n"+this.alea3;
	}

	
}


		
