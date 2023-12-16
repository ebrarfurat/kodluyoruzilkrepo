import java.util.Scanner;
class DortBesKuvvetleri{
	public static void main(String[] args) {
		int n;
		Scanner input = new Scanner(System.in);
		System.out.println("Sayı giriniz:");
		n = input.nextInt();
		
	    while(n>=0) {
	    	
	    	if(n%4==0 && n%5==0) {
	    		System.out.println(n);
	    		n--;
	    	}
	    	else {
	    		n--;
	    	}
	   	
	    }
	}
	
}