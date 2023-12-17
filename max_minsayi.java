import java.util.Scanner;

public class max_minsayi {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Kaç Tane Sayı Gireceksiniz? : ");
        int n = scan.nextInt();

        if (n <= 0) {
            System.out.println("Lütfen Geçerli Bir Sayı Giriniz.");
            return;
        }

        int enBuyuk = Integer.MIN_VALUE;
        int enKucuk = Integer.MAX_VALUE;

        for (int i = 1; i <= n; i++) {
            System.out.print(i + ". Sayıyı Giriniz: ");
            int sayi = scan.nextInt();

            if (sayi > enBuyuk) {
                enBuyuk = sayi;
            }
            if (sayi < enKucuk) {
                enKucuk = sayi;
            }
        }

        System.out.println("En büyük sayı: " + enBuyuk);
        System.out.println("En küçük sayı: " + enKucuk);

        scan.close();
    }
}
