import java.util.Scanner;

public class BurcHesaplama {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String month;
        int day;

        System.out.println("Lütfen Doğum Ayınızı Giriniz:");
        month = scan.nextLine().toLowerCase(); 
        System.out.println("Lütfen Doğum Gününüzü Giriniz:");
        day = scan.nextInt();

        String[] burclar = {"koç", "boğa", "ikizler", "yengeç", "aslan", "başak", "terazi", "akrep", "yay", "oğlak", "kova", "balık"};

        if (month.equals("mart")) {
            if (day < 21) {
                System.out.println("Balık");
            } else if (day <= 31) {
                System.out.println("Koç");
            }
        } else if (month.equals("nisan")) {
            if (day <= 20) {
                System.out.println("Koç");
            } else if (day <= 30) {
                System.out.println("Boğa");
            }
        } else if (month.equals("mayıs")) {
            if (day <= 21) {
                System.out.println("Boğa");
            } else if (day <= 31) {
                System.out.println("İkizler");
            }
        } else if (month.equals("haziran")) {
            if (day <= 20) {
                System.out.println("İkizler");
            } else if (day <= 30) {
                System.out.println("Yengeç");
            }
        } else if (month.equals("temmuz")) {
            if (day <= 22) {
                System.out.println("Yengeç");
            } else if (day <= 31) {
                System.out.println("Aslan");
            }
        } else if (month.equals("ağustos")) {
            if (day <= 22) {
                System.out.println("Aslan");
            } else if (day <= 31) {
                System.out.println("Başak");
            }
        } else if (month.equals("eylül")) {
            if (day <= 22) {
                System.out.println("Başak");
            } else if (day <= 30) {
                System.out.println("Terazi");
            }
        } else if (month.equals("ekim")) {
            if (day <= 22) {
                System.out.println("Terazi");
            } else if (day <= 31) {
                System.out.println("Akrep");
            }
        } else if (month.equals("kasım")) {
            if (day <= 21) {
                System.out.println("Akrep");
            } else if (day <= 30) {
                System.out.println("Yay");
            }
        } else if (month.equals("aralık")) {
            if (day <= 21) {
                System.out.println("Yay");
            } else if (day <= 31) {
                System.out.println("Oğlak");
            }
        } else if (month.equals("ocak")) {
            if (day <= 19) {
                System.out.println("Oğlak");
            } else if (day <= 31) {
                System.out.println("Kova");
            }
        } else if (month.equals("şubat")) {
            if (day <= 20) {
                System.out.println("Kova");
            } else if (day <= 29) {
                System.out.println("Balık");
            }
        } else {
            System.out.println("Geçersiz ay");
        }
    }
}
