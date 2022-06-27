import java.util.Scanner;

public class YildizElmasCizme {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.print("Basamak Sayısı Giriniz:");
        int sayi=input.nextInt();

        for (int i=1; i <= sayi; i++){

            for (int k=1; k<= (sayi-i); k++){
                System.out.print(" ");
            }

            for (int j=1; j<=(2*i)-1; j++){
                System.out.print("*");
            }

            System.out.println(" ");
        }

        for (int i=sayi-1; i >0 ; i--){

            for (int k=sayi-i; k>0; k--){
                System.out.print(" ");
            }

            for (int j=(2*i)-1; j>0; j--){
                System.out.print("*");
            }

            System.out.println(" ");
        }
        input.close();
    }
}
