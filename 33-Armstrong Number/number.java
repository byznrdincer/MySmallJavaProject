import java.util.Scanner;

public class number {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
     /*    System.out.println("please enter a number ");
        int number = scan.nextInt();
        int Armstrong;
        int ones, tens, hundreds, thousand; */
        /*
         * sayı kaç basamaklı n sayısı elde et
         * sayının her bir basamağina nasıl ulaşırım
         * üs alma işlemi nasıl yaparız
         */
        /* basamak sayısı */
     /*    int digitCount = 0;
        int tempNumber = number;
        do {
            tempNumber = tempNumber / 10;
            digitCount++;
        } while (tempNumber != 0);

        System.out.println(digitCount);
 */
        /* sayının basamaklarına ulaşma */
      /*   int total = 0;
        int digitpow = 1;
        tempNumber = number;
        while (tempNumber != 0) {
            int digitNumber = tempNumber % 10;
            digitpow = 1;
            for (int i = 1; i <= digitCount; i++) {
                digitpow *= digitNumber;
            }
            total += digitpow;
            tempNumber = tempNumber / 10;
          
          
        }
        System.out.println(total);

        if(total==number){
         System.out.println("this is a armstrong number");
        }else{
         System.out.println("this isn't armstrong number");}
 */
        /*
         * if(number>=10 && number<100){
         * ones=number%10;
         * tens=(number/10);
         * Armstrong=(ones*ones)+(tens*tens);
         * if(number==Armstrong){
         * System.out.println("this is a armstrong number");
         * }else{
         * System.out.println("this isn't armstrong number");
         * }}
         * if(number>=100 && number<1000){
         * ones=number%10;
         * tens=(number/10)%10;
         * hundreds=(number/100);
         * 
         * Armstrong=(ones*ones*ones)+(tens*tens*tens)+(hundreds*hundreds*hundreds);
         * if(number==Armstrong){
         * System.out.println("this is a armstrong number");
         * }else{
         * System.out.println("this isn't armstrong number");
         * }
         * }
         * 
         * if(number>=1000 && number<10000){
         * ones=number%10;
         * tens=(number/10)%10;
         * hundreds=(number/100)%10;
         * thousand=number/1000;
         * 
         * Armstrong=(ones*ones*ones*ones)+(tens*tens*tens*tens)+(hundreds*hundreds*
         * hundreds*hundreds)+(thousand*thousand*thousand*thousand);
         * if(number==Armstrong){
         * System.out.println("this is a armstrong number");
         * }else{
         * System.out.println("this isn't armstrong number");
         * }
         * }
         */
        /*
         * int Armstrong=(ones*ones*ones)+(tens*tens*tens)+(hundreds*hundreds*hundreds);
         */

    }
}