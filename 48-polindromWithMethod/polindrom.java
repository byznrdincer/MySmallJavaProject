public class polindrom {

    public static void main(String[] args) {
       f(32344);
      System.out.println(isPolindrom(323)); 
    }

    static int f(int x) {
        int reverseNumber = 0;
        int originalx=x;
        while (x != 0) {
            int remainder = x % 10;
            reverseNumber =reverseNumber* 10 + remainder;
            x /= 10;


        }
        if(originalx==reverseNumber){
            System.out.println("this is a polindrom number");
        }else{
            System.out.println("this is not polindrom number");
        }
        return 0;
    }
    static boolean isPolindrom(int y){
        int reverseNumber=0;
        int originaly=y;
        while(y!=0){
           int remainder=y%10;
           reverseNumber=reverseNumber*10+remainder;
           y/=10;

        }
        if(reverseNumber==originaly)
         return true;
         
         else 
         return false;

    }

}