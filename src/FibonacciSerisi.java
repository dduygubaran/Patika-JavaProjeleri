import java.util.Scanner;

public class FibonacciSerisi {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Eleman sayısını yazınız: ");
        int elemanSayısı = scanner.nextInt();

        int s1=0,s2=1,s3;
        System.out.print(s1+" "+s2);//0 ve 1 yazdır

        for(int i=2;i<elemanSayısı;i++)//Döngü 2 den başlıyor çünkü ilk 2 terim 0 ve 1 her zaman yazılacak
        {
            s3=s1+s2;
            System.out.print(" "+s3);
            s1=s2;
            s2=s3;
        }
        System.out.println();

        }
    }

