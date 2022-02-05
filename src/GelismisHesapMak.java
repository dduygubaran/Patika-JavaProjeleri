
import java.util.Scanner;

public class GelismisHesapMak {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String menu = "1- Toplama İşlemi\n"
                + "2- Çıkarma İşlemi\n"
                + "3- Çarpma İşlemi\n"
                + "4- Bölme işlemi\n"
                + "5- Üslü Sayı Hesaplama\n"
                + "6- Mod Alma\n"
                + "0- Çıkış Yapmak";

        System.out.println(menu);
        while (true) {
            System.out.print("Lütfen bir işlem seçiniz :");
            int select = scan.nextInt();

            if (select==0) {
                System.out.println("Çıkış Yaptınız.");
                break;
            }

            System.out.print("1.sayıyı giriniz: ");
            int n1 = scan.nextInt();
            System.out.print("2.sayıyı giriniz: ");
            int n2 = scan.nextInt();


            switch (select) {
                case 1:
                    plus(n1,n2);
                    break;
                case 2:
                    minus(n1,n2);
                    break;
                case 3:
                    times(n1,n2);
                    break;
                case 4:
                    divided(n1,n2);
                    break;
                case 5:
                    power(n1,n2);
                    break;
                case 6:
                    mod(n1,n2);
                    break;
                default:
                    System.out.println("Geçersiz bir işlem yaptınız.");
            }

        }
    }

    static void plus(int s1, int s2) {
        int result = s1 + s2;
        System.out.println("Sonuç: " + result);
    }

    static void minus(int s1, int s2) {
        int result = s1 - s2;
        System.out.println("Sonuç: " + result);
    }

    static void times(int s1, int s2) {
        int result = s1 * s2;
        System.out.println("Sonuç: " + result);
    }

    static void divided(int s1, int s2) {
        if (s2 == 0) {
            System.out.println("İkinci sayı 0 olamaz!");
        } else {
            int result = s1 / s2;
            System.out.println("Sonuç: " + result);
        }
    }

    static void power(int s1, int s2) {
        int result = 1;
        for (int i = 1; i <= s2; i++) {
            result *= s1;
        }
        System.out.println("Sonuc: " + result);
    }

    static void mod(int s1, int s2) {
        int result = s1%s2;
        System.out.println("Sonuç: "+result);
    }

}
