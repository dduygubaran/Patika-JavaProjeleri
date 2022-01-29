import java.util.Scanner;

public class ArtıkYılHesaplama {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir yıl giriniz: ");
        int year = scanner.nextInt();

        if (year%4==0 && year%100!=0)
        {
            System.out.println(+year+ " artık yıldır");
        }

        else if (year%100==0 && year%400==0)
        {
            System.out.println(+year+ " artık yıldır");
        }

        else
        {
            System.out.println(+year+ " artık yıl değildir.");
        }

    }
}
