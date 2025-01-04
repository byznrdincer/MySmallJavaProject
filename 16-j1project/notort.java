import java.util.Scanner;

public class notort {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Not ortalama projeme hoş geldin");
        System.out.println("fizik notunuzu giriniz");
        int f = scan.nextInt();
        System.out.println("matematik notunzu giriniz");
        int m= scan.nextInt();
        System.out.println("Türkçe notunzu giriniz");
        int t= scan.nextInt();
        System.out.println("Kimya notunzu giriniz");
        int k = scan.nextInt();
        System.out.println("Müzik notunzu giriniz");
        int M = scan.nextInt();
        System.out.println("Tarih notunzu giriniz");
        int T= scan.nextInt();
         int ort=(f+m+t+k+M+T)/6;
         System.out.println("fizik notunuz "+f);
         System.out.println("Türkçe notunuz "+t);
         System.out.println("matematik notunuz "+m);
         System.out.println("müzik notunuz "+M);
         System.out.println("Tarih notunuz "+t);
         System.out.println("kimya notunuz "+k);
         System.out.println("dönem ortalamanız:"+ort);
         


    }
}