package description;

/**
 * Représente un des aleas envisagé durant le déroulement du jeu.
 * @author Karaouzene Nagi,Badaoui Nassim,Lahousse Ludovic,Delgrange Pierre.
 *
 */
public interface Alea {

	/**
	 * Indique la gravité d'un alea. Il s'agit d'un entier.
	 * @return Le niveau de gravité de l'alea.
	 */
	public int getGravite();

	/**
	 * Indique le type d'impact de l'alea.
	 * @return Le type de l'alea.
	 */
	public TypeAlea getType();

}
