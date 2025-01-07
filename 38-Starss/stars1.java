public class stars1 {

    public static void main(String[] args) {
        /*
         * dikey yıldızlar
         * for(int i=0;i<5;i++){
         * System.out.println("*");
         * }
         */
        /*
         * yatay satırlar
         * for(int i=0;i<5;i++){
         * System.out.print("*");
         * }
         */
        /* dikdörtgen şekli */
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        /* sağ üçgen */
        for (int i = 0; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                // j degeri 1 den i degerine kadar arttrıılır ic dongunun amacı her satırda kac
                // yıldız basılacağını belirler
                // diş döngü ise bu yıldızların kac satırda basılacagını beliler
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        /* ters sağ üçgen */
        for (int i = 5; i >= 1; i--) {// bu dögü yıldızların kac satırda basılacağını ve her satırda kac yıldız
                                      // olacağını belirler
            for (int j = 1; j <= i; j++) {
                /*
                 * her dış döngü iterasyonu için çalışır ve j değişkenini 1'den i değerine kadar
                 * arttırır.
                 */
                System.out.print("*");
            }
            System.out.println();
            /*
             * Dış Döngü: Kaç yıldız basılacağını belirler.
             * İç Döngü: Yıldızları basar.
             */
        }

        /* piramit */
         int s=5;
        for(int i=1;i<=s;i++){
            for(int j=i;j<s;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=(2*i-1);k++){
                System.out.print("*");
            }
            System.out.println();
        } 
        System.out.println();
        /* ters piramit */
        int n=5;
        for(int i=n;i>=1;i--){
            for(int j=i;j<n;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=(2*i-1);k++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        int t=5;
        for(int i=t;i>=1;i--){
            for(int j=t;j>i;j--){
                System.out.print(" ");
            }
            for(int k=1;k<=(2*i-1);k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}