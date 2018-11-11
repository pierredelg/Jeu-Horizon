package partie;

import description.Description;

public class Realisation{
	
	private String nomEquipe;
	private String idTache;
	private int duree;
	private Description description;
	private boolean protectionRouge;
	private boolean protectionVert;
	private boolean protectionJaune;
	private boolean acceleration;
		
	public Realisation(String nomEquipe,String idTache) {
		this.nomEquipe = nomEquipe;
		this.idTache = idTache;
		this.description = new Description();
		this.duree=description.getTacheById(idTache).getDureeInitiale();
		this.protectionJaune = false;
		this.protectionRouge = false;
		this.protectionVert = false;
		this.acceleration = false;
	}

	public String getNomEquipe() {
		return nomEquipe;
	}

	public String getIdTache() {
		return idTache;
	}

	public int getDuree() {
		
		return this.duree;
	}
	public boolean getProtectionRouge() {
		return protectionRouge;
	}

	public void setProtectionRouge(boolean protectionRouge) {
		this.protectionRouge = protectionRouge;
	}

	public boolean getProtectionVert() {
		return protectionVert;
	}

	public void setProtectionVert(boolean protectionVert) {
		this.protectionVert = protectionVert;
	}

	public boolean getProtectionJaune() {
		return protectionJaune;
	}

	public void setProtectionJaune(boolean protectionJaune) {
		this.protectionJaune = protectionJaune;
	}

	public boolean getAcceleration() {
		return acceleration;
	}

	public void setAcceleration(boolean acceleration) {
		this.acceleration = acceleration;
		if (acceleration) {
			
			setDuree(-1);
		}
	}

	public void setDuree(int retard) {
		
		this.duree += retard; 
	}
}
