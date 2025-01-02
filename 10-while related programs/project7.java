import java.util.Scanner;

public class project7 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int a,b,k=1;
        System.out.println("üssü alınacak sayı?");
        a=scan.nextInt();
        System.out.println("üs sayısı");
        b=scan.nextInt();
        int i=1;
        while(i<=b){
            k=k*a;
            i++;
        }
        System.out.println(k);

    }
}
/* while o işlemin kac defa yapılacagını ifade eder 
 * yani i b den kucuk oldugu surece b kadar a carpar
*/