import java.util.Scanner;

public class year {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /*
         * artık yıl 4 ün katı olan yıllardır
         * 100 ün katı olan yıllardan sadece 400e kalansız bölünenler artık yıldır
         */
        System.out.println("please enter a year");
        int year = scan.nextInt();

        if (year % 4 == 0 && year % 100 != 0 ||year%400==0) {
            System.out.println("this is  a leap year");
        } else {
            System.out.println("this is not a leap year");
        }
    }

}
