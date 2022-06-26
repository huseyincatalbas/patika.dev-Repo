import java.util.Scanner;

public class KullaniciGirisi {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

        String kAdi, kParola, yParola;
        System.out.print("Kullanıcı Adınızı Giriniz:");
        kAdi = input.nextLine();
        System.out.print("Şifrenizi Giriniz:");
        kParola = input.nextLine();

        if (kAdi.equals("patika") && kParola.equals("java123")) {
            System.out.println("Sisteme Giriş Başarılı");
        } else {
            System.out.println("Sistemi Giriş Başarısız...");

            System.out.println("Şifrenizi Sıfırlamak İstiyor Musun?:"
                    + "\n İstiyorum İçin 1"
                    + "\n İstemiyorum İçin 2"
                    + "\n Seçiminizi Giriniz:");
            int islem = input.nextInt();
            input.nextLine(); // nextInt() kendinden sonra gelen nextLine() değer almasını engelliyor.

            switch (islem) {
                case 1:
                    System.out.println("Yeni Parolanızı Giriniz:");
                    yParola = input.nextLine();

                    if (yParola.equals("java123")) {
                        System.out.println("Yeni Şifreniz Önceki ile Aynı. Parolanız Sıfırlanamadı.");
                    } else {
                        System.out.println("Tebrikler, Parolanız Sıfırlandı"
                                + "\nYeni Parolanız:" + yParola);
                    }
                    break;
                case 2:
                    System.out.println("Parolanızı Sıfırlamak İstemediniz.");
                    break;
                default:
                    System.out.println("Yanlış Değer Girişi Yaptınız...");
            }
        }
        input.close();
    }
}
