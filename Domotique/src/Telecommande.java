import java.util.ArrayList;
import java.util.List;

public class Telecommande
{
    //Attributes
    List<Lampe> lampes;
    List<Hifi> hifis;

    //Constructor
    public Telecommande()
    {
        this.lampes = new ArrayList<Lampe>();
    }

    //Methods
    public void ajouter(Lampe lampe){
        this.lampes.add(lampe);
    }

    public void ajouter(Hifi hifi) { this.hifis.add(hifi);}

    public void activerLampe(int indexLampe){
        this.lampes.get(indexLampe).allumer();
    }
    public void activerHifi(int indexHifi){
        this.hifis.get(indexHifi).allumer();
    }

    public void desactiverLampe(int indexLampe){
        this.lampes.get(indexLampe).eteindre();
    }

    public void desactiverHifi(int indexHifi){
        this.hifis.get(indexHifi).eteindre();
    }
    public void activerTout()
    {
        for(Lampe lampe : this.lampes)
            lampe.allumer();
        for(Hifi hifi : this.hifis)
            hifi.allumer();
    }

    public String toString(){
        StringBuilder msg = new StringBuilder();

        if (this.lampes.size() > 0)
        {
            for (Lampe device : this.lampes)
                msg.append(device.toString()).append("\n");
        }
        else
            msg = new StringBuilder("La telecommande n'est reliee a aucune lampe");

        return msg.toString();
    }
}
