import java.util.Scanner;

public class project5 {
    public static void main(String[] args) {
        /* harmonic numbers */
        double i;
        
        Scanner scanner=new Scanner(System.in);
        System.out.println("please enter a number");
        i=scanner.nextDouble();
        double h=0.0;
      
        while(i>0){
          
            h+=1/i;
            i--;

        }
        System.out.println(h);
    }
}
