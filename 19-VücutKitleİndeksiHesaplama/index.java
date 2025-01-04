import java.util.Scanner;

public class index {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("vücut kitle indeksi hesaplayan program");
        System.out.println("kilonuzu kg cinsinden giriniz ");
        int kg=scanner.nextInt();
        System.out.println("boyunuzu m cinsinden giriniz ");
        double boy=scanner.nextDouble();
         double formül=kg/(boy*boy);
         System.out.println("vucut kitle indeksiniz: "+formül);

        if(formül<18.5){
            System.out.println("zayıf");

        }
        if(formül>18.5 && formül<24.9){
            System.out.println("Normal");
            
        }
        if(formül>25 && formül<29.9){
            System.out.println("fazla kilolu");
            
        }
        if(formül>30 && formül<34.9){
            System.out.println("1.derece obez");
            
        }
        if(formül>35 && formül<39.9){
            System.out.println("2.derece obez");

            
        }
        if(formül>40){
            System.out.println("3.derece obez");
            
        }

    }
}