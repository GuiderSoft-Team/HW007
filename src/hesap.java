public class hesap {
    private zemin z1;
    private halı h1;

    public hesap() {
    }
    public hesap(zemin z1,halı h1){
        this.z1=z1;
        this.h1=h1;
    }

    public zemin getZ1() {
        return z1;
    }

    public void setZ1(zemin z1) {
        this.z1 = z1;
    }

    public halı getH1() {
        return h1;
    }

    public void setH1(halı h1) {
        this.h1 = h1;
    }
    public double getToplamMaliyet(){
        return z1.alanHesapla()*h1.getFiyat();
    }

    @Override
    public String toString() {
        return String.format("toplam maliyet:%5.2f",getToplamMaliyet());
    }
}
