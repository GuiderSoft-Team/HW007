public class Zemin { private String aciklama;
    private double genislik;
    private double uzunluk;


    public Zemin(String aciklama, double genislik, double uzunluk) {
        this.aciklama = aciklama;
        this.genislik = genislik ;
        this.uzunluk = uzunluk ;
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
        if (genislik>0) {
            this.genislik = genislik ;
        }

    }

    public double getUzunluk() {
        return uzunluk;
    }

    public void setUzunluk(double uzunluk) {
        if (uzunluk >0) {
            this.uzunluk=uzunluk;
        }

    }

    public double alanHesapla() {
        return (genislik * uzunluk);
    }

    @Override
    public String toString() {
        return String.format(aciklama,genislik,uzunluk);
    }

}
