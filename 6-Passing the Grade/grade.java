import java.util.Scanner;

public class grade {

    public static void main(String[] args) {
        /* turkce mat fen sos beden notları
        turkish,math,science,social,physicalEdu
         * notların ortalaması hesaplansın
         * ort 50 den buyukse gectı kucukse kalsın
         */
        Scanner scanner=new Scanner(System.in);
        int math,turkish,science,social,physical;
        double Gpa;
         System.out.println("please enter your math exam grade");
         math=scanner.nextInt();
         System.out.println("please enter your turkish exam grade");
         turkish=scanner.nextInt();
         System.out.println("please enter your science exam grade");
         science=scanner.nextInt();
         System.out.println("please enter your social exam grade");
         social=scanner.nextInt();
         System.out.println("please enter your physicalEdu exam grade");
         physical=scanner.nextInt();
        
         Gpa=(math+turkish+science+social+physical)/5;
         System.out.println("your Gpa is "+Gpa);
         
        if(Gpa>=50){
            System.out.println("congratulations!you passed your class");
        }
        else{
            System.out.println("unfortunately,you didn't pass your class");
        }
        
    }
}