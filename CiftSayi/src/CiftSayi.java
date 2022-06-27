import java.util.Scanner;

public class CiftSayi {
    public static void main(String[] args) {

        int sayi, sayac=0;

        Scanner sc=new Scanner(System.in);
        System.out.println("Bir sayı Giriniz");
        sayi=sc.nextInt();

        while (sayac<=sayi){
            if (sayac%2==0){
                System.out.println(sayac);
            }
            sayac++;
        }
    }
}