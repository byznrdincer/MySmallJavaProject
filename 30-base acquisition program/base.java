import java.util.Scanner;

public class base {

    public static void main(String[] args) {
       Scanner scan=new Scanner(System.in);
       System.out.println("please enter the number of exponents "); 
       int ex=scan.nextInt();
       System.out.println("please enter the base number");
       int base=scan.nextInt();
        int power=1;
       for(int i=1;i<=ex;i++){
       
            power*=base;
          
       }
       System.out.println(power);
    }
}