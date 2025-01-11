import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] notes = new int[7];
        System.out.println("please enter your math notes");
        notes[0] = scan.nextInt();
        System.out.println("please enter your turkısh notes");
        notes[1] = scan.nextInt();
        System.out.println("please enter your science notes ");
        notes[2] = scan.nextInt();
        System.out.println("please enter your social notes ");
        notes[3] = scan.nextInt();
        System.out.println("please enter your physical notes ");
        notes[4] = scan.nextInt();
        System.out.println("please enter your math2 notes ");
        notes[5] = scan.nextInt();
        System.out.println("please enter your social2 notes ");
        notes[6] = scan.nextInt();
        int sum=0;
        double average=0;

        for (int i = 1; i < notes.length; i++) {
            sum+= notes[i];
            average=sum/i;
        }
        System.out.println(sum);
        System.out.println(average);

    }

}