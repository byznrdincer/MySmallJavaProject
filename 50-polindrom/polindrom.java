import java.util.Scanner;

public class polindrom {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("please enter a number");
        int n=input.nextInt();
        int reverseNumber=0;
        int orıgınalNumber=n;
        while(n!=0){
            int digit=n%10;
            reverseNumber=reverseNumber*10+digit;
        
            n/=10;




        }
        System.out.println(reverseNumber);
        if(reverseNumber==orıgınalNumber){
            System.out.println("this is a polindrom number");
        }else{
            System.out.println("this is not polindrom number");
        }
    }
}
/* buna daha sonra tekrar bak */