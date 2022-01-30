import java.util.Scanner;

public class HarmonikSayi {
    public static void main(String[] args) {

        double sum =0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz: ");
        int number = scanner.nextInt();

        for (double i=1;i<=number;i++) {
            sum += (1/i) ;
        }
        System.out.println("Toplam: "+sum);
    }
}
