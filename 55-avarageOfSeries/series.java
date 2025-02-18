import java.util.Scanner;

public class series {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("please enter array size :");
        int size = scan.nextInt();

        int[] number = new int[size];

        for (int i = 0; i < number.length; i++) {
            System.out.println("Enter the "+(i+1)+". element of the array ");
            number[i]=scan.nextInt();
            
        }
        double sum=0;
        double avarage;
        for(int i=0;i<size;i++){
            sum+=number[i];
        }
        System.out.println("the average is "+(sum/size));
    }
}