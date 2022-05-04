public class ChemineeAdapter implements Appareil
{
    //Attribute
    Cheminee c;


    //Constructor
    public ChemineeAdapter ()
    {
        this.c = new Cheminee();
    }

    @Override
    public void allumer() {
        int nouvelleIntensite = this.c.getLumiere() +10;
        this.c.changerIntensite(nouvelleIntensite);
    }

    @Override
    public void eteindre() {

    }

    //Methods

}
