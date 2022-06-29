import java.util.Scanner;

public class FibonacciSerisiRecursive {

    static int fibonacciSerisi(int sayi) {
        if (sayi == 1 || sayi == 2) {
            return 1;
        }
        return fibonacciSerisi(sayi - 1) + fibonacciSerisi(sayi - 2);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Fibaonacci Dizisinde İstenilen Adımı Giriniz:");
        int sayi = input.nextInt();
        System.out.println(sayi+". Adımdaki Fibonacci Değeri:"+fibonacciSerisi(sayi));
        input.close();
    }
}
