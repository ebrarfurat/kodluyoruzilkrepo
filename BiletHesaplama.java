import java.util.Scanner;
public class BiletHesaplama {
    public static void main(String[] args) {
        int km,yas,journey;
        double toplam,price,discount;
        boolean isError = false;
        Scanner scan = new Scanner(System.in);

        System.out.print("Lütfen Mesafeyi KM Cinsinden Giriniz: ");
        km = scan.nextInt();

        System.out.print("Lütfen Yaşınızı Giriniz: ");
        yas = scan.nextInt();

        System.out.print("Yolculuk Tipinizi Giriniz: ");
        journey = scan.nextInt();

        if ((km > 0) && (journey == 1 )){

            if ((yas > 24) && (yas <= 65)){
                price = (km * 0.10);
                toplam = price;

            } else if ((yas >= 12) && (yas <=24)) {
                price = (km * 0.10);
                discount = price * 0.10;
                toplam = price - discount;

            } else if (yas < 12) {
                price = (km * 0.10);
                discount = price * 0.50;
                toplam = price - discount;
            } else  {
                price = (km * 0.10);
                discount = price * 0.30;
                toplam = price - discount;
            }System.out.println("Toplam Tutar: "+ toplam);
        } else if ((km > 0) && (journey == 2)) {
            double discountJourney;
            if ((yas > 24) && (yas <= 65)){
                price = (km * 0.10);
                discount = price * 0.20;
                toplam= price - discount;

            } else if ((yas>= 12) && (yas <=24)) {
                price = (km * 0.10);
                discount = price * 0.10;
                discountJourney = discount * 0.20;
                toplam = price-(discount + discountJourney);

            } else if (yas< 12) {
                price = (km * 0.10);
                discount = price * 0.50;
                discountJourney = discount * 0.20;
                toplam = price-(discount + discountJourney);
            } else{
                price = (km * 0.10);
                discount = price * 0.30;
                discountJourney = discount * 0.20;
                toplam = price -(discount + discountJourney);
            }System.out.println("Toplam Tutar: "+ toplam);
        }
        else {
            System.out.println("Hatalı Bir Seçim Yaptınız...");
        }
    }

}