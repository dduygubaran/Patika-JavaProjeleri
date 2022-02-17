package SiniflarMaasHesaplayici;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("Duygu Baran",10500,45,2012);
        employee.ToString();

        System.out.println("==================");

        Employee employee2 = new Employee("Harun Arslanlı",7500,40,2016);
        employee2.ToString();
    }

}
