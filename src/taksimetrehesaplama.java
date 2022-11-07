import java.sql.SQLOutput;
import java.util.Scanner;

public class taksimetrehesaplama {

     public static void main(String[] args) {

         Scanner input= new Scanner(System.in);

       Double km,ucretKm, ilkKm ;
       boolean kmKontrol;

         System.out.print("Lütfen km bilgisi giriniz:"  );
         ucretKm = input.nextDouble();

         ilkKm = ucretKm*2.20+10;
         kmKontrol = (0 < ilkKm) && (ilkKm < 20);
         km = kmKontrol ? 20 : ilkKm ;
         System.out.println("Ödenecek tutar : " +km);



    }

}
