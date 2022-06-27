import java.util.Scanner;

public class UsluSayiHesaplama {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Üssü Alınacak Sayı Giriniz");
        int sayi=input.nextInt();
        System.out.println("Sayının Kuvvetini Giriniz");
        int kuvvet=input.nextInt();

        int toplam=1;

        for (int i=1; i<=kuvvet; i++){
            toplam*=sayi;
        }
        System.out.println(sayi+ " sayısının "+kuvvet + " üslü: "+ toplam);
        input.close();
    }
}