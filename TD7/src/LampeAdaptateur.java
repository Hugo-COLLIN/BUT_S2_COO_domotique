public class LampeAdaptateur implements Appareil
{
    //Attributes
    private Lampe l;


    //Constructor
    public LampeAdaptateur (String n)
    {
        this.l = new Lampe(n);
    }


    //Methods
    public void allumer()
    {
        this.l.allumer();
    }

    public void eteindre()
    {
        this.l.eteindre();
    }
}
