import java.util.Scanner;

public class perfect {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("please enter a number ");
        int number=scan.nextInt();
        int total=0;
        for(int i=1;i<number;i++){
            if(number%i==0){
                total+=i;
            }
        }
        System.out.println(total);
        if(number==total){
            System.out.println("this is perfect number");
        }else{
            System.out.println("this isn't a perfect number");
        }
    }
}