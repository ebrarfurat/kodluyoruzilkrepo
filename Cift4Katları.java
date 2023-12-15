import java.util.Scanner;
class Cift4Katları{
	public static void main(String[] args) {
	int sayi;
	int toplam=0;
	Scanner scan = new Scanner(System.in);
	
	do {
		System.out.println("Sayı Giriniz:");
	    sayi = scan.nextInt();
	    if (sayi%4==0) {
	    	toplam += sayi;
	    }
	
   } while(sayi%2==0);
		
	System.out.println("Toplam: "+ toplam);
	}
	
}