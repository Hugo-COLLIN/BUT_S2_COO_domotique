import java.util.ArrayList;
import java.util.List;

public class Telecommande {
    List<Lampe> lampes;

    public Telecommande(){
        this.lampes = new ArrayList<Lampe>();
    }

    public void ajouterLampe(Lampe lampe){
        this.lampes.add(lampe);
    }

    public void activerLampe(int indexLampe){
        this.lampes.get(indexLampe).allumer();
    }

    public void desactiverLampe(int indexLampe){
        this.lampes.get(indexLampe).eteindre();
    }

    public void activerTout(){
        for(Lampe lampe : this.lampes){
            lampe.allumer();
        }
    }

    public String toString(){
        String msg = "";
        if (this.lampes.size() > 0) {
            for (Lampe lampe : this.lampes) {
                msg += lampe.toString() + "\n";
            }
        } else
            msg = "La telecommande n'est reliee a aucune lampe";
        return msg;
    }
}
