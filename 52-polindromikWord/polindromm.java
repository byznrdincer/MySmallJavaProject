public class polindromm{
        public static void main(String[] args) {
            String str = "kapak";
            String tmp = "";
    
            // Dizgeyi tersine çevir
            for (int i = str.length() - 1; i >= 0; i--) {
                tmp += str.charAt(i);
            }
    
            // Ters çevrilen dizgeyi orijinal dizge ile karşılaştır
            if (tmp.equals(str)) {
                System.out.println("This is a palindromic word");
            } else {
                System.out.println("This is not a palindromic word");
            }
        }
    }
    

