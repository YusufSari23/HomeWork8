import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String userName, password, sifirlama, newpassword;

        Scanner inp = new Scanner(System.in);

        System.out.print("Kullanıcı Adınız : ");
        userName = inp.nextLine();

        System.out.print("Şifreniz : ");
        password = inp.nextLine();

        if (userName.equals("patika") && password.equals("java123")) {
            System.out.print("Giriş Yaptınız !");
        } else {
            System.out.println("Bilgileriniz Yalnış ! ");

            System.out.print("Şifrenizi Sıfırlamak İstermisiniz ? ");
            sifirlama = inp.nextLine();

            if (sifirlama.equals("evet")) {
                System.out.print("Yeni Şifrenizi Giriniz : ");
            }
            newpassword = inp.nextLine();

            if (newpassword.equals("java123")) {
                System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
            }else{
                System.out.println("Şifre Oluşturuldu");
            }
        }
    }
}