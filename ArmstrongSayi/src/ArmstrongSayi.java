import java.util.Scanner;

public class ArmstrongSayi {
    public static void main(String[] args) {

        int sayi, geciciSayi, toplam=0;
        int basamakSayisi=0, basamakDegeri;

        Scanner input=new Scanner(System.in);
        System.out.println("Bir Sayı Giriniz");
        sayi=input.nextInt();

        geciciSayi=sayi;
        while (geciciSayi != 0){
            geciciSayi /= 10;
            basamakSayisi++;
        }

        geciciSayi=sayi;
        while (geciciSayi != 0){
            basamakDegeri=geciciSayi%10;

            int basamakUssu=1;
            for (int i=1; i<=basamakSayisi; i++){
                basamakUssu*=basamakDegeri;
            }

            toplam+=basamakUssu;
            geciciSayi/=10;
        }

        if (toplam==sayi){
            System.out.println( sayi+" sayısı bir Armstrong sayıdır.");
        }else {
            System.out.println( sayi+" sayısı bir Armstrong sayı değildir.");
        }
        input.close();
    }
}
