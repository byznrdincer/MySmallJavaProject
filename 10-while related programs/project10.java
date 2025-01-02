import java.util.Scanner;

public class project10 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int input,add=0;
        do {
           System.out.println("please enter a number: "); 
           input=scan.nextInt();
           if(input%2==0){
            add+=input;
           }
        } while (input<0);
        System.out.println(add);
    }
}
