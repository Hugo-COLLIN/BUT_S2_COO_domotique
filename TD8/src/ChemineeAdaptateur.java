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
        int nouvelleIntensite = this.c.getLumiere() -10;
        this.c.changerIntensite(nouvelleIntensite);
    }

    public boolean isAllume(){
        return c.intensite >= 10;
    }

    @Override
    public String toString() {
        return "ChemineeAdapter{" +
                "c=" + c +
                '}';
    }

    //Methods

}
