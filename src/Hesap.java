public class Hesap {
    private Hali hali;
    private Zemin zemin;

    public Hesap(Hali hali, Zemin zemin) {
        this.hali = hali;
        this.zemin = zemin;
    }

    public Hesap() {
    }


    public Hali getHali() {
        return hali;
    }

    public void setHali(Hali hali) {
        this.hali = hali;
    }

    public Zemin getZemin() {
        return zemin;
    }

    public void setZemin(Zemin zemin) {
        this.zemin = zemin;
    }

    public double getToplamMaliyet(){
        return hali.getFiyat()*zemin.alanHesabla();
    }

    @Override
    public String toString() {
        return String.format("%6.2f", getToplamMaliyet());
    }
}
