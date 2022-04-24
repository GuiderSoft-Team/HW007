public class Hali {
    private double birimfiyat;

    public Hali(double birimfiyat) {
        this.birimfiyat = birimfiyat;
    }

    public Hali() {
    }

    public double getBirimfiyat() {
        return birimfiyat;
    }

    public void setFiyat(double birimfiyat) {
        if (birimfiyat>0) this.birimfiyat = birimfiyat;
    }

    @Override
    public String toString() {
        return String.format("Birim Fiyatı= %5.2f",birimfiyat);
    }

}
