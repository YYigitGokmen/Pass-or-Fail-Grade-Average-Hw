



import java.util.Scanner;



public class Pass_or_Fail {

public static void main(String[] args) {
 Scanner input = new Scanner(System.in);

int mat,fizik,turkce,kimya,muzik;

 System.out.print("Matematik Notunuz : ");
    mat=input.nextInt();

 System.out.print("Turkce Notunuz : ");
    turkce=input.nextInt();

     System.out.print("Fizik Notunuz : ");
    fizik=input.nextInt();

     System.out.print("Kimya Notunuz : ");
    kimya=input.nextInt();


     System.out.print("Muzik Notunuz : ");
    muzik=input.nextInt();


      double avrg = (mat + turkce + fizik + kimya + muzik )/5;

    if (avrg <55) {
        System.out.println("Sınıfta Kaldınız!!!");

    }
    else {
        System.out.println("Tebrikler Sınıfı Geçtiniz :) ");

     }
     System.out.println("Ortalamanız:  " + avrg);
    }
}
