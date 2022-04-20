public class Hali {

    private double fiyat;

    public Hali(double fiyat) {
        this.fiyat = fiyat <=0 ? 0 : fiyat;
    }

    public double getFiyat() {
        return fiyat;
    }

    @Override
    public String toString() {
        return String.format("Birim Fiyatı : %5.2f ",fiyat);
    }

}

