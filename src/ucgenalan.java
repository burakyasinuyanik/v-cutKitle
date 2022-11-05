import java.util.Scanner;
public class ucgenalan {

    public static void main(String[] args) {

        double a, b,c,cevre,alan,u;
        Scanner input = new Scanner(System.in);

        System.out.print("a kenarını giriniz: ");
        a = input.nextDouble();

        System.out.print("b kenarını giriniz: ");
        b = input.nextDouble();

        System.out.print("c kenarını giriniz: ");
        c = input.nextDouble();

        u = (a+b+c)/2;
        cevre=2*u;
        alan = Math.sqrt(u*(u-a)*(u-b)*(u-c));

        System.out.println("Üçgenin çevresi:"+ cevre);
        System.out.println("Üçgenin alanı:"+ alan);




    }
}
