package BoksOyunu;

public class Match {

    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;
    double start;

    Match() {}

    public Match(Fighter f1, Fighter f2, int minWeight, int maxWeight,double start) {
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;

        if (start>= 0 && start <=100) {
           this.start = start;
        } else {
            this.start=0;
        }
    }

    public void run() {
        if (isCheck()) {
            while (this.f1.health > 0 && this.f2.health > 0) {
                System.out.println("=====YENİ ROUND=====");

                if (isStart()) {
                    System.out.println( this.f1.name + " oyuna başladı");;
                    this.f2.health = this.f1.hit(this.f2);
                    if (isWin()) {
                        break;
                }
                }
                else {
                    System.out.println( this.f2.name + " oyuna başladı");;
                    this.f1.health = this.f2.hit(this.f1);
                    if (isWin()) {
                        break;
                }
                }

                System.out.println(this.f1.name+" Sağlık: "+this.f1.health);
                System.out.println(this.f2.name+" Sağlık: "+this.f2.health);
            }

        } else {
            System.out.println("Sporcuların sikletleri uymuyor.");
        }
    }

    public boolean isCheck() {
        return  (this.f1.weight> minWeight && this.f1.weight < maxWeight) && (this.f2.weight > minWeight && this.f2.weight < maxWeight);
    }

    public boolean isWin() {
        if (this.f1.health==0) {
            System.out.println(this.f2.name + " kazandı");
            return true;
        }
        if (this.f2.health==0) {
            System.out.println(this.f1.name + " kazandı");
            return true;
        }
        return  false;
    }

    public boolean isStart() {
        double rndm = Math.random()*100;
        return rndm >= this.start;

    }

}
