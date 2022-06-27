import java.util.Scanner;

public class EbobEkokBulma {
    public static void main(String[] args) {

        int sayi1, sayi2, kSayi, bSayi;

        Scanner input = new Scanner(System.in);
        System.out.print("Birinci sayıyı giriniz: ");
        sayi1 = input.nextInt();
        System.out.print("İkinci sayıyı giriniz:");
        sayi2 = input.nextInt();

        if (sayi1 > sayi2) {
            kSayi = sayi2;
            bSayi = sayi1;
        } else {
            kSayi = sayi1;
            bSayi = sayi2;
        }

        for (int i = kSayi; i >= 1; i--) {
            if (sayi1 % i == 0 && sayi2 % i == 0) {
                System.out.println("EBOB: " + i);
                break;
            }
        }

        for (int i = bSayi; i <= sayi1 * sayi2; i++) {
            if (i % sayi1 == 0 && i % sayi2 == 0) {
                System.out.println("EKOK: " + i);
                break;
            }
        }
        input.close();
    }
}