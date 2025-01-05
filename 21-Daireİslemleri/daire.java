import java.util.Scanner;

public class daire {

    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("dairenın cevre ve alan hesabı");
        int r;
        System.out.println("dairenin yarıcapını giriniz");
        r=scan.nextInt();
        double cevre=2*Math.PI*r;
        double alan=Math.PI*r*r;
        System.out.println("dairenin alanı: "+cevre);
        System.out.println("dairenin cevresi: "+alan);

    }
}