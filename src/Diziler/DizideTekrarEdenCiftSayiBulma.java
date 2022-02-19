package Diziler;

import java.util.Arrays;

public class DizideTekrarEdenCiftSayiBulma {

    public static void main(String[] args) {

        int[] array = {48, 1, 36, 1, 26, 5, 12, 28, 10, 12, 5, 5, 9, 1, 28, 36, 48};
        int[] duplicate = new int[array.length-10];
        int startIndex=0;
        for (int i=0; i<array.length;i++) {
            for (int j=0; j<array.length; j++) {
                if ((i != j) && (array[i] == array[j])) {
                    if ((array[j] % 2 ==0 ) && !isFind(duplicate, array[i])) {
                        duplicate[startIndex++]=array[j];
                    }
                        break;
                }
            }
        }
        System.out.println(Arrays.toString(duplicate));

        for (int value : duplicate) {
            if (value != 0) {
            }
        }
    }

    static boolean isFind(int arr[], int value) {
        for (int i : arr) {
            if (i==value) {
                return true;
            }
        }
        return false;
    }




}
