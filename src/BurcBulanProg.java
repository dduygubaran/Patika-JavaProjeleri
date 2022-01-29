import java.util.Locale;
import java.util.Scanner;

public class BurcBulanProg {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Burcunuzuu Bulmak İstiyoruz. Hadi başlayalım!!!");
        System.out.print("Doğdugunuz Ayı Yazınız: ");
        String month = scan.nextLine();
        System.out.print("Doğdugunuz Günü Yazınız: ");
        int day = scan.nextInt();

        String m1 = "OCAK";
        if(month.toUpperCase(Locale.ROOT).equals(m1)) {
            if (day >= 1 && day <= 31) {
                if (day <= 21) {
                    System.out.println("Oğlak Burcusunuz");
                } else if (day >= 22 && day <= 31) {
                    System.out.println("Kova Burcusunuz");
                }
            }
            else {
                System.out.println("Geçersiz Sayı Girdiniz.");
            }
        }


        String m2 = "ŞUBAT";
        if(month.toUpperCase(Locale.ROOT).equals(m2)) {
            if (day>=1 && day<=31) {
                if(day<=19) {
                    System.out.println("Kova Burcusunuz");
                }
                else {
                    System.out.println("Balık Burcusunuz");
                }
            }
            else {
                System.out.println("Geçersiz Sayı Girdiniz.");
            }
        }

        String m3 = "MART";
        if(month.toUpperCase(Locale.ROOT).equals(m3)) {
            if (day>=1 && day<=31) {
                if(day<=20) {
                    System.out.println("Balık Burcusunuz");
                }
                else {
                    System.out.println("Koç Burcusunuz");
                }
            }
            else {
                System.out.println("Geçersiz Sayı Girdiniz.");
            }
        }

        String m4 = "NİSAN";
        if(month.toUpperCase(Locale.ROOT).equals(m4)) {
            if (day>=1 && day<=31) {
                if(day<=20) {
                    System.out.println("Koç Burcusunuz");
                }
                else {
                    System.out.println("Boğa Burcusunuz");
                }
            }
            else {
                System.out.println("Geçersiz Sayı Girdiniz.");
            }
        }

        String m5 = "MAYIS";
        if(month.toUpperCase(Locale.ROOT).equals(m5)) {
            if (day>=1 && day<=31) {
                if(day<=21) {
                    System.out.println("Boğa Burcusunuz");
                }
                else {
                    System.out.println("İkizler Burcusunuz");
                }
            }
            else {
                System.out.println("Geçersiz Sayı Girdiniz.");
            }
        }

        String m6 = "HAZIRAN";
        if(month.toUpperCase(Locale.ROOT).equals(m6)) {
            if (day>=1 && day<=31) {
                if(day<=22) {
                    System.out.println("İkizler Burcusunuz");
                }
                else {
                    System.out.println("Yengeç Burcusunuz");
                }
            }
            else {
                System.out.println("Geçersiz Sayı Girdiniz.");
            }
        }

        String m7 = "TEMMUZ";
        if(month.toUpperCase(Locale.ROOT).equals(m7)) {
            if (day>=1 && day<=31) {
                if(day<=22) {
                    System.out.println("Yengeç Burcusunuz");
                }
                else {
                    System.out.println("Aslan Burcusunuz");
                }
            }
            else {
                System.out.println("Geçersiz Sayı Girdiniz.");
            }
        }

        String m8 = "AĞUSTOS";
        if(month.toUpperCase(Locale.ROOT).equals(m8)) {
            if (day>=1 && day<=31) {
                if(day<=22) {
                    System.out.println("Aslan Burcusunuz");
                }
                else {
                    System.out.println("Başak Burcusunuz");
                }
            }
            else {
                System.out.println("Geçersiz Sayı Girdiniz.");
            }
        }

        String m9 = "EYLÜL";
        if(month.toUpperCase(Locale.ROOT).equals(m9)) {
            if (day>=1 && day<=31) {
                if(day<=22) {
                    System.out.println("Başak Burcusunuz");
                }
                else {
                    System.out.println("Terazi Burcusunuz");
                }
            }
            else {
                System.out.println("Geçersiz Sayı Girdiniz.");
            }
        }

        String m10 = "EKİM";
        if(month.toUpperCase(Locale.ROOT).equals(m10)) {
            if (day>=1 && day<=31) {
                if(day<=22) {
                    System.out.println("Terazi Burcusunuz");
                }
                else {
                    System.out.println("Akrep Burcusunuz");
                }
            }
            else {
                System.out.println("Geçersiz Sayı Girdiniz.");
            }
        }

        String m11 = "KASIM";
        if(month.toUpperCase(Locale.ROOT).equals(m11)) {
            if (day>=1 && day<=31) {
                if(day<=21) {
                    System.out.println("Akrep Burcusunuz");
                }
                else {
                    System.out.println("Yay Burcusunuz");
                }
            }
            else {
                System.out.println("Geçersiz Sayı Girdiniz.");
            }
        }

        String m12 = "ARALIK";
        if(month.toUpperCase(Locale.ROOT).equals(m12)) {
            if (day>=1 && day<=31) {
                if(day<=21) {
                    System.out.println("Yay Burcusunuz");
                }
                else {
                    System.out.println("Oğlak Burcusunuz");
                }
            }
            else {
                System.out.println("Geçersiz Sayı Girdiniz.");
            }
        }
    }
}
