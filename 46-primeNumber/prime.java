import java.util.Scanner;

public class prime {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please enter a number");
        int n = input.nextInt();
        if (n ==2) {
            System.out.println("2 is a prime number");}

        for (int i = 2; i < n; i++) {

            if (n % i == 0) {
               
                    System.out.println(n+" isn't a prime number");
                    break;

             
            } else {
                System.out.println(n+" is a prime number");
                break;
            }
        }
    }
}