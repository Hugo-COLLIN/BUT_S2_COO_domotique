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

    public String toString() {
        String r = "";
        if (this.allume) {
            r = "On";
        } else {
            r = "Off";
        }
        return (nom + ": " + r);
    }
}
