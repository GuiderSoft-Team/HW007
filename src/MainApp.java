public class MainApp {
    public static void main(String[] args) {
        Hali hali=new Hali(4.5);
        Zemin zemin=new Zemin(4.8,9.1);
        Hesap hesap=new Hesap(hali,zemin);
        System.out.println("Toplam Maliyet  :"+hesap.getToplamMaliyet());

        hali=new Hali(1.5);
        zemin=new Zemin(5.4,4.5);
        hesap=new Hesap(hali,zemin);
        System.out.println("Toplam Maliyet  :"+hesap.getToplamMaliyet());




    }
}
