import java.awt.desktop.SystemEventListener;
import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("2 sayı giriniz: ");
        int number1 = scan.nextInt();
        int number2 = scan.nextInt();

        System.out.println("İşlem seçiniz: ");
        int islem = scan.nextInt();

        switch (islem) {
            case 1:
                int sum = number1 + number2;
                System.out.println("Sum: "+sum);
                break;
            case 2:
                if (number1 > number2) {
                    int extraction = number1 - number2;
                    System.out.println("Extraction: "+extraction);
                }
                else
                {
                    int extraction = number2-number1;
                    System.out.println("Extraction: "+extraction);
                }
                break;
            case 3:
                double division = number1 / number2;
                System.out.println("Division: "+division);
                break;
            case 4:
                int multiplication = number1*number2;
                System.out.println("Multiplication: "+multiplication);
                break;
            default:

        }
    }
}
