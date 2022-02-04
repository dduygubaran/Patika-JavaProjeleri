import java.util.Scanner;

public class TersUcgenYildiz {
    public static void main(String[] args) {
        Scanner klavye=new Scanner(System.in);

        System.out.print("Bir Sayı Giriniz: ");
        int s=klavye.nextInt();

        for(int i=0;i<s;i++){
            for(int j=0;j<=i;j++){
                System.out.print(" ");
            }
            for(int k=2*s-1;k>=(2*i+1);k--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
