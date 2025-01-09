import java.util.Scanner;

public class prime {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("please enter a number ");
        int n=input.nextInt();

        boolean isPrime=true;
          
        for(int i=2;i<n;i++){
            if(n%i==0){
                isPrime=false;
                break;
            }
        }
        if(isPrime==true){
            System.out.println(n+" is a prime number");
        } else{
            System.out.println(n+" is not a prime number");
        }
    }
}