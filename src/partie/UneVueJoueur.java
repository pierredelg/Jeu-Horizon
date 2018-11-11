package partie;

import java.util.Collection;

import description.Couleur;
import description.Description;

public class UneVueJoueur extends UneDonneeJoueur implements VueJoueur {
	
	private int numeroTour;
	private Etat etat;
	private String numeroTache;

	public String getNumeroTache() {
		return numeroTache;
	}

	public void setNumeroTache(String numeroTache) {
		this.numeroTache = numeroTache;
	}

	public UneVueJoueur(String nom) {
		super(nom);
		this.numeroTour = 0;
		numeroTache="1";
		
	}
	
	public Collection<Realisation> getRealisations() {
		
		return super.mesRealisations;
	}

	@Override
	public int getNumeroTour() {
		
		return this.numeroTour;
	}

	@Override
	public String getNom() {
		
		return super.nom;
	}

	@Override
	public int getCaisse() {
		
		return super.caisse;
	}

	@Override
	public int getQualite() {
	
		return super.qualite;
	}

	@Override
	public Description getDescription() {
		
		return super.description;
	}

	@Override
	public int getDuree(String id) {
		
		return super.getRealisation(id).getDuree();
	}

	@Override
	public int getCurrent(String id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Etat getEtat(String id) {
		
		return etat;
	}

	@Override
	public void setAcceleration(String id, boolean active) {
		super.getRealisation(id).setAcceleration(active);
		
	}

	@Override
	public void setProtection(String id, Couleur couleur, boolean active) {
		
		if(couleur == Couleur.JAUNE) {
			super.getRealisation(id).setProtectionJaune(active);
		}
		if(couleur == Couleur.ROUGE) {
			super.getRealisation(id).setProtectionRouge(active);
		}
		if(couleur == Couleur.VERT) {
			super.getRealisation(id).setProtectionVert(active);
		}
	}

	@Override
	public String getDebutId() {
		
		return this.description.getDebut().getId();
	}

	@Override
	public String getFinId() {
	
		return this.description.getFin().getId();
	}

	@Override
	public void FinDuTour() {
		
		numeroTour ++;
		
	}
}
