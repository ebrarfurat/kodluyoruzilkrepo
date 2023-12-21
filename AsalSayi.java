
public class AsalSayi{
	public static void main(String[] args) {
	
		for (int i=2; i<=100; i++) {
			if (asalMi(i)) {
				System.out.print(i+ " ");
			}
		}
	}
		static boolean asalMi(int sayi) {
	        if (sayi < 2) {
	            return false;
	        }

	        for (int i = 2; i <= Math.sqrt(sayi); i++) {
	            if (sayi % i == 0) {
	                return false;
	            }
	        }

	        return true;
		
	}
}