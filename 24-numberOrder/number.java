import java.util.Scanner;

public class number {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("number order project");
        int a, b, c;
        System.out.println("please enter the first number ");
        a = scan.nextInt();
        System.out.println("please enter the Second number ");
        b = scan.nextInt();
        System.out.println("please enter the Thirth number ");
        c = scan.nextInt();

        if(a>b && a>c){
            if(b>c){
                System.out.println(a+">"+b+">"+c);
            }else{
                System.out.println(a+">"+c+">"+b);
            }
        }
        if(b>a && b>c){
            if(a>c){
                System.out.println(b+">"+a+">"+c);
            }else{
                System.out.println(b+">"+c+">"+a);
            }
        }
        if(c>b && c>a){
            if(b>a){
                System.out.println(c+">"+b+">"+a);
            }else{
                System.out.println(c+">"+a+">"+b);
            }
        }
    }
}