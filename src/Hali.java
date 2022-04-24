public class Hali {
    private double fiyat;

    public Hali(double fiyat) {
        setFiyat(fiyat);
    }

    public double getFiyat() {
        return fiyat;
    }

    public void setFiyat(double fiyat) {
        this.fiyat = fiyat<0?0:fiyat;
    }

    @Override
    public String toString() {
        return String.format("Birim fiyatı :%5.2f",fiyat);
    }
}
