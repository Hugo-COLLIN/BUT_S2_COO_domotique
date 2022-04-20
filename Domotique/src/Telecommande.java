import java.util.ArrayList;
import java.util.List;

public class Telecommande
{
    //Attributes
    List<Controllable> devices;
    List<Hifi> hifi;

    //Constructor
    public Telecommande(){
        this.devices = new ArrayList<Controllable>();
        this.hifi = new ArrayList<Hifi>();
    }

    //Methods
    public void ajouter(Controllable lampe){
        this.devices.add(lampe);
    }

    public void activer(int indexControllable){
        this.devices.get(indexControllable).allumer();
    }

    public void desactiver(int indexControllable){
        this.devices.get(indexControllable).eteindre();
    }

    public void activerTout(){
        for(Controllable lampe : this.devices){
            lampe.allumer();
        }
    }

    public String toString(){
        StringBuilder msg = new StringBuilder();
        if (this.devices.size() > 0) {
            for (Controllable lampe : this.devices) {
                msg.append(lampe.toString()).append("\n");
            }
        } else
            msg = new StringBuilder("La telecommande n'est reliee a aucune lampe");
        return msg.toString();
    }
}
