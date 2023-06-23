import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int mat,fizik,kimya,turkce,tarih,muzik;
         Scanner inp=new Scanner(System.in);

         System.out.print("Matematik notunu giriniz:");
         mat=inp.nextInt();

         System.out.print("fizik notunuzu giriniz:");
         fizik=inp.nextInt();

         System.out.print("kimya notunuzu giriniz:");
         kimya=inp.nextInt();

         System.out.print("türkçe notunuzu giriniz:");
         turkce=inp.nextInt();

         System.out.print("tarih notunuzu giriniz:");
         tarih=inp.nextInt();

         System.out.print("müzik notunuzu giriniz:");
         muzik=inp.nextInt();

         double ort=(mat+fizik+kimya+turkce+tarih+muzik)/6.0;
         String sonuc=ort>=50.0 ?"geçtiniz":"kaldınız";
         System.out.println("ortalamanız:"+ort+""+sonuc);

        }
    }
