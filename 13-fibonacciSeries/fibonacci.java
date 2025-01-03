import java.util.Scanner;

public class fibonacci {

    public static void main(String[] args) {
        /* fibonacci series: 0 1 1 2 3 5 8 13 21 */
        Scanner scanner=new Scanner(System.in);
        System.out.println("please enter a number");
        int i=scanner.nextInt();
        int s1=0;
        int s2=1;
        int sum=0;
        for(int j=0;j<=i;j++){
            
            System.out.println(s1);
            sum=s1+s2;
            s1=s2;
            s2=sum;
            
        }
    }
}