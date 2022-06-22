import java.util.Scanner;

public class VucutKitleIndeksi {
    public static void main(String[] args) {

        double boy;
        double kilo;
        double vucutKitleİndeksi;

        Scanner input = new Scanner(System.in);

        System.out.print("Boyunuzu Giriniz (metre): ");
        boy = input.nextDouble();
        System.out.print("Kilonuzu Giriniz (kg) : ");
        kilo = input.nextDouble();

        vucutKitleİndeksi = kilo / (boy * boy);

        System.out.println("Boyunuz:" + boy);
        System.out.println("Kilonuz:" + kilo);
        System.out.println("Vücut Kitle İndeksiniz:" + vucutKitleİndeksi);

        input.close();
    }
}