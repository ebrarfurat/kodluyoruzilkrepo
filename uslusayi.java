import java.util.Scanner;

public class uslusayi{
	public static void main(String[] args) {
	int a,b;
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Üssü alınacak sayıyı giriniz:");
	a = scan.nextInt();
	
	System.out.println("Üs olacak sayıyı giriniz:");
	b = scan.nextInt();
	
	int sonuc = 1;
	
	for(int i = 0; i<b; i++) {
		sonuc*= a;
	}
	System.out.println(a + "^" + b + " = " + sonuc);
	
	
	
	}
	
	
}