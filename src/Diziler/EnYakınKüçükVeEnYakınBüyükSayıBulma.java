package Diziler;

import java.util.Arrays;
import java.util.Scanner;

public class EnYakınKüçükVeEnYakınBüyükSayıBulma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir Sayı Giriniz : ");
        int number = scanner.nextInt();

        int [] array = {15,12,788,1,-1,-778,2,0};
        Arrays.sort(array); // -778 -1 0 1 2 12 15 788
        int min  = 0;
        int max = 0;

        for (int search : array) {
            if (search < number) {
                min = search;
            }
        }

        for (int search : array) {
            if (search > number) {
                max = search;
                break;
            }
        }

        System.out.println("En Yakın Küçük Sayı: " + min);
        System.out.println("En Yakın Büyük Sayı: " + max);

    }
}
