public class fibonacci {

    public static void main(String[] args) {
     
        System.out.println(f(9));
    }

    static int f(int x) {

        if (x <= 1)
            return x;
        else
            return f(x - 1) + f(x - 2);
    }
}
/* bak şimdi x==1 değil de x<=1 dememizin sebebi mesela ben xe 2 degerini veririsem 0 ın ne oldugunu bilemem bu yuzden 2 yı bulamam 2 yı bulamazsam 3 u de bulamam boylece recursive fonksıyonu bulamam */