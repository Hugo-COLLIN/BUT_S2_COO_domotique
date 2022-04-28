public class TVAdaptateur implements Appareil {
    Television television;

    public TVAdaptateur(){
        this.television = new Television();
    }

    public void allumer(){
        this.television.allumer();
    }

    public void eteindre(){
        this.television.eteindre();
    }

    public boolean isAllumer(){
        return this.television.isAllumer();
    }

    @Override
    public String toString() {
        return "TVAdaptateur{" +
                "television=" + television +
                '}';
    }
}
