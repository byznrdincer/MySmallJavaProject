import java.util.Scanner;

public class activity{
    public static void main(String[] args) {
        /* hava sıcaklıgını al 
         * sıcaklık 30 ve uzerı ıse yuzme oner 
         * 5-30 ıse sınema oner 
         * 4 ve az ise kayak oner
         */
        Scanner scan=new Scanner(System.in);
        int temperature;

        System.out.println("please enter the air temperature");
        temperature=scan.nextInt();
        System.out.println("the air temperature is :"+temperature);
        if(temperature>=30){
            System.out.println("hey!! how about swimming");
        }
        else if(temperature>=5 && temperature<30){
            System.out.println("going to cinema is the great idea for this temperature");
        }else if(temperature<=4){
            System.out.println("you can ski");
        }

    }
}