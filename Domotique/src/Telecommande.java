import java.util.ArrayList;
import java.util.List;

public class Telecommande
{
    //Attributes
    List<Lampe> lampes;

    //Constructor
    public Telecommande()
    {
        this.lampes = new ArrayList<Lampe>();
    }

    //Methods
    public void ajouter(Lampe lampe){
        this.lampes.add(lampe);
    }

    public void activer(int indexLampe){
        this.lampes.get(indexLampe).allumer();
    }

    public void desactiver(int indexLampe){
        this.lampes.get(indexLampe).eteindre();
    }

    public void activerTout()
    {
        for(Lampe lampe : this.lampes)
            lampe.allumer();
    }

    public String toString(){
        StringBuilder msg = new StringBuilder();

        if (this.lampes.size() > 0)
        {
            for (Controllable device : this.lampes)
                msg.append(device.toString()).append("\n");
        }
        else
            msg = new StringBuilder("La telecommande n'est reliee a aucune lampe");

        return msg.toString();
    }
}
