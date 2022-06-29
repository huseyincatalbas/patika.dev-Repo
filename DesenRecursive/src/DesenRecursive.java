import java.util.Scanner;

public class DesenRecursive {

    static int cikar(int sayi) {
        if (sayi <= 0)
            return sayi;
        System.out.print(sayi + " ");
        return cikar(sayi - 5);
    }

    static int topla(int cikarSayi, int sayi) {
        if (cikarSayi > sayi)
            return cikarSayi;
        System.out.print(cikarSayi + " ");
        return topla(cikarSayi + 5, sayi);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı Giriniz:");
        int sayi = input.nextInt();
        topla(cikar(sayi), sayi);
        input.close();
    }
}