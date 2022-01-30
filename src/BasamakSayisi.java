import java.util.Scanner;

public class BasamakSayisi {

    public static void main(String[] args) {

        int counter=0; int sum=0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen Bir Sayı Giriniz: ");
        int number = scanner.nextInt();

        while (number!=0) {
           int  remainder = number % 10;
           sum += remainder;
            number = number/10 ;
            counter++;
        }

        System.out.println("Basamak Sayınız: "+counter);
        System.out.println("Basamak Değerleri Toplamı: "+sum);

    }
}
