import java.util.Scanner;

public class Kombinasyon {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("n sayısını giriniz:");
        int n = scan.nextInt();
        
        System.out.println("r sayısını giriniz:");
        int r = scan.nextInt();

        if (n >= r && n >= 0 && r >= 0) {
            int sonuc = faktoriyel(n) / (faktoriyel(r) * faktoriyel(n - r));
            System.out.println("C(" + n + ", " + r + ") = " + sonuc);
        } else {
            System.out.println("Hatalı giriş! (n >= r, n >= 0, r >= 0 olmalı)");
        }

        scan.close();
    }

    public static int faktoriyel(int sayi) {
        if (sayi == 0 || sayi == 1) {
            return 1;
        }
        return sayi * faktoriyel(sayi - 1);
    }
}
