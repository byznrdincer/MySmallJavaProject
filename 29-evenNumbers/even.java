import java.util.Scanner;

public class even {

    public static void main(String[] args) {
        System.out.println("please enter a number");
        Scanner scan =new Scanner(System.in);
        int number=scan.nextInt();
        int total=0;
        int average;
        for(int i=1;i<=number;i++){
            if(i%4==0 && i%5==0){
               total+=i;
             

            }
        }
        System.out.println("total is "+total);
        
        
        average=(total/(number/20));
        System.out.println("average is "+average);
        /* cok mutlu oldum kendi başıma hiçbir şekilde yardım almadan algoritmayı kurdum cok mutluyum:' */
    }
}