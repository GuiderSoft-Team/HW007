public class Zemin {
    private String aciklama;
    private double genislik;
    private double uzunluk;

    public Zemin(double genislik, double uzunluk) {
        setGenislik(genislik);
        setUzunluk(uzunluk);
    }
    public Zemin() {
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
        this.genislik = genislik<0?0.0:genislik;

    }
    public double getUzunluk() {
        return uzunluk;
    }
    public void setUzunluk(double uzunluk) {
        this.uzunluk = uzunluk<0?0.0:uzunluk;
    }
    public double alanHesapla(){
        return genislik*uzunluk;
    }

    @Override
    public String toString() {
        return String.format("-".repeat(23)+"\n*** Genel Bilgiler ***\n"+aciklama+"\t"+genislik+" x "+uzunluk+"\nAlanı\t"+alanHesapla()+"\n"+"-".repeat(23));
    }
}
