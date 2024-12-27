import java.util.Scanner;

public class Vat {
    public static void main(String[] args) {
        /**
         * product cost
         * Vat rate
         * vat
         * current price
         */
        double total, priceWithVat;
        double VatRate = 0.18;
        Scanner input = new Scanner(System.in);

        System.out.println("please enter total");
        total = input.nextDouble();
        priceWithVat = total + (total * VatRate);
        System.out.println("priceWithVat: "+priceWithVat);
    }
}