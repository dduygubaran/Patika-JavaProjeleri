import java.util.Scanner;

public class HavaSıcaklıgı {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Hava Sıcaklığını Giriniz: ");
        int temperature = scan.nextInt();

        if (temperature < 5)
        {
            System.out.println("Kayak Yapabilirsiiniz");
        }
        else if (temperature > 5){
            if (temperature<15) {
                System.out.println("Sinemaya Gidebilirsiniz");
            }
            else if (temperature>15 && temperature <25)
            {
                System.out.println("Pikniğe Gidebilirsiniz");
            }
            else if (temperature>25){
                System.out.println("Yüzmeye Gidebilirsiniz");
            }
        }

    }
}
