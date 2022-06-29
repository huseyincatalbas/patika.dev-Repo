import java.util.Scanner;
public class AsalSayiRecursive {
    static boolean kontrol(int sayi,int i,int sayac){
        if(i>sayi)
        {
        if(sayac==2)return true;
        else return false;
        }
        if(sayi%i==0)sayac++;
        return kontrol(sayi,i+1,sayac);
    }
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Kontrol Edilecek Sayıyı Giriniz:");
        int sayi=input.nextInt();
        System.out.println(kontrol(sayi,1,0)?"Asal Sayıdır":"Sayı Asal Değildir"); 
        input.close();
    }
}
