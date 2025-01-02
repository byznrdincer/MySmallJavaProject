import java.util.Scanner;

public class project4 {
    public static void main(String[] args) {
        /* factorial calculation */
        Scanner scanner=new Scanner(System.in);
        int i;
        int j=1;
        System.out.println("please enter a number ");
        i=scanner.nextInt();

        while(i>0){
            
            j*=i;
            i--;
        }
        System.out.println(j);
      
    }
}
