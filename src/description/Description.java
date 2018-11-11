package description;

import java.util.*;

/***
 * Objet qui permet d'obtenir la structure du jeu. Au moyen des éléments suivants:
 *<ul>
 *	<li>La liste des tâches,</li>
 *	<li>la liste des aleas envisagés,</li>
 *	<li>les relations entre tâches (i.e. le dessin du graphe).</li>
 *</ul>
 *@author Karaouzene Nagi,Badaoui Nassim,Lahousse Ludovic,Delgrange Pierre.
 */
public class Description{
	
	private Collection<Tache> mesTaches;
	
	/***
	 * Construit l'environnement standard pour le jeu.
	 */
	public Description() {
	
		mesTaches = new ArrayList<>();	
		UneTache t1 = new UneTache("1","réfléchir", 2, 2, 10, new UnAlea("A",TypeAlea.DELAI, 1, Couleur.ROUGE), new UnAlea("BB",TypeAlea.DELAI, 2, Couleur.JAUNE), new UnAlea("a",TypeAlea.COUT, 1, Couleur.VERT));
		UneTache t2 = new UneTache("2","dire", 3, 1, 20, new UnAlea("C",TypeAlea.DELAI, 1, Couleur.ROUGE), new UnAlea("D",TypeAlea.DELAI, 1, Couleur.JAUNE), new UnAlea("bb",TypeAlea.COUT, 2, Couleur.VERT));
		UneTache t3 = new UneTache("3","écouter", 2, 2, 10, new UnAlea("EE",TypeAlea.DELAI, 2, Couleur.ROUGE), new UnAlea("c",TypeAlea.COUT, 1, Couleur.JAUNE), new UnAlea("FF",TypeAlea.DELAI, 2, Couleur.VERT));
		UneTache t4 = new UneTache("4","faire", 2, 2, 10, new UnAlea("d",TypeAlea.COUT, 1, Couleur.ROUGE), new UnAlea("GG",TypeAlea.DELAI, 2, Couleur.JAUNE), new UnAlea("e",TypeAlea.COUT, 1, Couleur.VERT));
		UneTache t5 = new UneTache("5","demander", 1, 3, 10, new UnAlea("H",TypeAlea.DELAI, 1, Couleur.ROUGE), new UnAlea("III",TypeAlea.DELAI, 3, Couleur.JAUNE), new UnAlea("ff",TypeAlea.COUT, 2, Couleur.VERT));
		UneTache t6 = new UneTache("6","controler", 3, 1, 10, new UnAlea("J",TypeAlea.DELAI, 1, Couleur.ROUGE), new UnAlea("f",TypeAlea.COUT, 1, Couleur.JAUNE), new UnAlea("y",TypeAlea.QUALITE, 1, Couleur.VERT));
		UneTache t7 = new UneTache("7","planifier", 3, 3, 20, new UnAlea("KKK",TypeAlea.DELAI, 3, Couleur.ROUGE), new UnAlea("L",TypeAlea.DELAI, 1, Couleur.JAUNE), new UnAlea("M",TypeAlea.DELAI, 1, Couleur.VERT));
		UneTache t8 = new UneTache("8","présenter", 2, 2, 10, new UnAlea("O",TypeAlea.DELAI, 1, Couleur.ROUGE), new UnAlea("pp",TypeAlea.COUT, 2, Couleur.JAUNE), new UnAlea("zz",TypeAlea.QUALITE, 2, Couleur.VERT));
		t1.addSuccesseurs(t2);
		t1.addSuccesseurs(t3);
		t1.addSuccesseurs(t4);
		t2.addSuccesseurs(t5);
		t2.addSuccesseurs(t7);
		t3.addSuccesseurs(t5);
		t3.addSuccesseurs(t7);
		t4.addSuccesseurs(t5);
		t4.addSuccesseurs(t7);
		t5.addSuccesseurs(t6);
		t6.addSuccesseurs(t8);
		t7.addSuccesseurs(t8);
		t2.addPredecesseurs(t1);
		t3.addPredecesseurs(t1);
		t4.addPredecesseurs(t1);
		t5.addPredecesseurs(t2);
		t5.addPredecesseurs(t3);
		t5.addPredecesseurs(t4);
		t6.addPredecesseurs(t5);
		t7.addPredecesseurs(t2);
		t7.addPredecesseurs(t3);
		t7.addPredecesseurs(t4);
		t8.addPredecesseurs(t6);
		t8.addPredecesseurs(t7);
		mesTaches.add(t1);
		mesTaches.add(t2);
		mesTaches.add(t3);
		mesTaches.add(t4);
		mesTaches.add(t5);
		mesTaches.add(t6);
		mesTaches.add(t7);
		mesTaches.add(t8);
	}
		
	/***
	 * Fournit la tâche initiale (elle est unique).
	 * @return La tâche initiale.
	 */
	public Tache getDebut() {
		
		return this.getTacheById("1");
	}
	
	/***
	 * Fournit la tâche terminale (elle est unique).
	 * @return La tâche terminale.
	 */
	public Tache getFin() {
		
		return this.getTacheById("8");
	}
	
	/***
	 * Fournit une couleur d'alea au hasard (cf Couleur.tirage()).
	 * @return La couleur choisie.
	 */
	public Couleur getRandom() {
		
		return Couleur.tirage();
	}
	
	/***
	 * Fournit la tâche désignante par un identifiant donné. Si aucune tâche n'est trouvée, retourne null.
	 * @param iD - La chaîne de caractère désignant la tâche.
	 * @return L'objet Tache.
	 */
	public Tache getTacheById(String iD) {
		
		for(Tache t: mesTaches) {
			if(t.getId().equalsIgnoreCase(iD))
				return t;
		}
		return null;
	}
	
	/**
	 * Fournit l'ensemble des taches.
	 * @return Une collection comportant toutes les taches définies
	 */
	public Collection<Tache> getTaches(){
		
		return this.mesTaches;
	}
}
