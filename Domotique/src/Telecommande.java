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
    public void ajouter(Lampe lampe){
        this.lampes.add(lampe);
    }

    public void activer(int indexLampe){
        this.lampes.get(indexLampe).allumer();
    }

    public void desactiver(int indexLampe){
        this.lampes.get(indexLampe).eteindre();
    }

    public void activerTout(){
        for(Lampe lampe : this.lampes){
            lampe.allumer();
        }
    }


    // >Hifi
    public void ajouterHifi(Hifi hifi){
        this.hifi.add(hifi);
    }

    public void activerHifi(int indexHifi){
        this.hifi.get(indexHifi).allumer();
    }

    public void desactiverHifi(int indexLampe){
        this.lampes.get(indexLampe).eteindre();
    }

    public void activerToutHifi(){
        for(Lampe lampe : this.lampes){
            lampe.allumer();
        }
    }


}
