import java.util.Scanner;

public class harmonic {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("please enter a number ");
        int h=scan.nextInt();
        double result=0;
        for(double i=1;i<=h;i++){
            result+=(1.0/i);
            /* 1 saatimi almişti 
             * sebep int/int bölersek sonuc int cıkar o yuzden result sonuc vermez bu yuzden i yi int değil de double yaptık
             * ya da 1 değil de 1.0/i yaparsak da olur
             * ve evet bir tane sıfır bir saatime maal oldu arkadaslar:( Beyza yazılımın zorluklarıyla yüzleşiyor ) 
             */
            
        }
        
       
        System.out.println(result);
    }
}
/* 1+ 1/2+ 1/3 ... +1/h */