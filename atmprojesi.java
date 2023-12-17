import java.util.Scanner;
public class atmprojesi{
	public static void main(String[] args) {
		String userName, password;
	Scanner scan = new Scanner(System.in);
	int right = 3;
    int balance = 1500;
	    System.out.println("Kullanıcı Adınızı Giriniz:");
	    userName = scan.nextLine();
	    System.out.println("Şifreyi Giriniz:");
	    password = scan.nextLine();
	    
	if(userName.equals("patika")&& password.equals("dev123")) {
		System.out.println("Bankaya Hoşgeldiniz.");
		System.out.println("1-Para yatırma\n" + "2-Para Çekme\n" + "3-Bakiye Sorgula\n" + "4-Çıkış Yap");
        System.out.print("Yapmak istediğiniz işlemi seçiniz : ");
        int select = scan.nextInt();
   
    switch (select) {
    case 1:
    	System.out.print("Para miktarını giriniz: ");
        int price = scan.nextInt();
        balance += price;
    case 2:
    	System.out.println("Para miktarını giriniz:");
    	price = scan.nextInt();
    	if (price>balance) {
    		System.out.println("Bakiye Yetersiz.");
    	}
    	else {
    		balance -= price;
    	}
    case 3:
    	System.out.println("Bakiyeniz:"+balance);
    case 4:
    	System.out.println("Tekrar görüşmek üzere.");
        break;
    }
   
	
	}
	else {
		System.out.println("Hatalı kullanıcı adı veya şifre. Tekrar deneyiniz.");
        if (right == 0) {
            System.out.println("Hesabınız bloke olmuştur lütfen banka ile iletişime geçiniz.");
	}
	}
	}
}