import java.util.Scanner;
public class KodluyoruzPratik4{
	public static void main(String[] args) {
	int km ;
	double sabit= 2.20;
	double baslangic=10;
	double toplam;
		
	Scanner scan = new Scanner(System.in);	
		System.out.println("Taksimetre Hesaplayan Program");
		System.out.println("Kaç KM mesafe yol aldınız?:");
		km = scan.nextInt();
		
		toplam = (km*sabit);
		toplam += baslangic;
		
		toplam = (toplam < 20) ? 20 : toplam;
		System.out.println("Toplam Tutar:"+toplam);

		
	}
	
	
}