import java.util.Scanner;

public class SınıfıGeçmeDurumu {
    public static void main(String[] args) {
        int sum=0; int count=0;
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

        if (!(m < 0 || m > 100)) {
            count++;
            sum = sum+m;
        }
        if (!(f < 0 || f > 100)) {
            count++;
            sum = sum+f;
        }
        if (!(t < 0 || t > 100)) {
            count++;
            sum = sum+t;
        }
        if(!(k <0 ||k > 100)) {
            count++;
            sum = sum+k;
        }
        if(!(mü < 0 || mü > 100)) {
            count++;
            sum = sum+mü;
         }
        double result = (sum /count);
        System.out.println("Ortalamanız: "+result);

        if (result >=  55) {
            System.out.println("Sınıfı Geçtiniz.");
        } else {
            System.out.println("Sınıfta Kaldınız");
        }
}
}