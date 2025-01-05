import java.util.Scanner;

public class manav {

    public static void main(String[] args) {
        System.out.println("manav sepet tutarı hesaplama");
        Scanner scan=new Scanner(System.in);
        double salatalık=3.14;
        double elma=4.11;
        double kabak=2.22;
        double domates=0.95;
        double patlıcan=7.00;

        System.out.println("aldıgınız meyve kg'ını yazar mısınız");
        System.out.println("salatalık kg:");
       double s=scan.nextInt();
        System.out.println("elma kg: ");
       double e=scan.nextInt();
        System.out.println("kabak kg: ");
       double k=scan.nextInt();
        System.out.println("domates kg: ");
       double d=scan.nextInt();
        System.out.println("patlıcan kg: ");
       double p=scan.nextInt();

        double SepetTutarı=salatalık*s+elma*e+kabak*k+domates*d+patlıcan*p;
        System.out.println("sepet tutarı: "+SepetTutarı);

        
    }
}