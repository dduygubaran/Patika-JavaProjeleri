import java.util.Scanner;

public class RecursiveAsalSayi {

    static int i=2;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bir sayı giriniz: ");
        int n = scanner.nextInt();

        if (isPrime(n)) {
            System.out.println(+n+" asal sayıdır.");
        }
        else {
            System.out.println(+n+" asal sayı değildir.");
        }
    }

    static boolean isPrime(int number) {
        if (i==number/2+1)
            return true;
        if (number%i==0)
            return false;
        i++;
        return isPrime(number);
    }
}

