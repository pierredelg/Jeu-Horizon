package description;

import description.Alea;

public class EssaiDescription {

	public static void main(String[] args) {
		
		Description description  = new Description();
		Tache t = description.getTacheById("1");
		System.out.println(t);
		Alea a = t.getAlea(Couleur.ROUGE);
		System.out.println(a.toString());
	}

}
