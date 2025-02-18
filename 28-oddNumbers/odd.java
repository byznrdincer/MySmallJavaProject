import java.util.Scanner;

public class odd {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int total = 0;

        while (true) {
            System.out.println("please enter a number");
            int number = scan.nextInt();
            if (number % 2 == 1) {
                total += number;
            } else if (number < 0) {
                break;
            }
        }
        System.out.println("the total is " + total);
        /*
         * int number;
         * do {
         * System.out.println("please enter a number");
         * number=scan.nextInt();
         * if(number%2==1){
         * total+=number;
         * }
         * } while (number>0);
         * System.out.println("the total is "+total);
         */
        /*
         * System.out.println("please enter a number");
         * int number=scan.nextInt();
         * while(number>0){
         * if(number%2==1){
         * total+=number;
         * }
         * System.out.println("please enter a number");
         * number=scan.nextInt();
         * 
         * }
         * System.out.println("the total is "+total);
         */
    }
}