import java.util.Scanner;
public class HavaSicaklik {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);	
    int sicaklik;
    System.out.println("Lütfen Sıcaklık Giriniz:");
    sicaklik = scan.nextInt();
    
    if (sicaklik<5) {
    	System.out.println("Kayak Yapabilirsiniz.");
    }
    else if (sicaklik>=5 && sicaklik <=15) {
    	System.out.println("Sinemaya Gidebilirsiniz.");
    }
    else if(sicaklik>15 && sicaklik<=25) {
    	System.out.println("Pikniğe Gidebilirsiniz.");
    }
    else if(sicaklik>25) {
    	System.out.println("Yüzmeye Gidebilirsiniz.");
    }
    
	}

}
