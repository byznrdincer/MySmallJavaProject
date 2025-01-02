import java.util.Scanner;

public class project3 {
    public static void main(String[] args) {
        /* girilen sayıya kadar olan ikinin kuvvetleri */
        Scanner scanner=new Scanner(System.in);
        int i;
        int j=1;
        System.out.println("please enter your number");
        i=scanner.nextInt();
        while(j<i){
                System.out.println(j);
                j=j*2;


        }
        
    }
}
