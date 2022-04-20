public class Hesap {
    private Zemin zemin;
    private Hali hali;

    public Hesap(Zemin zemin, Hali hali) {
        this.zemin = zemin;
        this.hali = hali;
    }

    double getToplamMaliyet()
    {
      return   hali.getPrice()*zemin.getHeight()*zemin.getWidth();
    }

    @Override
    public String toString() {
        return "toplam maliyet: "+getToplamMaliyet();
    }
}
