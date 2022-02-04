import java.util.Scanner;

public class MinMaxDegerBulma {
    public static void main(String[] args) {

        int s,elemanSayısı,maxNumber=0,minNumber=0;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Eleman sayısı: ");
        elemanSayısı = scanner.nextInt();

        for (int i = 1; i <=elemanSayısı; i++){
            System.out.print(i +". sayiyi giriniz: ");
            s = scanner.nextInt();

            if (i==1){
                minNumber=s;
                maxNumber=s;
            }
            else {
                if (s>maxNumber) {
                    maxNumber=s;;
                }
                if (s<minNumber) {
                    minNumber=s;
                }
            }
        }
        System.out.println("En Buyuk Sayı : "+ maxNumber);
        System.out.println("En Küçükk Sayı : "+ minNumber);
        }

}


