import java.util.ArrayList;
import java.util.List;

public class Telecommande
{
    //Attributes
    List<Controllable> devices;

    //Constructor
    public Telecommande()
    {
        this.devices = new ArrayList<Controllable>();
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

    public void activerTout()
    {
        for(Controllable device : this.devices)
            device.allumer();
    }

    public String toString(){
        StringBuilder msg = new StringBuilder();

        if (this.devices.size() > 0)
        {
            for (Controllable device : this.devices)
                msg.append(device.toString()).append("\n");
        }
        else
            msg = new StringBuilder("La telecommande n'est reliee a aucune lampe");

        return msg.toString();
    }
}
