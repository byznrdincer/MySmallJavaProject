import java.util.Random;
import java.util.Scanner;

public class number {

    public static void main(String[] args) {
        int guess,life=5;
        Random rand=new Random();
        Scanner scan=new Scanner(System.in);
        int number=rand.nextInt(100);
        boolean gameState=false;
        System.out.println(number);
        System.out.println("Welcome to Game");
        System.out.println("I kept a number in 0-99");
        while(life>0){
            System.out.println("your guessing :");
            guess=scan.nextInt();
            if((guess<0 || guess>99)){
                System.out.println("please enter a number in 0-99");
                continue;
            }
            if(guess==number){
                gameState=true;
                break;
            }else{
                System.out.println("wrong,please try again remainder life "+--life);
            }
        }
        if(gameState){
            System.out.println("congratulations, right guessing!");
            System.out.println("your number "+number);
            System.out.println("remainder life "+life);

        }else{
            System.out.println("your couldn't achieve");
        }
    }
}