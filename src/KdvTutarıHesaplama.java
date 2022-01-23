import java.util.Scanner;

    public class KdvTutarıHesaplama {
        public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);

            double pMiktar = 0;
            System.out.println("Para miktarınızı giriniz: ");
            pMiktar= scan.nextInt();

            double durum = (pMiktar >= 1000) ? 0.08 : 0.18;

            double kdvTutar = pMiktar * durum;
            double kdvliFiyat = pMiktar+kdvTutar;

            System.out.println("KDV Tutarınız: "+kdvTutar);
            System.out.println("KDV'li Fiyatınız: "+kdvliFiyat);


        }

    }

