import java.util.Scanner;

public class BuyuktenKucugeSıralama {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("1. sayıyı giriniz:");
        int number1 = scan.nextInt();
        System.out.println("2. sayıyı giriniz:");
        int number2 = scan.nextInt();
        System.out.println("3. sayıyı giriniz:");
        int number3 = scan.nextInt();

        if ((number1)<(number2) && (number1)<(number3)){
            if ((number2<number3) ) {
                System.out.println(+number1+"<"+number2+"<"+number3);
            } else {
                System.out.println(+number1+"<"+number3+"<"+number2);
            }
        }
        else if((number2<number3) &&(number2<number1)){
            if(number3<number1) {
                System.out.println(+number2+"<"+number3+"<"+number1);
            }else {
                System.out.println(+number2+"<"+number1+"<"+number2);
            }
        }
        else if ((number3<number2) && (number3<number1)) {
            if (number2<number1){
                System.out.println(+number3+"<"+number2+"<"+number1);
            }else {
                System.out.println(+number3+"<"+number1+"<"+number2);
            }

        }
    }
}

