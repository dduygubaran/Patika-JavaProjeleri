import java.util.Scanner;

public class KullanıcıGirişi {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Kullanıcı Adı Oluşturunuz: ");
        String userName = scan.nextLine();
        System.out.println("Şifrenizi Oluşturunuz: ");
        int password = scan.nextInt();
        System.out.println("Şifrenizi Doğrulamak İçin Tekrar Giriniz: ");
        int password2 = scan.nextInt();

        if (password == password2)
        {
            System.out.println("Şifreniz Başarılı Bir Şekilde Oluşturuldu.");
        }
        else
        {
            System.out.println("Şifrenizi Mi Unuttunuz ? Yeni Şifre Oluşturmak İçin 1'e Çıkmak İçin 2'ye Basınız. ");
            int decide = scan.nextInt();

            switch (decide) {
                case 1:
                    System.out.println("Yeni Şifre Oluşturunuz: ");
                    int newpassword = scan.nextInt();

                    if (newpassword == password) {
                        System.out.println("Şifre Oluşturulamadı Lütfen Başka Bir Şifre Deneyiniz.");
                    }
                    else {
                        System.out.println("Şifre Başarılı Bir Şekilde Oluşturuldu.");
                    }
                    break;
                case 2:
                    System.out.println("Çıkış Yaptınız. ");
                    break;
                default:

            }

        }

    }
}
