import javax.net.ssl.SSLContext;
import java.util.Scanner;

public class Kombinasyon {
    public static void main(String[] args) {

        int multiplication = 1;
        int multipl = 1;
        int mult = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kombinasyon Hesaplamasını İstediğiniz Değişkenlerin Değerlerini Giriniz. C(n,r)");
        System.out.print("n: ");
        int n = scanner.nextInt();
        System.out.print("r: ");
        int r = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            multiplication = multiplication * i;
        }

        int j;
        for (j = 1; j <= r; j++) {
            multipl = multipl * j;
        }

        for (int k = 1; k <= (n-r); k++) {
            mult = mult * k;
        }

        int comb = (multiplication) / (multipl * mult);
        System.out.println("C(n,r): " + comb);
    }
}
