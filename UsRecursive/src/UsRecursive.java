import java.util.Scanner;

public class UsRecursive {

    static  int usAlma(int taban, int us){
        if(us==0) return 1;
        return taban * usAlma(taban,us-1);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Taban sayıyı giriniz: ");
        int taban = input.nextInt();
        System.out.print("Ussu giriniz: ");
        int us = input.nextInt();
        System.out.println("Sonuc = " + usAlma(taban,us));
        input.close();
    }

}