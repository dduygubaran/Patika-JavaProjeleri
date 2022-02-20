public class PalindromikKelime {
    public static void main(String[] args) {

        System.out.println(isPalindrome("kraliyet")); //ada, ana, kek, ata
    }

    public static  boolean isPalindrome(String string) {
        int i=0; //baslangıç
        int j= string.length()-1;
        while (i<j) {
            if (string.charAt(i) == string.charAt(j)) {
                return true;
            }
            i++;
            j--;
        }
        return false;
    }
}
