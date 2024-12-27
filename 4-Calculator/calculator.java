import java.util.Scanner;

public class calculator{
    public static void main(String[] args) {
        System.out.println("Calculator program");
        Scanner scanner=new Scanner(System.in);
        int a,b;
        char x;
    
        System.out.println("please enter the first number ");
        a=scanner.nextInt();
        System.out.println("please enter the second number ");
        b=scanner.nextInt();
        System.out.println("please enter the character");
        x=scanner.next().charAt(0);
        System.out.println("entered character: "+x);

        switch(x){
            case '+':System.out.println("result: "+(a+b));
                    break;
            case '-':System.out.println("result: "+(a-b));
                    break;
            case '*':System.out.println("result: "+(a*b));
                    break;
            case '/':System.out.println("result: "+(a/b));
                    break;
            case '%':System.out.println("result: "+(a%b));
                    break;
            default:System.out.println("invalid input");
        }
        
        scanner.close();
    }
}