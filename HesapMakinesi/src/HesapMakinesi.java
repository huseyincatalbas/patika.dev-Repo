import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {
        int sayi1, sayi2, islem;
        Scanner input = new Scanner(System.in);
        System.out.print("Birinci Sayıyı Giriniz:");
        sayi1 = input.nextInt();
        System.out.print("İkinci Sayıyı Giriniz:");
        sayi2 = input.nextInt();
        System.out.print("------------------" +
                "\n Toplama İşlemi:1" +
                "\n Çıkarma İşlemi:2" +
                "\n Çarpma İşlemi:3" +
                "\n Bölme İşlemi:4" +
                "\n------------------" +
                "\n Yapılacak İşlemi Seçiniz:");
        islem = input.nextInt();

        switch (islem) {
            case 1:
                System.out.println("İşlemin Sonucu:" + (sayi1 + sayi2));
                break;
            case 2:
                System.out.println("İşlemin Sonucu:" + (sayi1 - sayi2));
                break;
            case 3:
                System.out.println("İşlemin Sonucu:" + (sayi1 * sayi2));
                break;
            case 4:
                System.out.println("İşlemin Sonucu:" + (sayi1 / sayi2));
                break;
            default:
                System.out.println("Hatalı Giriş Yaptınız...");
        }
        input.close();
    }
}
