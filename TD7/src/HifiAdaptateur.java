public class HifiAdaptateur implements Appareil
{
    Hifi hifi;

    public HifiAdaptateur(){
        this.hifi = new Hifi();
    }

    public void allumer(){
        this.hifi.allumer();
    }

    public void eteindre(){
        this.hifi.eteindre();
    }

    @Override
    public String toString() {
        return "HifiAdaptateur{" +
                "hifi=" + hifi +
                '}';
    }
}
