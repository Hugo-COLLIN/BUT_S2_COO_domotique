import java.util.ArrayList;
import java.util.List;

public class Telecommande
{
    //Attributes
    List<Appareil> devices;

    //Constructor
    public Telecommande()
    {
        this.devices = new ArrayList<Appareil>();
    }

    //Methods
    public void ajouterAppareil(Appareil appareil){
        this.devices.add(appareil);
    }

    public void activerAppareil(int indexAppareil){
        this.devices.get(indexAppareil).allumer();
    }


    public void desactiverAppareil(int indexAppareil){
        this.devices.get(indexAppareil).eteindre();
    }


    public void activerTout()
    {
        for(Appareil device : this.devices)
            device.allumer();
    }

    public String toString(){
        StringBuilder msg = new StringBuilder();

        if (this.devices.size() > 0)
        {
            for (Appareil device : this.devices)
                msg.append(device.toString()).append("\n");
        }
        else
            msg = new StringBuilder("La telecommande n'est reliee a aucun appareil.");

        return msg.toString();
    }
}
