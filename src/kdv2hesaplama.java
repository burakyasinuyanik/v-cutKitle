import java.util.Scanner;

public class kdv2hesaplama {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double tutar,kdv,kdvliTutar;
        boolean kdvDurum;

        System.out.print("Lütfen bir tutar giriniz:");
        tutar = input.nextDouble();

        kdvDurum=( tutar<1000) && ( tutar > 0);
        kdv = kdvDurum ? 0.18 : 0.08;
        kdvliTutar = (tutar * kdv)+tutar ;

        System.out.println("Kdv'siz fiyatınız :" +tutar);
        System.out.println("Kdv'li fiyatınız :" + kdvliTutar);
        System.out.println("Kdv oranınız :" +kdv);

    }

}
