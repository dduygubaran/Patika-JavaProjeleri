import java.util.Scanner;

public class UsluSayi {
    public static void main(String[] args) {

        int m=1;
        Scanner scanner = new Scanner (System.in) ;
        System.out.println("Sayıları Giriniz.");
        System.out.print("Sayı: ");
        int number = scanner.nextInt();
        System.out.print("Üs: ");
        int exponential = scanner.nextInt();

        for (int i=1; i<=exponential;i++) {
            m = number*m;
        }
        System.out.print(+number+"^"+exponential+ ": " +m);



    }
}
