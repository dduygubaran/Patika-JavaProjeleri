
public class AsalSayiBulma {
    public static void main(String[] args) {

        int count = 0;
        for(int s1=2;s1<=100;s1++) {

            int x = 0;
            for (int i = 2; i < s1; i++) {
                if (s1 % i == 0) {
                    x = 1;
                    break;
                }
            }
            if(x==0) {
                System.out.print(s1+",");
                count++;
            }
        }
    }
}
