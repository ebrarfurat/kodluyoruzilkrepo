import java.util.Scanner;

public class MukemmelSayi {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        int sayi = scanner.nextInt();

        if (sayi <= 0) {
            System.out.println("Lütfen pozitif bir sayı giriniz.");
        } else {
            if (isMukemmelSayi(sayi)) {
                System.out.println(sayi + " Mükemmel sayıdır.");
            } else {
                System.out.println(sayi + " Mükemmel sayı değildir.");
            }
        }
    }

    static boolean isMukemmelSayi(int sayi) {
        int toplam = 0;
        for (int i = 1; i <= sayi / 2; i++) {
            if (sayi % i == 0) {
                toplam += i;
            }
        }
        return toplam == sayi;
    }
}

