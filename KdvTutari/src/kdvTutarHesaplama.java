import java.util.Scanner;

public class kdvTutarHesaplama {
    public static void main(String[] args) {

        double fiyat;
        double kdvOran;
        double kdvTutar;
        double kdvliFiyat;
        boolean kdvDurumu;

        Scanner sc=new Scanner(System.in);
        System.out.print("Ücret Tutarını Giriniz: ");
        fiyat=sc.nextDouble();

        kdvDurumu=(0<=fiyat) && (fiyat<1000);
        kdvOran=kdvDurumu ? 0.18d: 0.08d;

        System.out.println("Girilen tutar "+ kdvOran + " KDV oranında hesaplanacaktır.");

        kdvTutar=fiyat*kdvOran;
        kdvliFiyat=kdvTutar+fiyat;

        System.out.println("KDV'siz Tutar:"+fiyat);
        System.out.println("KDV oranı:"+kdvOran);
        System.out.println("KDV Tutarı:"+kdvTutar);
        System.out.println("KDV'li Tutarı:"+kdvliFiyat);

        sc.close();
    }
}