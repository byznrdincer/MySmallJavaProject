import java.util.Scanner;

public class lessons {

    public static void main(String[] args) {
        System.out.println("Welcome,can you please enter your exam grades");
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter your quiz grade");
        int quiz=scanner.nextInt();
        System.out.println("enter your first exam grade ");
        int firstExam=scanner.nextInt();
        System.out.println("enter your second exam grade ");
        int secondExam=scanner.nextInt();

        double Gpa=((quiz*20+firstExam*40+secondExam*40)/100);
        System.out.println("your gpa:"+Gpa);
        if(Gpa>50){
            System.out.println("Congratulations,you passed the exam");
        }else{
            System.out.println("i'm sorry,you didn't pass the exam");
        }



    }
}