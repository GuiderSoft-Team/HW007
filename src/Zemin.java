public class Zemin {
    private String aciklama;
    private double genislik;
    private double uzunluk;


    public Zemin() {
    }

    public Zemin(double genislik, double uzunluk) {
        this.setGenislik(genislik);
        this.setUzunluk(uzunluk);
    }

    public Zemin(String aciklama) {
        this.aciklama = aciklama;
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
        if(genislik<=0){
            genislik=0;
        }
        this.genislik = genislik;
    }

    public double getUzunluk() {
        return uzunluk;
    }

    public void setUzunluk(double uzunluk) {
        if(uzunluk<=0){
            uzunluk=0;
        }
        this.uzunluk = uzunluk;
    }

    public double alanHesabla(){
        return uzunluk*genislik;

    }

    @Override
    public String toString() {
        return String.format("(%5.2f x %5.2f)",genislik,uzunluk );
    }
}
