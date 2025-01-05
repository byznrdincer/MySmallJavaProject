import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        System.out.println("this is a calculator");
        Scanner scan = new Scanner(System.in);
        char operate;
        System.out.println("please enter the first number ");
        int a = scan.nextInt();
        System.out.println("please enter the second number ");
        int b = scan.nextInt();

        System.out.println("please enter the operation you want to perform");
        operate = scan.next().charAt(0);

        if(operate=='+'){
            System.out.println("Addition: "+(a+b));
        }
        if(operate=='-'){
            System.out.println("Subtraction: "+(a-b));
        }
        if(operate=='*'){
            System.out.println("Multiplication: "+(a*b));
        }
        if(operate=='/'){
            System.out.println("Division: "+(a/b));
        }

    }
}