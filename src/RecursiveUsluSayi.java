import java.util.Scanner;

public class RecursiveUsluSayi {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("1.sayıyı giriniz: ");
            int s1 = scanner.nextInt();
            System.out.print("2.sayıyı giriniz: ");
            int s2 = scanner.nextInt();
            power(s1, s2);
            System.out.println(power(s1,s2));

        }
    }

    static int power(int n1, int n2) {
        if(n2==0){
            return 1;
        }
        else {
            int result = n1*power(n1,n2-1);
            return result;
        }
    }
}
