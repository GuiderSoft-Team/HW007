public class Zemin {
    private String aciklama;
    private double uzunluk;
    private double genislik;

    public Zemin() {
    }

    public Zemin(double uzunluk, double genislik) {
        this.setUzunluk(uzunluk);
        this.setGenislik(genislik);
    }

    public String getAciklama() {
        return aciklama;
    }

    public void setAciklama(String aciklama) {
        this.aciklama = aciklama;
    }

    public double getUzunluk() {
        return uzunluk;
    }

    public void setUzunluk(double uzunluk) {
        if (uzunluk>0){
            this.uzunluk = uzunluk;
        }

    }

    public double getGenislik() {

        return genislik;
    }

    public void setGenislik(double genislik) {
        if (genislik>0){
            this.genislik = genislik;
        }

    }
    public double alanHesapla(){
        return uzunluk*genislik;
    }

    @Override
    public String toString() {
        return String.format("%s(%5.2fx%5.2f)",aciklama,uzunluk,genislik);
    }
}

