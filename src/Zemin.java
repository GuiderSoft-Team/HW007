public class Zemin {

    private String aciklama;
    private double genislik;
    private double uzunkluk;

    public Zemin(String aciklama, double genislik, double uzunkluk) {
        this.aciklama = aciklama;
        this.genislik = genislik <=0 ? 0 : genislik;
        this.uzunkluk = uzunkluk <=0 ? 0 : uzunkluk;
    }

    public double alanHesapla(){
        return genislik*uzunkluk;
    }


    @Override
    public String toString() {
        return String.format("%s ( %5.2f x %5.2f )",aciklama,genislik,uzunkluk);
    }

}
