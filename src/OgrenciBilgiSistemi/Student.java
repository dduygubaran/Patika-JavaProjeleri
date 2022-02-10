package OgrenciBilgiSistemi;

public class Student {

    Course c1;
    Course c2;
    Course c3;
    Course s1;
    Course s2;
    Course s3;
    String name;
    String stuNo;
    String classes;
    double avarage;
    boolean isPass;

    Student() {}

    public Student(Course c1, Course c2, Course c3,Course s1, Course s2, Course s3, String name, String stuNo, String classes) {
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.avarage = 0.0;
        this.isPass = false;
    }


    void addBulkExamNote(int note1, int note2, int note3) {
        if (note1>=0 && note1<=100) {
            this.c1.note = note1;
        }
        if (note2>=0 && note2<=100) {
            this.c2.note = note2;
        }
        if (note3>=0 && note3<=100) {
            this.c3.note = note3;
        }
    }

    public void addSozluExamNote(int sozlu1, int sozlu2, int sozlu3) {

        if (sozlu1 >= 0 && sozlu1 <= 100) {
            this.s1.sozluNote = sozlu1;
        }

        if (sozlu2 >= 0 && sozlu2 <= 100) {
            this.s2.sozluNote = sozlu2;
        }

        if (sozlu3 >= 0 && sozlu3 <= 100) {
            this.s3.sozluNote = sozlu3;
        }
    }

    void printNote(){
        isPass();
        System.out.println(this.c1.name + " dersi sınav notu: "+this.c1.note );
        System.out.println(this.c1.name + " dersi sözlü notu: "+this.s1.sozluNote);
        calcAvarage();
        System.out.println();
        isPass();
        System.out.println(this.c2.name + " dersi sınav notu: "+this.c2.note );
        System.out.println(this.c2.name + " dersi sözlü notu: "+this.s2.sozluNote );
        calcAvarage1();
        System.out.println();
        isPass();
        System.out.println(this.c3.name + " dersi sınav notu: "+this.c3.note );
        System.out.println(this.c3.name + " dersi sözlü notu: "+this.s3.sozluNote );
        calcAvarage2();

    }



    void calcAvarage() {
       this.avarage = c1.note*0.80 + s1.sozluNote*0.20;
        System.out.println(this.c1.name + " Dersi Not Ortalamanız: "+this.avarage);
    }

        void calcAvarage1() {
            this.avarage = c2.note*0.80 + s2.sozluNote*0.20;
            System.out.println(this.c2.name + " Dersi Not Ortalamanız: " + this.avarage);
        }

        void calcAvarage2() {
            this.avarage = c3.note*0.80 + s3.sozluNote*0.20;
            System.out.println(this.c3.name + " Dersi Not Ortalamanız: " + this.avarage);
        }

    void isPass() {
        if (this.avarage>55) {
            System.out.println("Sınıfı Başarıyla GEÇTİNİZ!!!");
        } else {
            System.out.println("Sınıfta KALDINIZ!");
        }
    }
}
