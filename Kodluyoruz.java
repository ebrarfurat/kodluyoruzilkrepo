import java.util.Scanner;
public class Kodluyoruz{
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int mat,fizik,kimya,turkce,tarih,muzik;
	System.out.println("Matematik Notunuzu Giriniz:");
	mat = scan.nextInt();
	System.out.println("Fizik Notunuzu Giriniz:");
	fizik = scan.nextInt();
	System.out.println("Kimya Notunuzu Giriniz:");
	kimya = scan.nextInt();
	System.out.println("Turkçe Notunuzu Giriniz:");
	turkce = scan.nextInt();
	System.out.println("Tarih Notunuzu Giriniz:");
	tarih = scan.nextInt();
	System.out.println("Muzik Notunuzu Giriniz:");
	muzik = scan.nextInt();
	
	int toplam = (mat+fizik+kimya+turkce+tarih+muzik);
	double sonuc = toplam/6;
	
	System.out.println("Ortalamanız: "+sonuc);
	
	
	
	}
	
}