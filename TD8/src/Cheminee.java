/**
 * classe qui permet de modeliser une cheminee electrique
 * ce classe doit etre utilisee avec la telecommande
 *
 * ATTENTION: CONTRAINTE IMPORTANTE
 * CETTE CLASSE NE DOIT JAMAIS ETRE MODIFIEE
 * (IMAGINEZ QUE VOUS NE DISPOSEZ QUE DU .CLASS)
 */
public class Cheminee {

	/**
	 * intensite de la cheminee modulable par le variateur
	 * valeur comprise entre 0 et 100;
	 */
	int intensite;

	/**
	 * constructeur par defaut
	 * un variateur eteint
	 */
	public Cheminee()
	{
		this.intensite=0;
	}

	/**
	 * permet de changer l'intensite de la cheminee
	 * @param i nouvelle intensite de la cheminee
	 */
	public void changerIntensite(int i)
	{
		if (i>=0&&i<=100)
		this.intensite=i;
	}

	/**
	 * retourne l'intensite de la cheminee
	 * @return intensite de la cheminee
	 */
	public int getLumiere()
	{
		return this.intensite;
	}

	/**
	 * methode toString, affiche cheminee et la valeur intensite
	 * @return description de l'objet this
	 */
	public String toString()
	{
		return("cheminee: "+intensite);
	}
}