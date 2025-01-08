import java.util.Scanner;

public class ebobekok {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("please enter first number");
        int number1=scan.nextInt();
        System.out.println("please enter second number");
        int number2=scan.nextInt();
        int n=Math.min(number1, number2);
        int ebob=1;


            for(int i=1;i<=n;i++){
                if(number2%i==0 && number1%i==0){
                    ebob=i;
                   
                }
             
            }
            System.out.println("ebob :"+ebob);
            int ekok=number1*number2/ebob;
            System.out.println("ekok :"+ekok);
        }
    }
