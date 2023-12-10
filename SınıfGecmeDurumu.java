import java.util.Scanner;
public class SınıfGecmeDurumu {

	public static void main(String[] args) {
		
    Scanner scan = new Scanner(System.in);
    int mat, fizik, turkce, kim, muzik;
    double ortalama;
    System.out.println("Matematik Notunuzu Giriniz:");
    mat = scan.nextInt();
    System.out.println("Fizik Notunuzu Giriniz:");
    fizik = scan.nextInt();
    System.out.println("Turkçe Notunuzu Giriniz:");
    turkce = scan.nextInt();
    System.out.println("Kimya Notunuzu Giriniz:");
    kim = scan.nextInt();
    System.out.println("Muzik Notunuzu Giriniz:");
    muzik = scan.nextInt();
    
    ortalama=(mat+fizik+turkce+kim+muzik)/5;
    
    if (ortalama>=55) {
    	System.out.println("Geçtiniz. Ortalamanız: "+ortalama);
    }
    else {
    	System.out.println("Kaldınız. Ortalamanız: "+ortalama);
    }
	}

}
