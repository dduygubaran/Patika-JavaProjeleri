import java.util.Scanner;

public class HipotenüsBulanProgram {

    public static void main(String[] args) {

        /*Scanner scan = new Scanner(System.in);

        System.out.println("1. kenar uzunluğunu giriniz: ");
        int a = scan.nextInt();
        System.out.println("2. kenar uzunluğunu giriniz: ");
        int b = scan.nextInt();

        double c=Math.sqrt ((a*a)+(b*b));

        System.out.println("Hipotenüs Uzunluğu : "+c);*/

        //--------------------------------------------------------------

        Scanner scan = new Scanner(System.in);

        System.out.println("1. kenarı giriniz: ");
        int x= scan.nextInt();
        System.out.println("2. kenarı giriniz:");
        int y= scan.nextInt();
        System.out.println("3. kenarı giriniz:");
        int z= scan.nextInt();

        double u = (x+y+z) /2;
        double çevre = 2*u;

        double alan = Math.sqrt(u * ((u-x)*(u-y)*(u-z)) );
        System.out.println("Alan: "+alan);


    }


}
