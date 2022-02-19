package Diziler;

import com.sun.source.tree.CompilationUnitTree;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;

public class ElemanlarınFrekansı {
    public static void main(String[] args) {

        int[] array = {10, 7, 7, 20, 20, 10, 10, 20, 5, 20, 5, 7};
        int[] duplicate = new int[array.length];

        int startIndex = 0;
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            for (j = 0; j < array.length; j++) {
                if ((i != j) && (array[i] == array[j])) {
                    duplicate[startIndex++] = array[j];
                    break;
                }
            }
        }

        System.out.println(Arrays.toString(duplicate));

        HashMap<Integer, Integer> counter = new HashMap<>();
        for (int search : duplicate) {
            if (!counter.containsKey(search)) {
                counter.put(search, 1);
            } else {
                counter.put(search, counter.get(search) + 1);
            }
        }

        for (int i: counter.keySet()) {
            System.out.println(i + " sayısı " + counter.get(i) + " kez tekrar etmiştir.");
        }

    }
}
