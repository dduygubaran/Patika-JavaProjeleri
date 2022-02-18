package Diziler;

public class HarmonikOrtalamaHesaplama {

    public static void main(String[] args) {

        double[] numbers = {1, 2, 3, 4, 5,6,7};

        double sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum = sum + (1/numbers[i]);
        }

        double avarage = numbers.length / sum;

        System.out.println("Harmonik Ortalama: " + avarage);
    }
}
