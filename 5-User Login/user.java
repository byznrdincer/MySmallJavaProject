import java.util.Scanner;

public class user{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String userName,password;
        System.out.print("please enter your name:");
        userName=scanner.nextLine();
        System.out.print("please enter your password:");
        password=scanner.nextLine();

        if(userName.equals("java") && password.equals("6563")){
            System.out.println("you have succesfully logged in.welcome");
        }
        else{
            System.out.println("you have logged incorrectly ,please try again");
        }
        

    }
}