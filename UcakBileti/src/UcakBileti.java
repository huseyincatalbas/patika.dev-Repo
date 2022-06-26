import java.util.Scanner;

public class UcakBileti {
    public static void main(String[] args) {

        double biletTutari = 0.0, mesafe, mesafeBasiUcret=0.10;
        int yas, seyahatTipi;
        boolean kontrol=false;

        Scanner input = new Scanner(System.in);

        System.out.print("Mesafe Giriniz (Km) : ");
        mesafe = input.nextDouble();

        System.out.print("Yaşınızı Giriniz : ");
        yas = input.nextInt();

        System.out.print("Yolculuk Tipini Giriniz (Tek Yön için: 1, Gidiş Dönüş için: 2): ");
        seyahatTipi = input.nextInt();
        
        biletTutari=mesafe*mesafeBasiUcret;

         switch (seyahatTipi){
             case 1:
             biletTutari= biletTutari;
                 break;
             case 2:
                 biletTutari*=2*0.8;
                 break;
             default:
             kontrol=true;
         }

         if (!kontrol){
             if (0<yas && yas<12){
                biletTutari*=0.5;
                 System.out.println("Bilet Fiyatınız: " + biletTutari);
             } else if (12<=yas && yas<24) {
                biletTutari*=0.9;
                 System.out.println("Bilet Fiyatınız: " + biletTutari);
             } else if (24<=yas && yas<65) {
                biletTutari=biletTutari;
                 System.out.println("Bilet Fiyatınız: " + biletTutari);
             }else if (yas>65) {
                biletTutari*=0.7;
                 System.out.println("Bilet Fiyatınız: " + biletTutari);
             }else {
                 System.out.println("Hatalı Veri Girdiniz");
             }
         }else {
             System.out.println("Hatalı Yolculuk Tipi Girdiniz.");
         }
         input.close();

    }
}