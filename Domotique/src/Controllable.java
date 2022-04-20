public interface Controllable
{
    /**
     * permet de changer l'etat interne d'une lampe en l'allumant
     */
    public void allumer();

    /**
     * permet de changer l'etat interne d'une lampe en l'eteignant
     */
    public void eteindre();

    /**
     * permet de savoir si la lampe est allumee
     *
     * @return etat de la lampe
     */
    public boolean isAllume();
}
