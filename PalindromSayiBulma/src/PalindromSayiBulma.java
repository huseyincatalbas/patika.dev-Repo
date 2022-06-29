import java.util.Scanner;

public class PalindromSayiBulma {

    static String isPalindrom(int sayi) {
        int geciciSayi = sayi, tersSayi = 0, sonSayi;

        while (geciciSayi != 0) {
            sonSayi = geciciSayi % 10;
            tersSayi = tersSayi * 10 + sonSayi;
            geciciSayi = geciciSayi / 10;
        }
        return tersSayi == sayi ? sayi + " Sayısı Palindrom Sayıdır." : sayi 
        + " Sayısı Palindrom Sayı Değildir.";
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz:");
        int sayi = input.nextInt();
        System.out.println(isPalindrom(sayi));
        input.close();

    }
}