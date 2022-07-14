public class halı {

private double fiyat;
public halı(double fiyat){
    setFiyat(fiyat);
}

    public double getFiyat() {
        return fiyat;
    }

    public void setFiyat(double fiyat) {
   if (fiyat<0){
       fiyat=0;
    }
        this.fiyat = fiyat;
    }

    @Override
    public String toString() {
        return String.format("birim fiyatı :%5.2f",fiyat);
    }
}
