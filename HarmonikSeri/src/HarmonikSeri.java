import java.util.Scanner;

public class HarmonikSeri {
    public static void main(String[] args) {

        int sayi;
        double toplam=0.0;

        Scanner input=new Scanner(System.in);
        System.out.println("Bir Sayı Giriniz");
        sayi=input.nextInt();

        for (double i=1; i<=sayi; i++){
            toplam+=(1/i);
        }
        System.out.println(toplam);

        input.close();
    }
}
