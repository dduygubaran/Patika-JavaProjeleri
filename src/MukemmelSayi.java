import javax.rmi.ssl.SslRMIClientSocketFactory;
import java.util.Scanner;

public class MukemmelSayi {
    public static void main(String[] args) {

        int toplam=0;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir Sayı Giriniz: ");
        int s1 = scanner.nextInt();

        for (int i=1; i<s1; i++) {
            if (s1 % i == 0) {
                toplam = toplam + i;
            }
        }

              if (toplam==s1) {
                  System.out.println(s1+" Mükemmel Sayıdır.");
              }
              else {
                  System.out.println(s1+" Mükemmel Sayı Değildir.");
              }

        }
    }

