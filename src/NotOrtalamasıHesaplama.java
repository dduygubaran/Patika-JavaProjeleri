
import javax.swing.plaf.synth.SynthTextAreaUI;
import java.net.StandardSocketOptions;
import java.util.Scanner;

public class NotOrtalamasıHesaplama {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Matematik Notunuzu Giriniz: ");
        int mat = scan.nextInt();
        System.out.print("Fizik Notunuzu Giriniz: ");
        int fzk = scan.nextInt();
        System.out.print("Kimya Notunuzu Giriniz: ");
        int kmy = scan.nextInt();
        System.out.print("Türkçe Notunuzu Giriniz: ");
        int trk = scan.nextInt();
        System.out.print("Tarih Notunuzu Giriniz: ");
        int trh = scan.nextInt();
        System.out.print("Müzik Notunuzu Giriniz: ");
        int mzk = scan.nextInt();

        double ort = (mat+fzk+kmy+trk+trh+mzk) / 6;
        System.out.println("Not Ortalamanız: " + ort);
        String durum = (ort>60) ? "Sınıfı Geçti" : "Sınıfı Kaldı";
        System.out.println(durum);

    }

}
