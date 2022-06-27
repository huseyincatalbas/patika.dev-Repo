import java.util.Scanner;

public class FaktoriyelBulma {
    public static void main(String[] args) {
        
        Scanner input=new Scanner(System.in);
        System.out.println("Faktöriyel Sayını Giriniz");
        int sayi=input.nextInt();
        
        int toplam=1, sayac=1;

        while (sayac <= sayi){
            toplam*=sayac;
            sayac++;
        }
        System.out.println( sayi+" sayısının faktöriyeli: "+toplam);
        input.close();
    }
}
