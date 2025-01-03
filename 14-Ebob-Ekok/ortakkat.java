import java.util.Scanner;

public class ortakkat {

    public static void main(String[] args) {
       Scanner scan=new Scanner(System.in);
       int ebob=1,ekok;
       System.out.println("please enter first number"); 
       int a=scan.nextInt();
       System.out.println("please enter second number"); 
       int b=scan.nextInt();

       int min=(a>b)?b:a;
        for(int i=min;i>0;i--){
            if((a%i==0) && (b%i==0)){
                ebob=i;
                break;
            }
        }
        ekok=(a*b)/ebob;
        System.out.println("ekok "+ekok+" ebob: "+ebob);
    }
}