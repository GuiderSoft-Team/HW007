public class zemin {
    private String açıklama;
    private double genişlik;
    private double uzunluk;

    public zemin(double genişlik, double uzunluk) {
        this.uzunluk=uzunluk;
        this.genişlik=genişlik;

    }
    public zemin(String açıklama){
        this.açıklama=açıklama;
    }

    public String getAçıklama() {
        return açıklama;
    }

    public void setAçıklama(String açıklama) {
        this.açıklama = açıklama;
    }

    public double getGenişlik() {
        return genişlik;
    }

    public void setGenişlik(double genişlik) {
        if (genişlik<0){
        genişlik=0;
        }
        this.genişlik = genişlik;
    }

    public double getUzunluk() {
        return uzunluk;
    }

    public void setUzunluk(double uzunluk) {
        if (uzunluk<0){
            uzunluk=0;
        }
        this.uzunluk = uzunluk;
    }
    public double alanHesapla(){
        return uzunluk*genişlik;
    }

    @Override
    public String toString() {
        return String.format("%s(%5.2f x %5.2f)",açıklama,genişlik,uzunluk);
    }
}
