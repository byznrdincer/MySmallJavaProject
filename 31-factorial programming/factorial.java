import java.util.Scanner;

public class factorial {

    public static void main(String[] args) {
        System.out.println("factorial programming");
        Scanner scan =new Scanner(System.in);
        System.out.println("please Enter the number to be factored");
        int fact=scan.nextInt();
        int j=1;
        for(int i=1;i<=fact;i++){
            j*=i;
          
        }
        System.out.println(j);
    }
}