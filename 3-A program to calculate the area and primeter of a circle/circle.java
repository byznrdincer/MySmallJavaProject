import java.util.Scanner;

public class circle {

    public static void main(String[] args) {
        System.out.println("program to calculate the area and circumference of a circle");
        Scanner scanner=new Scanner(System.in);
        double r,pi=3.14;
        double area,primeter;
        System.out.println("please enter the radius of the circle ");
        r=scanner.nextDouble();
        area=pi*r*r;
        primeter=2*pi*r;
        System.out.println("area of the circle:"+area);
        System.out.println("primeter of the circle: "+primeter);
        


        
    }
}