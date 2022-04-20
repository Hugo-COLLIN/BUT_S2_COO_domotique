public class Lampe implements Controllable
{
    //Attributes
    /**
     * nom de la lampe
     */
    private String nom;

    /**
     * etat de la lampe
     */
    private boolean allume;


    //Constructors
    /**
     * construit une lampe eteinte par defaut
     *
     * @param nom
     *            nom de la lampe
     */
    public Lampe(String nom){
        this.nom = nom;
        this.allume = false;
    }

    //Methods
    /**
     * permet de changer l'etat interne d'une lampe en l'allumant
     */
    public void allumer(){
        this.allume = true;
    }

    /**
     * permet de changer l'etat interne d'une lampe en l'eteignant
     */
    public void eteindre(){
        this.allume = false;
    }

    /**
     * permet de savoir si la lampe est allumee
     *
     * @return etat de la lampe
     */
    public boolean isAllume(){
        return this.allume;
    }

    /**
     * retourne le descriptif de la lampe sous la forme nom + "On"/"Off"
     */
    public String toString() {
        String r = "";
        if (this.allume) {
            r = "On";
        } else {
            r = "Off";
        }
        return (nom + ": " + r);
    }
}
