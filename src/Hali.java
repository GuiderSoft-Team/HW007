public class Hali {
    private double fiyat;

    public Hali() {
    }

    public Hali(double fiyat) {
        this.fiyat = fiyat < 0 ? 0 : fiyat;
    }

    public double getFiyat() {
        return fiyat;
    }

    @Override
    public String toString() {
        return "Birim fiyatı: " + getFiyat();
    }
}
