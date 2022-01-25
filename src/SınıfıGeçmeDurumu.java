import java.util.Scanner;

public class SınıfıGeçmeDurumu {
    public static void main(String[] args) {
        int sum = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Matematik notunuzu giriniz: ");
        int m = scan.nextInt();
        System.out.println("Fizik notunuzu giriniz: ");
        int f = scan.nextInt();
        System.out.println("Türkçe notunuzu giriniz: ");
        int t = scan.nextInt();
        System.out.println("Kimya notunuzu giriniz: ");
        int k = scan.nextInt();
        System.out.println("Müzik notunuzu giriniz: ");
        int mü = scan.nextInt();

        if (m > 0 && m <= 100) {
            sum = sum +m;
        }
        if (f > 0 && f <= 100) {
            sum = sum +f;
        }
        if (t > 0 && t <= 100) {
            sum = sum+t;
        }
        if(m >0 && m <= 100) {
        sum = sum+k;
        }
        if(mü > 0 && mü <= 100) {
        sum = sum+mü;
    }
        double result = (sum /5);
        System.out.println("Ortalamanız: "+result);
}
}