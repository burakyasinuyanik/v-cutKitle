//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.Scanner;

public class prariknotortalama {
    public test() {
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Matematik notunuzu giriniz :");
        int matematik = input.nextInt();
        System.out.print("Türkçe notunuzu giriniz :");
        int turkce = input.nextInt();
        System.out.print("Fizik notunuzu giriniz :");
        int fizik = input.nextInt();
        System.out.print("Kimya notunuzu giriniz :");
        int kimya = input.nextInt();
        System.out.print("Müzik notunuzu giriniz :");
        int muzik = input.nextInt();
        System.out.print("Tarih notunuzu giriniz :");
        int tarih = input.nextInt();
        int toplam = matematik + turkce + fizik + kimya + muzik + tarih;
        double ortalama = (double)(toplam / 6);
        System.out.println("Ders not ortalamanız : " + ortalama);
        boolean gecmeDurumu = ortalama >= 60.0;
        String str = gecmeDurumu ? "sınıfı gectiniz :)" : "sınıfta kaldınız :( ";
        System.out.print(str);
    }
}
