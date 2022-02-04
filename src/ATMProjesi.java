import java.util.Scanner;

public class ATMProjesi {
    public static void main(String[] args) {
        String userName, password;
        Scanner scanner = new Scanner(System.in);
        int right = 3;
        int balance = 10000;
        int select;
        while (right > 0) {
            System.out.print("Kullanıcı Adınız :");
            userName = scanner.nextLine();
            System.out.print("Parolanız : ");
            password = scanner.nextLine();

            if (userName.equals("duygu") && password.equals("dbrn95")) {
                System.out.println("Merhaba, BARAN Bankasına Hoşgeldiniz!");

                do {
                    System.out.println("1-Para yatırma\n" +
                            "2-Para Çekme\n" +
                            "3-Bakiye Sorgula\n" +
                            "4-Çıkış Yap");
                    System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz : ");
                    select = scanner.nextInt();

                    switch (select) {
                        case 1:
                            System.out.print("Yatırmak İstediğiniz Para Miktarı : ");
                            int price = scanner.nextInt();
                            balance += price;
                            break;
                        case 2:
                            System.out.print("Çekmek İstediğiniz Para Miktarı : ");
                            price = scanner.nextInt();
                            if (price > balance) {
                                System.out.println("Bakiye Yetersiz.");
                            } else {
                                balance -= price;
                            }
                            break;
                        case 3:
                            System.out.println("Mevcut Bakiyeniz : " + balance);
                            break;
                    }

                } while (select != 4);
                System.out.println("Tekrar Görüşmek Üzere.");
                break;
            }
            else{
                right--;
                System.out.println("Hatalı Kullanıcı Adı veya Şifre. Tekrar Deneyiniz.");
                if (right == 0) {
                    System.out.println("Hesabınız Bloke Olmuştur. Lütfen Banka İle İletişime Geçiniz.");
                } else {
                    System.out.println("Kalan Hakkınız : " + right);
                }
            }
        }

    }
}
