import java.util.Scanner;
public class KodluyoruzHesapMakine {

	public static void main(String[] args) {
	 int sayi1, sayi2, secim;
		Scanner scan = new Scanner(System.in);
	System.out.println("Birinci Sayıyı Giriniz:");
	sayi1 = scan.nextInt();
	System.out.println("İkinci Sayıyı Giriniz:");
	sayi2 = scan.nextInt();
	System.out.println("Toplama ise 1");
	System.out.println("Çıkarma ise 2");
	System.out.println("Çarpma ise 3");
	System.out.println("Bölme ise 4 yazınız.");
	System.out.print("Seçiminiz:");
	secim = scan.nextInt();
	switch (secim) {
	case 1:
		System.out.println("Toplam:"+(sayi1+sayi2));
		break;
	case 2:
		System.out.println("Çıkarma:"+(sayi1-sayi2));
		break;
	case 3:
		System.out.println("Çarpım:"+(sayi1*sayi2));
		break;
	case 4:
		System.out.println("Bölme:"+(sayi1/sayi2));
	    break;
	}
	
	
	
	
	
	
	
	}
}
