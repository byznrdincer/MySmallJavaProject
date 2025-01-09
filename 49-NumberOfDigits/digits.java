import java.util.Scanner;

public class digits {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("please enter a number");
        int n=input.nextInt();
        int b=0;
        while(n>0){
           n/=10;
           b++;
          
           
        }
        System.out.println(b);
    }
}