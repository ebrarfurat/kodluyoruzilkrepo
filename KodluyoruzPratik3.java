import java.util.Scanner;
public class KodluyoruzPratik3{
	public static void main(String[] args) {
	
	int a, b;	
	double c;
	Scanner scan = new Scanner(System.in);	
	System.out.println("Dik Üçgende Hipotenüs");
	System.out.println("Üçgenin 1.kenarını giriniz:");
	a = scan.nextInt();
	System.out.println("Üçgenin 2.kenarını giriniz:");
	b = scan.nextInt();
	
	c = Math.sqrt((a*a)+(b*b));
    System.out.println("Hipotenüs Uzunluğu:"+c);
		
	}
	
	
}