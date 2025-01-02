import java.util.Scanner;

public class project8 {

    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        int i,add=0;
        do {
            System.out.println("please enter a number ");
            i=scan.nextInt();
            if(i%2==0){
             add+=i;   
            }
        } while (i>0);
            System.out.println(add);
        }
    }
