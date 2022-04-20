public class Zemin {
    private String aciklama;
    private double genislik;
    private double uzunluk;

    public String getStr() {
        return aciklama;
    }

    public void setStr(String str) {
        this.aciklama = str;
    }

    public double getGenislik() {
        return genislik;
    }

    public void setGenislik(double genislik) {
        this.genislik = genislik < 0 ? 0 : genislik;
    }

    public double getUzunluk() {
        return uzunluk;
    }

    public void setUzunluk(double uzunluk) {
        this.uzunluk = uzunluk < 0 ? 0 : uzunluk;
    }

    public Zemin() {
    }

    public Zemin(double genislik, double uzunluk) {
        setGenislik(genislik);
        setUzunluk(uzunluk);
    }

    public double alanHesapla() {
        return genislik * uzunluk;
    }

    @Override
    public String toString() {
        return aciklama + "(" + genislik + " x " + uzunluk + ")";
    }
}
