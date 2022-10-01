import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double para;
        double kdvli,kdvtutar;

        Scanner tutar = new Scanner(System.in);

        System.out.println("Para Tutarını Giriniz");
        para = tutar.nextInt();

        if (para>=0 && para<=1000 ) {
            kdvtutar = (para*18)/100;
            kdvli = kdvtutar+para;
        }
        else {
            kdvtutar = (para*8)/100;
            kdvli = kdvtutar+para;
        }

        System.out.println("KDV\'siz Fiyat: " +para);
        System.out.println("KDV\'li Fiyat: " +kdvli);
        System.out.println("KDV Tutarı: " +kdvtutar);









    }
}