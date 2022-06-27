import java.util.Scanner;

public class IkininKuvvetiniBulma {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Bir Sayı Giriniz:");
        int sayi=input.nextInt();
        System.out.println( sayi+ " sayısından küçük ikinin kuvvetleri ");
        for (int i=1; i<=sayi; i*=2){
            System.out.println(i);
        }
        input.close();

    }
}