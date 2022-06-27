import java.util.Scanner;

public class AtmProjesiSwitchCase {
    public static void main(String[] args) {

        String kullaniciAdi, parola;
        int denemeSayisi = 3, bakiyeMiktari = 1500, islem;

        Scanner input = new Scanner(System.in);
        while (denemeSayisi > 0) {
            System.out.print("Kullanıcı Adınız :");
            kullaniciAdi = input.nextLine();

            System.out.print("Parolanız : ");
            parola = input.nextLine();

            if (kullaniciAdi.equals("patika") && parola.equals("dev123")) {

                System.out.println("Merhaba, Kodluyoruz Bankasına Hoşgeldiniz!");
                do {
                    System.out.println("1-Para yatırma\n" +
                            "2-Para Çekme\n" +
                            "3-Bakiye Sorgula\n" +
                            "4-Çıkış Yap");
                    System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz : ");
                    islem = input.nextInt();

                    switch (islem) {
                        case 1:
                            System.out.print("Yatırmak istediğiniz para miktarını giriniz : ");
                            int yatirPara = input.nextInt();
                            bakiyeMiktari += yatirPara;
                            break;

                        case 2:
                            System.out.print("Çekmek istediğiniz para miktarını giriniz : : ");
                            int cekPara = input.nextInt();

                            if (cekPara > bakiyeMiktari) {
                                System.out.println("Bakiye yetersiz.");
                            } else {
                                bakiyeMiktari -= cekPara;
                            }
                            break;
                        case 3:
                            System.out.println("Bakiyeniz : " + bakiyeMiktari);
                            break;
                    }

                } while (islem != 4);
                System.out.println("Tekrar görüşmek üzere.");
                break;
            } else {
                denemeSayisi--;
                System.out.println("Hatalı kullanıcı adı veya şifre. Tekrar deneyiniz.");

                if (denemeSayisi == 0) {
                    System.out.println("Hesabınız bloke olmuştur lütfen banka ile iletişime geçiniz.");
                } else {
                    System.out.println("Kalan Hakkınız : " + denemeSayisi);
                }
            }
            input.close();
        }
    }
}