import java.util.Scanner;
public class SayıSıralama {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a,b,c;
		System.out.println("GİRİLEN SAYILARI BÜYÜKLÜĞÜNE GÖRE SIRALAYAN PROGRAM");
		System.out.println("Birinci Sayıyı Giriniz:");
		a = scan.nextInt();
		System.out.println("İkinci Sayıyı Giriniz:");
		b = scan.nextInt();
		System.out.println("Üçüncü Sayıyı Giriniz:");
		c= scan.nextInt();
		
		if (a>b && b>c) {
			System.out.println("a>b>c");
		}
		else if (a>b && c>b && a>c) {
			System.out.println("a>c>b");	
		}
		else if (b>a && a>c) {
			System.out.println("b>a>c");
		}
		else if (b>c && c>a) {
			System.out.println("b>c>a");
		}
		else if (c>a && a>b) {
			System.out.println("c>a>b");
		}
		else if (c>b && b>a){
			System.out.println("c>b>a");
		}
		
		
		
	}

}
