import java.util.Scanner;

public class project9 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        /* negatif bir deger girilene kadar kullanıcıdan girişleri kabul eden ve girilen değerlerden cift sayıları toplayan program */
        int input,add=0;
        while(true){
            System.out.println("please enter a number ");
            input=scanner.nextInt();
            if(input<0){
                System.out.println("negatif sayı girdiniz!!");
                break;
            }
            if(input%2==0){
                add+=input;
                System.out.println(add);

            }
        }
    
    }
}
