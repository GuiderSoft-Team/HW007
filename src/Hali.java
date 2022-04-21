public class Hali {
    private double fiyat;

    public Hali(double fiyat) {
        this.fiyat = fiyat<=0 ? 0 : fiyat;
    }

    public void setFiyat(double fiyat) {
        if(fiyat<0) {this.fiyat = fiyat;}
    }

    public double getFiyat(){
        return fiyat;
    }

    @Override
    public String toString() {
        return String.format("Birim fiyatı: %5.2f",fiyat);
    }
}
