public class Television {
    private boolean allume;

    public Television(){
        this.allume = false;
    }

    public void allumer(){
        this.allume = true;
    }

    public void eteindre(){
        this.allume = false;
    }

    public boolean isAllumer(){
        return this.allume;
    }

    @Override
    public String toString() {
        return "Television{" +
                "allume=" + allume +
                '}';
    }
}
