import java.util.Scanner;

public class HavaSicakligi {
    public static void main(String[] args) {

        int sicaklik;
        Scanner input = new Scanner(System.in);
        System.out.println("Sıcaklık Değerini Giriniz(Derece Cinsinden):");
        sicaklik = input.nextInt();

        String sonuc = (sicaklik < 5) ? "Kayak Yapabilirsiniz"
                : ((5 <= sicaklik && sicaklik < 15) ? "Sinemaya Gidebilirsiniz"
                        : ((15 <= sicaklik && sicaklik < 25) ? "Pikniğe Gidebilirsiniz"
                                : "Yüzmeye Gidebilirsiniz"));

        System.out.println(sonuc);

        input.close();
    }
}
