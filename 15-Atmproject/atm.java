import java.util.Scanner;

public class atm {

    public static void main(String[] args) {
        int balance=1000,input;
        Scanner scan=new Scanner(System.in);
        System.out.println("hi! welcome to my bank");
        System.out.println("your current balance is "+balance);
        while (balance>0) {
            System.out.println();
            System.out.println("1-deposit money");
            System.out.println("2-Withdraw money");
            System.out.println("3-query balance");
            System.out.println("4-Log out");
            System.out.println("Select the action you want to perform");
            input=scan.nextInt();
            if(input==1){
                System.out.println("Enter the amount of money you want to deposit");
                int d=scan.nextInt();
                balance+=d;
                System.out.println("your cureent balance is "+balance);
            }
            else if(input==2){
                System.out.println("Enter the amount of money you want to withdraw");
                int c=scan.nextInt();
                if(c>balance){
                    System.out.println("sorry but the balance isn't enough");
                }else{
                    balance-=c;
                    System.out.println("your cureent balance is "+balance);
                }
             
            }
            else if(input==3){
             System.out.println("your current balance is "+balance);
            }
            else if(input==4){
                System.out.println("Successful exit was made");
               }
            

        }
        System.out.println("We hope you come again");
    }
}