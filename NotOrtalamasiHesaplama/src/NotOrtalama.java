import java.util.Scanner;

public class NotOrtalama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int matematik, fizik, kimya, turkce, tarih, muzik, ortalama;

        System.out.println("Matematik notunuzu giriniz : ");
        matematik = input.nextInt();

        System.out.println("Fizik notunuzu giriniz : ");
        fizik = input.nextInt();

        System.out.println("Kimya notunuzu giriniz : ");
        kimya = input.nextInt();

        System.out.println("Türkçe notunuzu giriniz : ");
        turkce = input.nextInt();

        System.out.println("Tarih notunuzu giriniz : ");
        tarih = input.nextInt();

        System.out.println("Müzik notunuzu giriniz : ");
        muzik = input.nextInt();

        ortalama = (matematik + fizik + kimya + turkce + tarih + muzik) / 6;

        System.out.println(ortalama >= 60 ? "Sınıfı Geçti" : "Sınıfta Kaldı");
        input.close();

    }
}