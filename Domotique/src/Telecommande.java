import java.util.ArrayList;
import java.util.List;

public class Telecommande
{
    //Attributes
    List<Lampe> lampes;
    List<Hifi> hifi;

    //Constructor
    public Telecommande(){
        this.lampes = new ArrayList<Lampe>();
        this.hifi = new ArrayList<Hifi>();
    }

    //Methods
    // >General
    public String toString(){
        StringBuilder msg = new StringBuilder();
        if (this.lampes.size() > 0) {
            for (Lampe lampe : this.lampes) {
                msg.append(lampe.toString()).append("\n");
            }
        } else
            msg = new StringBuilder("La telecommande n'est reliee a aucune lampe");
        return msg.toString();
    }


    // >Lampe
    public void ajouterLampe(Lampe lampe){
        this.lampes.add(lampe);
    }

    public void activerLampe(int indexLampe){
        this.lampes.get(indexLampe).allumer();
    }

    public void desactiverLampe(int indexLampe){
        this.lampes.get(indexLampe).eteindre();
    }

    public void activerToutLampes(){
        for(Lampe lampe : this.lampes){
            lampe.allumer();
        }
    }


}
