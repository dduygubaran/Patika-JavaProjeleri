package Diziler;

import java.util.Arrays;
import java.util.Scanner;

public class SayiTahminOyunu {

    public static void main(String[] args) {

        int rand = (int) (Math.random() * 100);
        System.out.println(rand);

        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[5];

        int right=0;
        boolean isWin = false;
        int i =0;
        while (right<5) {
            System.out.print("Lütfen Tahmininizi Giriniz: ");
            int number = scanner.nextInt();

            if (number<0 || number>99) {
                System.out.println("Lütfen 1-100 Arası Bir Değer Giriniz. ");
                continue;
            }

            if (rand==number) {
                System.out.println("Tahmininiz doğru. TEBRİKLER!!!");
                isWin = true;
                break;
            }
            else {
                System.out.println("Yanlış Tahmin Yaptınız.");
                if (rand<number) {
                    System.out.println("GİZLİ SAYI, tahmininizden küçüktür.");
                    right++;
                    System.out.println("Kalan Hakkınız: " + (5-right));
                }
                else if (rand>number) {
                    System.out.println("GİZLİ SAYI, tahmininizden büyüktür.");
                    right++;
                    System.out.println("Kalan Hakkınız: " + (5-right));
                }
                arr [i++] = number;
            }
        }
        if (isWin==false) {
            System.out.println("Oyunu KAYBETTİNİZ.");
        }
        System.out.println("Girdiğiniz Yanlış Değerler: " + Arrays.toString(arr));
        System.out.println("GİZLİ SAYIMIZ: " + rand + " idi.");
    }
}
