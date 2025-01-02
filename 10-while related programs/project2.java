import java.util.Scanner;

public class project2 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int i;
        int add=0;
      
        while(true){
            System.out.println("please enter your number");
            i=input.nextInt();
            if(i<0){
                System.out.println("you entered negative number ");
                System.out.println("addition:"+add);
                break;
            }
            else if(i%2==1){
                add=add+i;
                System.out.println("addition is "+add);
            }
            i++;
        }

    }
}
