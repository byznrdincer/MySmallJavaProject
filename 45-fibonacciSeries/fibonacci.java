import java.util.Scanner;

public class fibonacci {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("fibonacci series");
        System.out.println("please enter a number ");
        int n = input.nextInt();

        /*
         * a=b
         * b=a+b
         */
        int a = 0;
        int b = 1;
        int i = 0;
        while (i < n) {
            System.out.print(a + " ");
            int temp = a + b;

            a = b;
            b = temp;

            i++;
        }
    }
}