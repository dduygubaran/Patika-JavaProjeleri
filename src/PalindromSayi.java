import java.util.Scanner;

public class PalindromSayi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir Sayı Giriniz: ");
        int n = scanner.nextInt();
        isPalindrom(n);
    }

    static boolean isPalindrom(int number){
        int temp = number,reverseNumber = 0,lastNumber;
        while(temp !=0 ){
            lastNumber = temp % 10;
            reverseNumber = (reverseNumber * 10) + lastNumber;
            temp /= 10;
        }
        if (number == reverseNumber){
            System.out.println(number +" Sayısı Palindrom Bir Sayıdır.");
            return true;
        }else{
            System.out.println(number +" Sayısı Palindrom Bir Sayi Değildir.");
            return false;
        }
    }




}
