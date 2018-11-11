package partie;

import description.*;
import strategie.*;

public class EssaiPartie {

	public static void main(String[] args) {
		
		//On initialise la partie
		
		String nomJoueur = "Ludo";		
		Description description = new Description();
		Partie maPartie = new Partie(description,new String[]{nomJoueur});
		UneVueJoueur maVueJoueur = new UneVueJoueur(nomJoueur);
		
		//On affiche les info du Joueur
		StrategieDeJeu.afficherInfo(maVueJoueur.toString());
		
		//On passe la premiere semaine
		
		Couleur couleur = description.getRandom();
		System.out.print(couleur);
		maPartie.tourSemaine(couleur);
		
		//On affiche les info du Joueur
		
		StrategieDeJeu.afficherInfo(maVueJoueur.getDuree("1")+ "");
		StrategieDeJeu.afficherInfo(maVueJoueur.toString());
		
		
		
		
		

	}

}
