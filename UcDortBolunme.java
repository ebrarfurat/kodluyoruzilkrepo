import java.util.Scanner;
class UcDortBolunme{
	public static void main(String[] args) {
	int a;
	Scanner input = new Scanner(System.in);

	System.out.println("Sayı Giriniz:");
	a=input.nextInt();
	
	for(int i = 0 ; i<=a ; i++) {
		if(i%3==0 && i%4==0) {
			System.out.println(i);
		}
	}
	
	
	
	
	}
	
}
