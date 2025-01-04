import java.util.Scanner;

public class hipotenüs {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Hipotenüs hesaplayan program");
        System.out.println("lütfen ücgenin kenarlarını giriniz");
        int a = scan.nextInt();
        int b = scan.nextInt();
        double hipo = Math.sqrt(a * a + b * b);
        System.out.println("hipotenüsün uzunluğu: " + hipo);

        double UcgeninCevresi;
        double u;
        u = (a + b + hipo) / 2;
        UcgeninCevresi = 2 * u;
        double alan=Math.sqrt(u*(u-a)*(u-b)*(u-hipo));

        System.out.println("üçgenin çevresi: " + UcgeninCevresi);
        System.out.println("üçgenin alanı: "+alan);

    }
}