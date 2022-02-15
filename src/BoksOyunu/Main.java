package BoksOyunu;

public class Main {
    public static void main(String[] args) {

        Fighter f1 = new Fighter("Savaş" , 15 , 100, 90, 45);
        Fighter f2 = new Fighter("Barış" , 10 , 95, 95, 50);
        Match match = new Match(f1,f2 , 85 , 100,37);
        match.run();
    }
}
