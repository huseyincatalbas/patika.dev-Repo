import java.util.Scanner;

public class PozitifTekSayilarinToplami {
    public static void main(String[] args) {

        int girilenSayi,toplam=0;

        Scanner input=new Scanner(System.in);

        do {
            System.out.print("Bir sayı Giriniz");
            girilenSayi=input.nextInt();

            if (girilenSayi % 2 ==1){
                toplam+=girilenSayi;
            }
        }while(0<girilenSayi);

        System.out.println("Girilen Sayıların Toplamı: " + toplam);
        input.close();
    }
}
