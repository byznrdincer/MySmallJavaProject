import java.util.Scanner;

public class power {

    public static void main(String[] args) {
        System.out.println("power of number");
        Scanner scan=new Scanner(System.in);

        System.out.println("please enter a number ");
        int number=scan.nextInt();
        System.out.println("please enter limit value");
        int limit=scan.nextInt();
        int power=1;
        for(int i=1;power<limit;i++){
            System.out.println(power);
            power*=number;
           
        }
       
 /*      for(int i=1;i<=limit;i*=number){
        System.out.println(i);
   
       
    } */
    }
}
/* bir saatimi aldı ama Başardımmmmmmmmmmm
 */