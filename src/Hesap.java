public class Hesap {

    Zemin zemin;
    Hali hali;

    public Hesap(Zemin zemin, Hali hali) {
        this.zemin = zemin;
        this.hali = hali;
    }

    public double getToplamMaliyet() {
        return hali.getFiyat() * zemin.alanHesapla();
    }

    @Override
    public String toString() {
        return String.format("Toplam maliyet: %.2f", getToplamMaliyet());
    }
}
