package Diziler;

import java.util.Arrays;
import java.util.Scanner;

public class ElemanSiralama {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Dizi Sayısını Giriniz: ");
        int numberofArray = scanner.nextInt();

        int[] arr = new int[numberofArray-1];

        System.out.println("Dizinin Elemanlarını Giriniz ");
        int i;
        for (i = 0; i < numberofArray - 1; i++) {
            System.out.print(i + 1 + "." + " Elemanı: ");
            int member = scanner.nextInt();
            arr[i] = member;
        }

        System.out.println("Girilen Elemanlar ile Oluşan Dizi: " +Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("Sıralı Dizi                      : " + Arrays.toString(arr));
    }

}
