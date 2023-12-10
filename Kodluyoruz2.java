import java.util.Scanner;

public class Kodluyoruz2{
	public static void main(String[] args) {
	    double tutar, kdvTutar, kdvliTutar;
	    double kdvOran=0.18;
		Scanner scan = new Scanner(System.in);
		System.out.println("Ücret Tutarını Giriniz:");
		tutar = scan.nextDouble();
		
		kdvTutar = tutar * kdvOran;
		kdvliTutar = tutar+ kdvOran;
		
		System.out.println("KDV'li Tutar:"+kdvliTutar);
		System.out.println("KDV Tutarı:"+kdvTutar);
		System.out.println("KDV'siz Tutar:"+tutar);
		System.out.println("KDV Oranı:"+kdvOran);
	}
	
}