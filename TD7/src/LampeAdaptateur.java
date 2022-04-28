public class LampeAdaptateur implements Appareil
{
    //Attributes
    private Lampe lampe;


    //Constructor
    public LampeAdaptateur (String n)
    {
        this.lampe = new Lampe(n);
    }


    //Methods
    public void allumer()
    {
        this.lampe.allumer();
    }

    public void eteindre()
    {
        this.lampe.eteindre();
    }

    public boolean isAllume()
    {
        return this.l.isAllume();
    }
}
