import java.util.Scanner;

public class ArtikYilBulma {
    public static void main(String[] args) {

        boolean artikYil = false;
        int yil;

        Scanner input=new Scanner(System.in);
        System.out.print("Yıl Bilgisini Giriniz:");
        yil=input.nextInt();

        if (yil % 4 == 0) {
                if (yil % 100 == 0) {
                        if (yil % 400 == 0){
                            artikYil = true;
                        }else{
                            artikYil = false;
                        }
                }else {
                    artikYil = true;
                }
        } else{
            artikYil = false;
        }

            System.out.println((artikYil)? yil + " yılı bir artık yıldır !":yil + " yılı bir artık yıldır değildir !");
        input.close();
    }
}
