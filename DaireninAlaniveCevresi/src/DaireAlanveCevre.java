import java.util.Scanner;

public class DaireAlanveCevre {
    public static void main(String[] args) {

        double r;
        double pi = 3.14;
        double daireAlan;
        double daireCevre;
        double daireDilimAlani;
        double daireDilimAcisi;

        Scanner input = new Scanner(System.in);

        System.out.print("Dairenin Yarıçapını Giriniz(r): ");
        r = input.nextDouble();
        System.out.print("Daire  Açısını Giriniz(Derece): ");
        daireDilimAcisi = input.nextDouble();

        daireDilimAlani = (pi * daireDilimAcisi * (r * r)) / 360;
        daireCevre = 2 * pi * r;
        daireAlan = pi * r * r;

        System.out.println("Dairenin Yarıçap Değeri:" + r);
        System.out.println("Daire Dilimin Açısını: " + daireDilimAcisi);
        System.out.println("Tüm Dairenin Çevresi:" + daireCevre);
        System.out.println("Tüm Dairenin Alanı:" + daireAlan);
        System.out.println("Daire Dilimin Alanı:" + daireDilimAlani);

        input.close();

    }
}