import java.util.Scanner;

public class SayilariSiralama {
    public static void main(String[] args) {

        int sayi1, sayi2, sayi3;
        Scanner input = new Scanner(System.in);

        System.out.println("Lütfen Üç Farklı Sayı Giriniz:");
        System.out.print("Birinci Sayıyı Giriniz:");
        sayi1 = input.nextInt();
        System.out.print("İkinci Sayıyı Giriniz:");
        sayi2 = input.nextInt();
        System.out.print("Üçüncü Sayıyı Giriniz:");
        sayi3 = input.nextInt();

        if (sayi1 > sayi2 && sayi1 > sayi3) {
            if (sayi2 > sayi3) {
                System.out.println(sayi1 + " > " + sayi2 + " > " + sayi3);
            } else {
                System.out.println(sayi1 + " > " + sayi3 + " > " + sayi2);
            }
        } else if (sayi2 > sayi1 && sayi2 > sayi3) {
            if (sayi1 > sayi3) {
                System.out.println(sayi2 + " > " + sayi1 + " > " + sayi3);
            } else {
                System.out.println(sayi2 + " > " + sayi3 + " > " + sayi1);
            }
        } else {
            if (sayi1 > sayi2) {
                System.out.println(sayi3 + " > " + sayi1 + " > " + sayi2);
            } else {
                System.out.println(sayi3 + " > " + sayi2 + " > " + sayi1);
            }
        }
    }
}
