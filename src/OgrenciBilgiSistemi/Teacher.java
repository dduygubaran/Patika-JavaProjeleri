package OgrenciBilgiSistemi;

public class Teacher {

    String name;
    String mpNo;
    String branch;

    Teacher() {}

    public Teacher(String name, String mpNo, String branch) {
        this.name = name;
        this.mpNo = mpNo;
        this.branch = branch;
    }

    void print() {
        System.out.println("Adı: "+this.name);
        System.out.println("Telefon No: "+this.mpNo);
        System.out.println("Dal: "+this.branch);
    }
}
