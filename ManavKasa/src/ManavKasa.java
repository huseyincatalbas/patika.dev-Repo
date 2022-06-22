import java.util.Scanner;

public class ManavKasa {
    public static void main(String[] args) {

        double muzFiyat = 0.95;
        double patlicanFiyat = 5.00;
        double armutFiyat = 2.14;
        double elmaFiyat = 3.67;
        double domatesFiyat = 1.11;

        double domatesKg;
        double muzKg;
        double patlicanKg;
        double armutKg;
        double elmaKg;

        double Tutar;

        Scanner input = new Scanner(System.in);

        System.out.print("Armutun Kilonuzu Giriniz (kg): ");
        armutKg = input.nextDouble();
        System.out.print("Elmanın Kilonuzu Giriniz (kg): ");
        elmaKg = input.nextDouble();
        System.out.print("Domates Kilonuzu Giriniz (kg): ");
        domatesKg = input.nextDouble();
        System.out.print("Muzun Kilonuzu Giriniz (kg): ");
        muzKg = input.nextDouble();
        System.out.print("Patlıcanın Kilonuzu Giriniz (kg): ");
        patlicanKg = input.nextDouble();

        Tutar = armutFiyat * armutKg + elmaFiyat * elmaKg + domatesFiyat * domatesKg
                + muzFiyat * muzKg + patlicanFiyat * patlicanKg;

        System.out.println("Armudun Fiyatı:" + armutFiyat + " ve Kilosu:" + armutKg);
        System.out.println("Elmanın Fiyatı:" + elmaFiyat + " ve Kilosu:" + elmaKg);
        System.out.println("Domatesin Fiyatı:" + domatesFiyat + " ve Kilosu:" + domatesKg);
        System.out.println("Muzun Fiyatı:" + muzFiyat + " ve Kilosu:" + muzKg);
        System.out.println("Patlıcanın Fiyatı:" + patlicanFiyat + " ve Kilosu:" + patlicanKg);
        System.out.println("Toplam Tutar:" + Tutar);

        input.close();
    }
}