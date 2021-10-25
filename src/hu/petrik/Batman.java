package hu.petrik;

public class Batman implements Szuperhos, Milliardos{
    private double lelemenyesseg;

    public Batman(double lelemenyesseg) {
        this.lelemenyesseg = 100;
    }

    @Override
    public void kutyutKeszit() {
        this.lelemenyesseg += 50;
    }

    @Override
    public boolean legyoziE(Szuperhos szuperhos) {
        if(szuperhos.mekkoraAzEreje() < lelemenyesseg){
            return true;
        }
        return false;
    }

    @Override
    public double mekkoraAzEreje() {
        return lelemenyesseg * 2;
    }

    @Override
    public String toString() {
        return String.format("Batman:\nLeleményessége: %d", this.lelemenyesseg);
    }
}
