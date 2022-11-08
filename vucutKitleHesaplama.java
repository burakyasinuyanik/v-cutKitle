import java.util.Scanner;
public class vucutKitleHesaplama {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);

        double boy,kilo,endex;
        boolean durum;
        String sonuc,fazla ,normal;
        System.out.print("lütfen boyunuzu cm cinsinden giriniz :");
        boy = input.nextDouble();

        System.out.print("lütfen kilonuzu kg. cinsinden giriniz :");
        kilo = input.nextDouble();

        endex=kilo/(boy*boy)*10000;


        System.out.println(endex);





    }
}
