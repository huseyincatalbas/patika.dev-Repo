import java.util.Scanner;

public class SinifGecme {
    public static void main(String[] args) {

        int matematik, fizik, turkce, kimya, muzik;
        double notOrtalama = 0;
        int sayac = 0,toplam = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("Matematik Notunu Giriniz: ");
        matematik = input.nextInt();
        if (0 <= matematik && matematik <= 100) {
            toplam += matematik;
            sayac++;
        } else {
            System.out.print("Geçersiz Değer Aralığında Bir Not Girdiniz.");
        }

        System.out.print("Fizik Notunu Giriniz: ");
        fizik = input.nextInt();
        if (0 <= fizik && fizik <= 100) {
            toplam += fizik;
            sayac++;
        } else {
            System.out.print("Geçersiz Değer Aralığında Bir Not Girdiniz.");
        }

        System.out.print("Türkçe Notunu Giriniz: ");
        turkce = input.nextInt();
        if (0 <= turkce && turkce <= 100) {
            toplam += turkce;
            sayac++;
        } else {
            System.out.print("Geçersiz Değer Aralığında Bir Not Girdiniz.");
        }

        System.out.print("Kimya Notunu Giriniz: ");
        kimya = input.nextInt();
        if (0 <= kimya && kimya <= 100) {
            toplam += kimya;
            sayac++;
        } else {
            System.out.print("Geçersiz Değer Aralığında Bir Not Girdiniz.");
        }

        System.out.print("Müzik Notunu Giriniz: ");
        muzik = input.nextInt();
        if (0 <= muzik && muzik <= 100) {
            toplam += muzik;
            sayac++;
        } else {
            System.out.print("Geçersiz Değer Aralığında Bir Not Girdiniz.");
        }

        notOrtalama = toplam / sayac;

        if (notOrtalama < 55) {
            System.out.println("Sınıfta Kaldınız.");
        } else {
            System.out.println("Sınıftı Geçtiniz.");
        }
        System.out.print("Ortalama : " + notOrtalama);
        input.close();
    }
}