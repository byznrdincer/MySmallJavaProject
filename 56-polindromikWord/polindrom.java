public class polindrom {

    public static void main(String[] args) {
        String str = "yay";
        String tmp = " ";

        for (int i = str.length() - 1; i >= 0; i--) {
            tmp += str.charAt(i);
        }

        if (tmp.equals(str)) {// stringlerde karşilastırma olarak equals kullanılır
            System.out.println("this is polindromik word");
        }else{
            System.out.println("this is not polindromik word");
        }
    }
}