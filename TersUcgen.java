import java.util.Scanner;
public class TersUcgen{
	public static void main(String[] args) {
		int a;
		int sayi;
	
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Basamak Sayısı Giriniz: ");
	sayi = scan.nextInt();
	a=sayi*2;
    for (int i = 1; i <= sayi*2; i++) {
        if (a%2==1){
            for (int j = 0; j < a; j++) {
                System.out.print("*");
            }
        }
        a--;
        System.out.println();

      }
	}
}