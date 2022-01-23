import java.util.Scanner;

public class VücutKitleİndeksiHesaplama {
    public static void main(String[] args) {
        /*
        Vücut Kitle İndeksi Hesaplama
        Java ile kullanıcıdan boy ve kilo değerlerini alıp bir değişkene atayın.
        Aşağıdaki formüle göre kullanıcının "Vücut Kitle İndeks" değerini hesaplayıp ekrana yazdırın.
        Formül : Kilo (kg) / Boy(m) * Boy(m)
         */

        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen boyunuzu giriniz(metre cinsinden): ");
        double boy = scan.nextDouble();
        System.out.println("Lütfen kilonuzu giriniz: ");
        int kilo = scan.nextInt();

        double vki = (kilo / (boy*boy));
        System.out.println("Vücut Kitle İndeksiniz: "+vki);

    }
}
