import java.util.Scanner;

public class KodluyoruzPratik6{
	public static void main(String[] args) {
	double kg,m;
	Scanner scan = new Scanner(System.in);	
		
		System.out.println("Boyunuzu metre cinsinden giriniz:");
		m = scan.nextDouble();
		System.out.println("Kilonuzu kg cinsinden giriniz:");
		kg = scan.nextDouble();
		
		double endeks= kg/(m*m);
		
		System.out.println("Vücut Kitle Endeksiniz:"+endeks);
		
		
	}
	
	
}