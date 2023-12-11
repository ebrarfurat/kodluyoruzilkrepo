import java.util.Scanner;
public class ArtıkYılHesaplama {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int yil;
	System.out.println("Lütfen yıl giriniz:");
	yil = scan.nextInt();
	
	if (yil%4==0) {
		System.out.println(yil+"artık yıldır.");
	}
	else if (yil%100==0 && yil%4!=0) {
    	System.out.println(yil+"artık yıl değildir.");
    }
	else if(yil%4!=0) {
		System.out.println(yil+"artık yıl değildir.");
	}
	}

}
