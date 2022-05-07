public class Hali {

    private double fiyat;

    public Hali(double fiyat) {
        this.fiyat = fiyat<0?0:fiyat;
    }

    public Hali() {
    }

    public double getFiyat() {
        return fiyat;
    }

    public void setFiyat(double fiyat) {
        this.fiyat = fiyat;
    }

    @Override
    public String toString() {
        return "Birim fiyatı : "+fiyat;
    }

}
