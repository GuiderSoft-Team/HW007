public class Zemin { private String aciklama;
    private double genislik;
    private double uzunluk;


    public Zemin(String aciklama, double genislik, double uzunluk) {
        this.aciklama = aciklama;
        this.genislik = genislik <= 0 ? 0 : genislik;
        this.uzunluk = uzunluk <= 0 ? 0 : uzunluk;
    }


    public String getAciklama() {
        return aciklama;
    }

    public void setAciklama(String aciklama) {
        this.aciklama = aciklama;
    }

    public double getGenislik() {
        return genislik;
    }

    public void setGenislik(double genislik) {
        this.genislik = genislik;
    }

    public double getUzunluk() {
        return uzunluk;
    }

    public void setUzunluk(double uzunluk) {
        this.uzunluk = uzunluk;
    }

    public double alanHesapla() {
        return (genislik * uzunluk);
    }

    @Override
    public String toString() {
        return String.format("%s (%.2f x %.2f)",aciklama,genislik,uzunluk);
    }

}
