import java.util.Scanner;

public class DaireninAlanınıÇevresiniHesaplayanProgram {
    public static void main(String[] args) {
        /* Java ile yarı çapını kullanıcıdan aldığınız dairenin alanını ve çevresini hesaplayan programı yazın.
        Alan Formülü : π * r * r;   Çevre Formülü : 2 * π * r;
        */

        /* Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen yarıçap değerini giriniz: ");
        int r = scan.nextInt();

        double çevre = 2*(3.14)*r;
        double alan = (3.14)*r*r;

        System.out.println("Dairenin Çevresi: "+çevre);
        System.out.println("Dairenin Alanı: "+alan); */
//--------------------------------------------------------------------------
        /* Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire diliminin alanı bulan programı yazınız.
        𝜋 sayısını = 3.14 alınız.  Formül : (𝜋 * (r*r) * 𝛼) / 360 */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen yarıçap değerini giriniz: ");
        int r = scan.nextInt();
        System.out.println("Lütfen açı değerini giriniz: ");
        int a = scan.nextInt();

        double dilimAlan = ((3.14)*r*r*a)/360;
        System.out.println("Daire diliminin alanı: "+dilimAlan);


    }
}
