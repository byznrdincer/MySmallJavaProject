import java.util.Scanner;

public class bus {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the distance");
        int km=scan.nextInt();
        if(km<=0  ){
            System.out.println("you logged in incorrectly");
        }
        System.out.println("enter  your ages");
        int age=scan.nextInt();
        if(age<=0  ){
            System.out.println("you logged in incorrectly");
        }
        System.out.println("enter your trip type");
        int type=scan.nextInt();
        if(type!=1 && type!=2  ){
            System.out.println("you logged in incorrectly");
        }
        double price=km*0.1;

        if(age<12){
            if(type==2){
               System.out.println("price is "+(price=2*price*0.8*0.5)); 
            }else{
                System.out.println("price is "+(price=price*0.5));
            }
        }
       else if(age>12 && age<24){
            if(type==2){
               System.out.println("price is "+(price=2*price*0.8*0.9)); 
            }else{
                System.out.println("price is "+(price=price*0.9));
            }
        }
       else if(age>65){
            if(type==2){
               System.out.println("price is "+(price=2*price*0.8*0.7)); 
            }else{
                System.out.println("price is "+(price=price*0.7));
            }
        }
        else{
            if(type==1){
                System.out.println("price is "+(price));
            }
          else{
            System.out.println("price is "+(price*2));
          }
        }
        
 
    }
}