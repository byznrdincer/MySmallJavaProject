import java.util.Scanner;

public class taksimetre {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("taksimetre hesaplama projesi");
        double km;
        System.out.println("lütfen gideceğiniz mesafeyi km cinsinden giriniz");
        km=scan.nextInt();
        double taksimetre=10+2.20*km;
        String a="kısa mesafe";
        if(taksimetre<20){ taksimetre=20;
            System.out.println("tutar=20tl");}
        if(taksimetre>20){
            System.out.println("taksimetre tutarı"+taksimetre);
        }
    }
}