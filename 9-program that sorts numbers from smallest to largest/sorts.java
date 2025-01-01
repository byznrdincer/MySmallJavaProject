import java.util.Scanner;

public class sorts {

    public static void main(String[] args) {
        /* a>b>c veya a>c>b
         * b>a>c b>c>a
         * c>a>b c>b>a
         */
        Scanner scan =new Scanner(System.in);
        int a,b,c;
        System.out.println("please enter  three numbers ");
        a=scan.nextInt();
        b=scan.nextInt();
        c=scan.nextInt();
        System.out.println("your numbers are:"+a+" "+b+" "+c);
        if(a>b && a>c ){
            if(b>c){
                System.out.println(" a is biggest number and c is the smallest number ");
            }else{
                System.out.println(" a is biggest number and b is the smallest number ");
            }
        }
        if(b>a && b>c ){
            if(a>c){
                System.out.println(" b is biggest number and c is the smallest number ");
            }else{
                System.out.println(" b is biggest number and a is the smallest number ");
            }
        }
        if(c>a && c>b ){
            if(a>b){
                System.out.println(" c is biggest number and b is the smallest number ");
            }else{
                System.out.println(" c is biggest number and a is the smallest number ");
            }
        }

    }
}