import java.util.Scanner;

public class dikUcgenHipotenus {
    public static void main(String[] args) {

        double kenar1;
        double kenar2;
        double hipotenus;
        double uDegeri;
        double cevre;
        double alan;

        Scanner input = new Scanner(System.in);

        System.out.print("Birinci Kenar Uzunluğu Gir: ");
        kenar1 = input.nextDouble();
        System.out.print("İkinci Kenar Uzunluğu Gir: ");
        kenar2 = input.nextDouble();

        hipotenus = Math.sqrt((kenar1 * kenar1) + (kenar2 * kenar2));

        uDegeri = (kenar1 + kenar2 + hipotenus) / 2;
        cevre = 2 * uDegeri;

        alan = Math.sqrt((uDegeri * (uDegeri - kenar1) * (uDegeri - kenar2) * (uDegeri - hipotenus)));

        System.out.println("Birinci Kenar:" + kenar1);
        System.out.println("İkinci Kenar:" + kenar2);
        System.out.println("Hipotenüs:" + hipotenus);
        System.out.println("Üçgenin Çevresi:" + cevre);
        System.out.println("Üçgenin Alanı:" + alan);

        input.close();
    }
}