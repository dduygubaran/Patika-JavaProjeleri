import java.util.Scanner;

public class CinZodyagi {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Doğum Yılınızı Giriniz: ");
        int year = scanner.nextInt();

        if (year>0) {
            if (year%12==0){
                System.out.print("Çin Zodyağı Burcunuz: MAYMUN");
            }
            else if (year%12==1) {
                System.out.print("Çin Zodyağı Burcunuz: HOROZ");
            }
            else if (year%12==2) {
            System.out.print("Çin Zodyağı Burcunuz: KÖPEK");
            }
            else if (year%12==3) {
                System.out.print("Çin Zodyağı Burcunuz: DOMUZ");
            }
            else if (year%12==4) {
                System.out.print("Çin Zodyağı Burcunuz: FARE");
            }
            else if (year%12==5) {
                System.out.print("Çin Zodyağı Burcunuz: ÖKÜZ");
            }
            else if (year%12==6) {
                System.out.print("Çin Zodyağı Burcunuz: KAPLAN");
            }
            else if (year%12==7) {
                System.out.print("Çin Zodyağı Burcunuz: TAVŞAN");
            }
            else if (year%12==8) {
                System.out.print("Çin Zodyağı Burcunuz: EJDERHA");
            }
            else if (year%12==9) {
                System.out.print("Çin Zodyağı Burcunuz: YILAN");
            }
            else if (year%12==10) {
                System.out.print("Çin Zodyağı Burcunuz: AT");
            }
            else if (year%12==11) {
                System.out.print("Çin Zodyağı Burcunuz: KOYUN");
            }

        }
        else
        {
            System.out.println("Geçersiz bir sayı girdiniz.");
        }


    }
}
