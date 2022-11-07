import java.util.Scanner;

public class DaireAlan {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Double r,pi=3.14,a,alan,cevre,dilim ;


        System.out.print("Lütfen dairenin yarı çapını giriniz:");
        r = input.nextDouble();
        System.out.print("Lütfen dairenin merkez açı ölçüsünü giriniz:");
        a = input.nextDouble();

        alan=pi*r*r;
        cevre=2*pi*r;
        dilim=(r*r*pi*a)/360;


        System.out.println("Dairenin çevresi :" + cevre);
        System.out.println("Dairenin alanı :" + alan);
        System.out.println("Merkez açı alanı :" + dilim);





    }
}
