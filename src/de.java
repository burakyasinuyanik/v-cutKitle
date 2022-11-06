import java.util.Scanner;
public class de {

    public static void main(String[] args) {

        double tutar, kdvTutar, kdvliTutar, kdv;
        boolean kdvDurum;

        Scanner input = new Scanner(System.in);
        System.out.println("Ücret tutarını giriniz: ");
        tutar = input.nextDouble();

        kdvDurum = (tutar <= 999) && (tutar >= 1000);
        kdv = kdvDurum ? 0.18 : 0.8;

        kdvTutar = tutar * kdv;
        kdvliTutar = kdvTutar + tutar;

        System.out.println("KDV Oranı : " + kdv);
        System.out.println("KDV'siz Tutar : " + tutar);
        System.out.println("KDV Tutarı : " + kdvTutar);
        System.out.println("KDV'li Tutarı: " + kdvliTutar);
}
}
