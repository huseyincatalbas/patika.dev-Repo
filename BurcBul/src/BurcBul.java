import java.util.Scanner;

public class BurcBul {

    public static void main(String[] args) {

        int gun, ay;
        String burcAdi="";
        boolean kontrol=false;

        Scanner input = new Scanner(System.in);

        System.out.print("Ay Bilgisini Giriniz: ");
        ay = input.nextInt();
        System.out.print("Gün Bilgisini Giriniz: ");
        gun = input.nextInt();

        if (ay == 1) {
            if (1 <= gun && gun<=31){
                if (gun < 22 ) {
                    burcAdi="Oğlak";
                } else {
                    burcAdi="Kova";
                }
            }else {
                kontrol=true;
            }
        } else if (ay == 2) {
            if (1 <= gun && gun <= 28) {
                if (gun < 20) {
                    burcAdi = "Kova";
                } else {
                    burcAdi = "Balık";
                }
            } else {
                kontrol = true;
            }
        } else if (ay == 3) {
            if (1 <= gun && gun <= 31) {
                if (gun < 21) {
                    burcAdi = "Balık";
                } else {
                    burcAdi = "Koç";
                }
            } else {
                kontrol = true;
            }
        } else if (ay == 4) {
            if (1 <= gun && gun <= 31) {
                if (gun < 21) {
                    burcAdi = "Koç";
                } else {
                    burcAdi = "Boğa";
                }
            } else {
                kontrol = true;
            }
        } else if (ay == 5) {
            if (1 <= gun && gun <= 31) {
                if (gun < 22) {
                    burcAdi = "Boğa";
                } else {
                    burcAdi = "İkizler";
                }
            } else {
                kontrol = true;
            }
        } else if (ay == 6) {
            if (1 <= gun && gun <= 31) {
                if (gun < 23) {
                    burcAdi = "İkizler";
                } else {
                    burcAdi = "Yengeç";
                }
            } else {
                kontrol = true;
            }
        } else if (ay == 7) {
            if (1 <= gun && gun <= 31) {
                if (gun < 23) {
                    burcAdi = "Yengeç";
                } else {
                    burcAdi = "Aslan";
                }
            } else {
                kontrol = true;
            }
        } else if (ay == 8) {
            if (1 <= gun && gun <= 31) {
                if (gun < 23) {
                    burcAdi = "Aslan";
                } else {
                    burcAdi = "Başak";
                }
            } else {
                kontrol = true;
            }
        } else if (ay == 9) {
            if (1 <= gun && gun <= 31) {
                if (gun < 23) {
                    burcAdi = "Başak";
                } else {
                    burcAdi = "Terazi";
                }
            } else {
                kontrol = true;
            }
        } else if (ay == 10) {
            if (1 <= gun && gun <= 31) {
                if (gun < 23) {
                    burcAdi = "Terazi";
                } else {
                    burcAdi = "Akrep";
                }
            } else {
                kontrol = true;
            }
        } else if (ay == 11) {
            if (1 <= gun && gun <= 31) {
                if (gun < 22) {
                    burcAdi = "Akrep";
                } else {
                    burcAdi = "Yay";
                }
            } else {
                kontrol = true;
            }
        } else if (ay == 12) {
            if (1 <= gun && gun <= 31) {
                if (gun < 22) {
                    burcAdi = "Yay";
                } else {
                    burcAdi = "Oğlak";
                }
            } else {
                kontrol = true;
            }
        }else {
            kontrol=true;
        }

        if (kontrol){
            System.out.println("Hatalı Değer Girdiniz.Lütfen Tekrar Giriniz.");
        }else {
            System.out.println("Burcunuz: " + burcAdi);
        }
        input.close();
    }
}