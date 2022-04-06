/**
 * classe qui represente une chaine hifi
 */
class Hifi {

	/**
	 * l'intensite du son de la chaine on suppose que la chaine est eteinte si
	 * le son vaut 0
	 */
	private int son = 0;

	/**
	 * permet d'allumer ou d'augmenter le son de la chaine
	 */
	public void allumer() {
		this.son += 10;
		// son maximum
		if (this.son > 100)
			this.son = 100;
	}

	/**
	 * permet d'eteindre la chaine (son mis a 0)
	 */
	public void eteindre() {
		this.son = 0;

	}

	/**
	 * surcharge de la methode affichage sous la forme "Hifi:10"
	 * 
	 * @return descriptif sous forme de chaine
	 */
	public String toString() {
		String r = "";
		r += "Hifi:" + son;
		return (r);
	}
}