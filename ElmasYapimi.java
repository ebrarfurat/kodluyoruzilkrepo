
import java.util.Scanner;

public class ElmasYapimi {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
               
        System.out.print("Yıldız sayısını giriniz: ");
        int sayi = input.nextInt();

      
        for (int i = 0; i < sayi; i++) {
            for (int j = 0; j < (sayi - i - 1); j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < (2 * i + 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }

     
        for (int i = sayi - 2; i >= 0; i--) {
            for (int j = 0; j < (sayi - i - 1); j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < (2 * i + 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}