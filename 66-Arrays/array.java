import java.util.Scanner;

public class array {

    public static void main(String[] args) {
        /* dizideki tekrar eden sayıları bulan program */
        Scanner scan=new Scanner(System.in);
        System.out.println("please enter the number size");
        int size=scan.nextInt();
        int[] numbers=new int[size];

        for(int i=0;i<numbers.length;i++){
            System.out.println("please enter the number");
            numbers[i]=scan.nextInt();
        }
        boolean[] checked=new boolean[numbers.length];

        System.out.println("repeating numbers in a series: ");
        for(int i=0;i<numbers.length;i++){
            int count=1;
            if(!checked[i]){
                for(int j=i+1;j<size;j++){
                    if(numbers[i]==numbers[j]){
                        count++;
                        checked[j]=true;
                    }
                 
                }
                if(count>1){
                    System.out.println(numbers[i]+"("+count+")");
                }
            }
         
        }
        

    
    }
}