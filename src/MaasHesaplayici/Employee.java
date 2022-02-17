package MaasHesaplayici;

public class Employee {

    String name;
    double salary;
    int workHours;
    int hireYear;

    public Employee() {}

    public Employee(String name, int salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public void print() {
        System.out.println("Adı: "+this.name);
        System.out.println("Maaşı: "+this.salary);
        System.out.println("Çalışma Saati: "+this.workHours);
        System.out.println("Başlangıç Yılı: "+this.hireYear);
    }

    public double tax() {
        if (this.salary > 1000) {
            return this.salary * 0.03;
        } else {
            return 0;
        }
    }

        public int bonus() {
            if (this.workHours > 40) {
                return (this.workHours - 40) * 30;
            } else {
                return 0;
            }
        }

        public double raiseSalary() {
            int workTime = 2021 - this.hireYear;
            if (workTime < 10) {
                return this.salary * 0.05;
            } else if (workTime > 9 && workTime < 20) {
                return this.salary * 0.10;
            }
            else {
                return this.salary * 0.15;
            }
        }

        public void ToString () {
        print();
        System.out.println("Vergi Miktarı: " + tax());
        System.out.println("Bonus: " + bonus());
        System.out.println("Maaş Zammı: " + raiseSalary());
        System.out.println("Bonus ve Vergi ile Maaş Miktarı: " + (this.salary + bonus() - tax()));
        System.out.println("Toplam Maaş: " + (this.salary + raiseSalary()));
    }

}
