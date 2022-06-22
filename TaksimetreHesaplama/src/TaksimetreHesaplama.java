import java.util.Scanner;

public class TaksimetreHesaplama {
    public static void main(String[] args) {

        double kilometre;
        double kilometreBasinaTutar=2.20;
        double taksimetreAcilisTutar=10;
        double toplamTutar;

        Scanner input=new Scanner(System.in);

        System.out.print("Mesafeyi km Cinsinde Giriniz: ");
        kilometre=input.nextDouble();

        toplamTutar=kilometreBasinaTutar*kilometre +taksimetreAcilisTutar;
        toplamTutar=(toplamTutar<20) ? 20: toplamTutar;

        System.out.println("Gidilen Mesafe(km):"+kilometre);
        System.out.println("Taksimetre Açılış Ücreti:"+taksimetreAcilisTutar);
        System.out.println("Ödenecek Toplam Tutar:"+toplamTutar);

        input.close();
    }
}