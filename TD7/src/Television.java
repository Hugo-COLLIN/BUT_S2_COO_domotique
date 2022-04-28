public class Television {
    boolean allume;

    public Television(){
        this.allume = false;
    }

    public void allumer(){
        this.allume = true;
    }

    public void eteindre(){
        this.allume = false;
    }

    @Override
    public String toString() {
        return "Television{" +
                "allume=" + allume +
                '}';
    }
}
