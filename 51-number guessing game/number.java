import java.util.Random;
import java.util.Scanner;

public class number {

    public static void main(String[] args) {
        int guess,life=5,i=0;
        Random rand=new Random();
        Scanner scan=new Scanner(System.in);
        int number=rand.nextInt(100);

        boolean GameState=false;
        int[] guesses=new int[5];
        System.out.println("welcome!");
        System.out.println("please enter a number in 0-99");
        while(life>0){
            System.out.println("your guessing");
            guess=scan.nextInt();
            guesses[i++]=guess;
            if(guess<0 || guess>99){
                System.out.println("please enter a number in 0-99");
                continue;
            }
            if(guess==number){
                GameState=true;
                break;
            }else{
                System.out.println("wrong,please try again! remaining life "+--life);
                if(life==0){
                    System.out.println("gameover");
                    break;
                }
            }


        }
        if(GameState){
            System.out.println("conguratulations,right guess");
            System.out.println("your number "+number);
            System.out.println(" remaining life "+life);
        }else{
            System.out.println("you dont achieve");
        }
        for(int value : guesses){
            System.out.println(value+",");
        }

    }
}