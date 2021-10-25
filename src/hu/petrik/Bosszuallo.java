package hu.petrik;

public abstract class Bosszuallo implements Szuperhos{
    private double szuperero;
    private boolean vanEGyengesege;

    public Bosszuallo(double szuperero, boolean vanEGyengesege) {
        this.szuperero = szuperero;
        this.vanEGyengesege = vanEGyengesege;
    }


    public boolean isVanEGyengesege() {
        return this.vanEGyengesege;
    }

    public abstract boolean megmentiAVilagot();

    @Override
    public boolean legyoziE(Szuperhos szuperhos) {
        if (((Bosszuallo)szuperhos).isVanEGyengesege() && (szuperhos.mekkoraAzEreje() < this.mekkoraAzEreje())){
            return true;
        }
        return false;
    }


    @Override
    public double mekkoraAzEreje() {
        return this.szuperero;
    }
}
