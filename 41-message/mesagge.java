import java.util.Scanner;

public class mesagge {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("program that calculates message length");
        System.out.println("please enter a message");
        String message =scan.nextLine();
        

       
        System.out.println(message.length());
        
        double sms =message.length()/36.0;
        System.out.println("your mesaage is "+sms+" message size");
    
       
    }
}