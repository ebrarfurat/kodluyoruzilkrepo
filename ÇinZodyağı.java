import java.util.Scanner;
public class ÇinZodyağı {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int a;
	System.out.println("Doğum Yılınızı Giriniz:");
	a = scan.nextInt();
	
	if (a%12==0) {
		System.out.println("Maymun");
	}
	if (a%12==1) {
		System.out.println("Horoz");
	}
	if (a%12==2) {
		System.out.println("Köpek");
	}
	if (a%12==3) {
		System.out.println("Domuz");
	}
	if (a%12==4) {
		System.out.println("Fare");
	}
	if (a%12==5) {
		System.out.println("Öküz");
	}
	if (a%12==6) {
		System.out.println("Kaplan");
	}
	if (a%12==7) {
		System.out.println("Tavşan");
	}
	if (a%12==8) {
		System.out.println("Ejderha");
	}
	if (a%12==9) {
		System.out.println("Yılan");
	}
	if (a%12==10) {
		System.out.println("At");
	}
	if (a%12==11) {
		System.out.println("Koyun");
	}
	
     scan.close();
}
}


