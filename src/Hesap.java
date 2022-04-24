public class Hesap {

    private Zemin zemin;
    public Hali hali;

    public Hesap(Zemin zemin, Hali hali) {
        this.zemin = zemin;
        this.hali = hali;
    }
    public Hesap() {
    }
    public double getToplamMaliyet(){
        return zemin.alanHesapla() * hali.getBirimfiyat();
    }
}
