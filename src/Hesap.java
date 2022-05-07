public class Hesap {

    Zemin zemin;
    Hali  hali;

    public Hesap(Zemin zemin, Hali hali) {
        this.zemin = zemin;
        this.hali = hali;
    }

    public Hesap() {
    }

    public Zemin getZemin() {
        return zemin;
    }

    public void setZemin(Zemin zemin) {
        this.zemin = zemin;
    }

    public Hali getHali() {
        return hali;
    }

    public void setHali(Hali hali) {
        this.hali = hali;
    }

    public double getToplamMaliyet(){
        return hali.getFiyat()*zemin.alanHesapla();
    }

    @Override
    public String toString() {
        return "Toplam maliyet : "+getToplamMaliyet();
    }

}
