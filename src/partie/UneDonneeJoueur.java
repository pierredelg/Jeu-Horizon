package partie;

import java.util.ArrayList;
import java.util.Collection;

import description.*;
import strategie.Strategie;

public class UneDonneeJoueur implements DonneeJoueur{

	protected String nom;
	protected int caisse;
	protected int qualite;
	private Strategie strategie;
	protected Collection<Realisation> mesRealisations;
	protected Description description;
	
	public UneDonneeJoueur(String nom) {
		
		this.nom = nom;
		this.caisse = 300;
		this.qualite = 0;
		description = new Description();
		mesRealisations = new ArrayList<>();
		//on cree une et une seule realisation pour chaque equipe pour chaque tache du jeu
		for (Tache t : description.getTaches()) {
			mesRealisations.add(new Realisation(nom,t.getId()));
		}
	}
	@Override
	public String toString() {
		return "\nNom : " + this.nom + "\ncaisse : " + this.caisse + "\nqualite : " + this.qualite;
	}
	public Realisation getRealisation(String id) {
		
		for(Realisation r : mesRealisations) {
			if(r.getIdTache().equalsIgnoreCase(id)) {
				return r;
			}
		}
		return null;
	}

	@Override
	public void actualisation(int temps) {
		

	}
	//On multiplie le delta par deux car la qualite baisse de 2% en 2%(suivant la gravite de l'alea)
	@Override
	public void baisseQualite(int delta) {
		
		this.qualite += delta * 2;
		
	}
	public void gain(int somme) {
		
		this.caisse += somme; 
	}
	@Override
	public void depense(int somme) {
		
		this.caisse -= somme;
		
	}

	@Override
	public int getCaisse() {
		
		return this.caisse;
	}

	@Override
	public String getNom() {
		
		return this.nom;
	}

	@Override
	public int getQualite() {
		
		return this.qualite;
	}

	@Override
	public Strategie getStrategie() {
		
		return this.strategie;
	}

}
