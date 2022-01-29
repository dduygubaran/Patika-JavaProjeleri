import java.util.Scanner;

public class UcakBiletiFiyatHesaplama {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Gideceğiniz mesafeyi yazınız(km): ");
        int distance = scanner.nextInt();
        System.out.println("Yaşınızı yazınız: ");
        int age = scanner.nextInt();
        System.out.println("Tek yön için 1; çift yön için 2'yi seçiniz: ");
        int direction = scanner.nextInt();

        if(distance>0 && age>0)  {

            double totalprice = distance * (0.10);


            if(age<=12){
                if (direction==2) {
                    double ageDiscount = (totalprice-(totalprice * (0.50)));
                    double directionDiscount = (ageDiscount - (ageDiscount*(0.20)))*2;
                    System.out.println(directionDiscount);
                }
                else {
                    double ageDiscount = (totalprice-(totalprice * (0.50)));
                    System.out.println(ageDiscount);
                }

            }

            else if (age>12 && age<=24) {
                if (direction==2) {
                    double ageDiscount = (totalprice-(totalprice * (0.10)));
                    double directionDiscount = ((ageDiscount- (ageDiscount*0.20))*2);
                    System.out.println(directionDiscount);
                }
                else {
                    double ageDiscount = (totalprice-(totalprice * (0.50)));
                    System.out.println(ageDiscount);
                }

            }

            else if (age>=65){
                if (direction==2) {
                    double ageDiscount = (totalprice-(totalprice * (0.30)));
                    double directionDiscount = ((ageDiscount-(ageDiscount*0.20))*2);
                    System.out.println(directionDiscount);
                }
                else {
                    double ageDiscount = (totalprice-(totalprice * (0.50)));
                    System.out.println(ageDiscount);
                }

            }
        }

        else {
            System.out.println("Geçersiz sayı girdiniz");
        }


    }
}
