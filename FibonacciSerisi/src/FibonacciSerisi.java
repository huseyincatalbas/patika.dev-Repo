import java.util.Scanner;

public class FibonacciSerisi {
    public static void main(String[] args) {
        int ilkSayi = 0, sonSayi = 1, sonrakiSayi = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("Fibonacci Eleman Sayısını Giriniz: ");
        int elamanSay = input.nextInt();

        for (int i = 0; i <= elamanSay; i++) {
            System.out.print(ilkSayi + " ");

            sonrakiSayi = ilkSayi + sonSayi;
            ilkSayi = sonSayi;
            sonSayi = sonrakiSayi;

        }
        input.close();
    }
}