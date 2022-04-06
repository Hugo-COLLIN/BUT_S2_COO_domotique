public class Lampe {
    String nom;
    boolean allume;

    public Lampe(String nom){
        this.nom = nom;
        this.allume = false;
    }

    public void allumer(){
        this.allume = true;
    }

    public void eteindre(){
        this.allume = false;
    }

    public boolean isAllume(){
        return this.allume;
    }

    public String toString(){
        String msg = this.nom + " est ";
        if (this.allume)
            msg += "allumee";
        else
            msg += "eteinte";
        return msg;
    }
}
