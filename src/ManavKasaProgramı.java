
/* Manav Kasa Programı
   Java ile kullanıcıların manavdan almış oldukları ürünlerin kilogram değerlerine göre toplam tutarını ekrana yazdıran programı yazın.
   Meyveler ve KG Fiyatları
   Armut : 2,14 TL
   Elma : 3,67 TL
   Domates : 1,11 TL
   Muz: 0,95 TL
   Patlıcan : 5,00 TL */

import java.util.Scanner;
public class ManavKasaProgramı {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Kaç kilogram armut aldınız? Giriniz: ");
        int a = scan.nextInt();
        System.out.println("Kaç kilogram elma aldınız? Giriniz: ");
        int e = scan.nextInt();
        System.out.println("Kaç kilogram domates aldınız? Giriniz: ");
        int d = scan.nextInt();
        System.out.println("Kaç kilogram muz aldınız? Giriniz: ");
        int m = scan.nextInt();
        System.out.println("Kaç kilogram patlıcan aldınız? Giriniz: ");
        int p = scan.nextInt();

        double totalPrice = ((a*2.14) +(e*3.67)+(d*1.11)+(m*0.95)+(p*5));
        System.out.println("Ödeyeceğiniz toplam ücret: "+totalPrice);

    }
}
