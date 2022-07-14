public class MainApp {
    public static void main(String[] args) {
        halı hali = new halı(3.5);
        zemin zemin = new zemin(2.75, 4.0);
        hesap hesap = new hesap(zemin, hali);
        System.out.println(hesap);
        hali = new halı(1.5);
        zemin = new zemin(5.4, 4.5);
        hesap = new hesap(zemin, hali);
        System.out.println(hesap);
    }
}
