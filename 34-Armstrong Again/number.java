import java.util.Scanner;


public class number{

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("armstrong number");

        System.out.println("please enter a number");
        int number=scan.nextInt();

        int a=number;
        int b=number;
        int place =0;
        int digit;
        int total=0;
        while(a>0){
            digit=a%10;
            place++;
            a/=10;
        }
        while(number>0){
            digit=number%10;
            number/=10;
            total+=(int)Math.pow(digit,place);
        }
        if(total==b){
            System.out.println("this is an Armstrong number");
        }else{
            System.out.println("this isn't an Armstrong number");
        }
    }}