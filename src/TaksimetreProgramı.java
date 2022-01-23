import java.util.Scanner;

public class TaksimetreProgramı {

    public static void main(String[] args) {
        int distance=0;
        Scanner scan = new Scanner(System.in);

        System.out.println("Gidilen mesafeyi yazınız(km cinsinden): ");
        distance = scan.nextInt();

        double price=distance*2.20;
        double total = 10 + price;

        double durum = (total > 20) ? total : 20 ;
        System.out.println("Toplam Ücretiniz : "+durum);
    }

}
