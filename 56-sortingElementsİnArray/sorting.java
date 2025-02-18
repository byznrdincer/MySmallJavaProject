import java.util.Scanner;

public class sorting {

    public static void main(String[] args) {
        /* java ile dizideki en buyuk ve nekucuk sayıyı bulan program */
        Scanner scan=new Scanner(System.in);
        System.out.println("please enter size of array");
        int size=scan.nextInt();
        int[] number=new int[size];
        for(int i=0;i<size;i++){
            System.out.println("please enter elements of array");
            number[i]=scan.nextInt();
        
        }
        //bütün değerleri gezicem 
        //min ve max dgerlerini varsayılan olarak ya da 0. index olarak atayacagım 
        //min büyükse  gezdigin deger min=gezdiğin deger
        int max=number[0];
        int min=number[0];
        for(int i=number[0];i<=size;i++){
            if(min>i){
                min=i;
            }
            if(max<i){
                max=i;
            }
        }
        System.out.println("the max number is "+max);
        System.out.println("the min number is "+min);
        

    }
}