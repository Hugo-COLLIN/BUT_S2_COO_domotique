public class TVAdaptateur {
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

    @Override
    public String toString() {
        return "TVAdaptateur{" +
                "television=" + television +
                '}';
    }
}
