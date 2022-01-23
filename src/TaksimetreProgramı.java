import java.util.Scanner;

/* Taksimetre Programı
Java ile gidilen mesafeye (KM) göre taksimetre tutarını ekrana yazdıran programı yazın.

*Taksimetre KM başına 2.20 TL tutmaktadır.
*Minimum ödenecek tutar 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır.
*Taksimetre açılış ücreti 10 TL'dir.*/

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
