package partie;

import java.util.ArrayList;
import java.util.List;

import description.*;


public class Partie{

	protected Description description;
	protected List<UneDonneeJoueur> mesDonneesJoueurs;
	protected int numeroTour;
	 
	
	
	public Partie(Description description, String[] noms) {
		
		this.description = description;
		numeroTour = 1;
		this.mesDonneesJoueurs = new ArrayList<>();
		for(String a: noms) 
			this.mesDonneesJoueurs.add(new UneDonneeJoueur(a));		
	}

	public UneDonneeJoueur getVueJoueur(String nomJoueur) {
		
		if(nomJoueur != null) {
			for(UneDonneeJoueur d: mesDonneesJoueurs) {
				if(nomJoueur.equals(d.getNom())) {
					return d;
				}
			}
		}
		return null;
	}

	public void passerTour() {
		
		numeroTour ++;
		
		
	}
	/*public TypeAlea getTypeAlea(Couleur couleur) {
		
		return description.getTacheById(numeroTour + "").getAlea(couleur).getType();
	}*/

	public void tourSemaine(Couleur couleur) {
		
		String numeroTache= numeroTour + "";
		
		Tache tache = description.getTacheById(numeroTache);
		
		Alea alea = tache.getAlea(couleur);
		
		TypeAlea typeAlea = alea.getType();
		
		for(UneDonneeJoueur d : mesDonneesJoueurs) {
			
			if(typeAlea == TypeAlea.DELAI) {
				
				d.getRealisation(numeroTache).setDuree(alea.getGravite());
				
			}
			if(typeAlea == TypeAlea.COUT) {
			
				d.depense(10*alea.getGravite());
				
			
			}
			if(typeAlea == TypeAlea.QUALITE) {
			
				d.baisseQualite(alea.getGravite());
			}
	
		}
		
	}
	public void tourJalon() {
		
	}

}
