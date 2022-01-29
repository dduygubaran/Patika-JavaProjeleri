import java.util.Scanner;

public class DortVeBesinKuvveti {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz: ");
        int number = scanner.nextInt();

        for (int i = 1, j = 1; i <= number && j <= number; i *= 4, j *= 5) {

            if (i != 1 && j!=1) {
                    System.out.println(i);
                    System.out.println(j);
            }
        }
    }
}

