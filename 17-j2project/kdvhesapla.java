import java.util.Scanner;

public class kdvhesapla {

    public static void main(String[] args) {
        System.out.println("Kdv tutaı hesaplayan projem");
        double kdv=0.18;
        Scanner scan =new Scanner(System.in);
        System.out.println("lütfen ürün tutarını giriniz");
        int tutar=scan.nextInt();
        double kdvliTutar= tutar+tutar*kdv;

        System.out.println("kdv oranı:"+kdv);
        System.out.println("kdv tutarı:"+tutar*kdv);

        System.out.println("ürünün kdvli tutarı:"+kdvliTutar);

    }
}