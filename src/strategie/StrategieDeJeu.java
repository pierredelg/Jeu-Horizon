package strategie;

import javax.swing.JOptionPane;

import partie.UneVueJoueur;
import partie.VueJoueur;

public class StrategieDeJeu implements Strategie {
	
	public StrategieDeJeu() {
		
		
	}
	
	@Override
	public void jouerEtape(VueJoueur vue) {
		UneVueJoueur vueJoueur = (UneVueJoueur)vue;
		int nombrePassage = 1;
		String id = vueJoueur.getNumeroTache();
		while(nombrePassage <= vueJoueur.getDuree(id)) {
			nombrePassage ++;
		}
		
		
	}

	@Override
	public void jouerJalon(VueJoueur vue) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void jouerTest(VueJoueur vue) {
		// TODO Auto-generated method stub
		
	}
	public static void afficherInfo(String message) {
		
		JOptionPane.showMessageDialog(null,message,"Information sur le joueur",JOptionPane.INFORMATION_MESSAGE);
	}
	

}
