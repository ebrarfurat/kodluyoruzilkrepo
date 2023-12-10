import java.util.Scanner;
public class KodluyoruzPratik7 {

	public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	
	double armut,elma,domates,muz,patlican;	
	double armut1 = 2.14;
	double elma1 = 3.67;
	double domates1 = 1.11;
	double muz1 = 0.96;
	double patlican1 = 5.00;
	
	System.out.println("Armut kaç kg?");
	armut = scan.nextDouble();
	System.out.println("Elma kaç kg?");
	elma = scan.nextDouble();
	System.out.println("Domates kaç kg?");
	domates = scan.nextDouble();
	System.out.println("Muz kaç kg?");
	muz = scan.nextDouble();
	System.out.println("Patlıcan kaç kg?");
	patlican = scan.nextDouble();
	
	double tutar = armut1*armut+elma1*elma+domates1*domates+muz1*muz+patlican1*patlican;
	System.out.println("Toplam Tutar:"+tutar);
			 
	
	

	}

}
