import java.util.Scanner;
public class test {
    public static void main(String[] args) {

        int matematik, turkce, fizik, kimya, muzik, tarih;
        Scanner input = new Scanner(System.in);
        System.out.print("Matematik notunuzu giriniz :");
        matematik = input.nextInt();


        System.out.print("Türkçe notunuzu giriniz :");
        turkce = input.nextInt();


        System.out.print("Fizik notunuzu giriniz :");
        fizik = input.nextInt();


        System.out.print("Kimya notunuzu giriniz :");
        kimya = input.nextInt();


        System.out.print("Müzik notunuzu giriniz :");
        muzik = input.nextInt();


        System.out.print("Tarih notunuzu giriniz :");
        tarih = input.nextInt();

        int toplam = ((matematik + turkce + fizik + kimya + muzik + tarih));
        double ortalama = (toplam / 6);



        System.out.println("Ders not ortalamanız : " + ortalama);

        boolean gecmeDurumu = ortalama>=60;
        String str = gecmeDurumu ? "sınıfı gectiniz :)" : "sınıfta kaldınız :( " ;

        System.out.print(str);

    }
}
