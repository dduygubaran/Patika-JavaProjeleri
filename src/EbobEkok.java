import java.util.Scanner;

public class EbobEkok {
    public static void main(String[] args) {

        //EBOB İşlemi

       int ebob = 1;
        Scanner scanner = new Scanner(System.in);

        System.out.print("1.sayıyı giriniz: ");
        int s1= scanner.nextInt();
        System.out.print("2.sayıyı giriniz: ");
        int s2= scanner.nextInt();


        if (s1<s2) {
            int i=1;
            while (i<=s1) {
                if (s1%i==0 && s2%i==0) {
                    ebob=i;
                }
                i++;
            }
            System.out.println("Ebob: "+ebob);
        }
        else
        {
            int i=1;
            while (i<=s2) {
                if (s1%i==0 && s2%i==0) {
                    ebob=i;
                }
                i++;
            }
            System.out.println("Ebob: "+ebob);
        }

        System.out.println("-------------------------------------------");

        //EKOK İşlemi

        int i=1;
        while (i<=(s1*s2)) {
            if (i%s1==0 && i%s2==0) {
                System.out.println("Ekok: "+i);
                break;
            }
            i++;
        }

        System.out.println(s1*s2 / ebob);
    }
}
