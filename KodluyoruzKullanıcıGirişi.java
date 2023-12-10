import java.util.Scanner;

public class KodluyoruzKullanıcıGirişi {

    public static void main(String[] args) {
        String userName, password, newPassword;
        int a;
        Scanner scan = new Scanner(System.in);
        System.out.print("Kullanıcı Adınızı Giriniz:");
        userName = scan.nextLine();
        System.out.print("Şifreniz:");
        password = scan.nextLine();

        if (password.equals("ebrar123")) {
            System.out.println("Giriş Başarılı!!");
        } else {
            System.out.println("Şifreniz Yanlış. Yeni Şifre Oluşturmak için 1'e basınız.");
            a = scan.nextInt();
            if (a == 1) {
                System.out.println("Yeni Şifrenizi Giriniz:");
                scan.nextLine(); 
                newPassword = scan.nextLine();
                if (!newPassword.equals(password)) {
                    System.out.println("Başarılı! Yeni şifreniz: " + newPassword);
                } else {
                    System.out.println("Yeni şifre, eski şifre ile aynı olamaz. Başarısız!");
                }
            } else {
                System.out.println("Giriş Başarısız");
            }
        }
    }
}
