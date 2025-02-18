import java.util.Scanner;

public class min {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter how many digits to enter.");
        int n=input.nextInt();
        int max=0;
        int min=0;


        for(int i=1;i<=n;i++){
            System.out.println("please enter "+i+". number");
            int number=input.nextInt();
            if(number<min || min==0){
                min=number;
            }
            if(number>max){
                max=number;
            }
        }
        System.out.println("the max number is "+max);
        System.out.println("the min number is "+min);
    }
}