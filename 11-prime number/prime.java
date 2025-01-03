import java.util.Scanner;

public class prime {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int i;
        boolean prime=true;
       do {
            System.out.println("please enter a number:");
            i=scanner.nextInt();
        } while (i<2);
        for(int j=2;j<i;j++){
            if(i%j==0){
                prime=false;
                break;
            }
        }
        if(prime){
            System.out.println("entered number is "+i+"prime");
        }
        else{
            System.out.println("it is not prime");
        }
    }
}