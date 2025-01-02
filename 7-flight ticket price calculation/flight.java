import java.util.Scanner;

public class flight{
    public static void main(String[] args) {
        /* km birim fiyati:0.10$
         * 12 yaşından küçükse toplam fiyata %50 indirim 
         * 12 ve 24 yas araliğinda ise %10 indirim
         * 65 yaşindan büyükse %30 indirim 
         * gidiş dönüş alırsa %20 indirim 
         * bu koşullara göre ucak bileti hesaplayan program
         */
        Scanner scanner=new Scanner(System.in);
        int km,age,type;
        double price;
         System.out.println("flight ticket price calculation program");
         System.out.println("please enter km");
         km=scanner.nextInt();
         System.out.println("please enter your age ");
         age=scanner.nextInt();
         System.out.println("please enter your travel type ");
         type=scanner.nextInt();

         if(age<12){
            if(type==1){
                price=(km*0.10)*0.5;
                System.out.println("total price is "+price+"$");
            }
            else{
                price=2*(km*0.10)*0.5*0.8;
                System.out.println("total price is"+price+"$");
            }
         }
         else if(age>=12 && age<=24){
            if(type==1){
                price=(km*0.10)*0.90;
                System.out.println("total price is "+price+"$");
            }
            else{
                price=(km*0.10)*2*0.8*0.9;
                System.out.println("total price is"+price+"$");
            }
           
         }
         else if(age>65){
            if(type==1){
                price=(km*0.10)*0.7;
                System.out.println("total price is "+price+"$");
            }
            else{
                price=(km*0.10)*2*0.8*0.7;
                System.out.println("total price is"+price+"$");
            }
           
         }
         else{
            if(type==1){
                price=(km*0.10);
                System.out.println("total price is "+price+"$");
            }
            else{
                price=(km*0.10)*2*0.8;
                System.out.println("total price is"+price+"$");
            }
         }
    }
}