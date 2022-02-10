package OgrenciBilgiSistemi;

public class Course {
    Teacher teacher;
    String name;
    String code;
    String prefix;
    int note;
    int sozluNote;

    Course() {}

    public Course(String name, String code, String prefix) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        int note = 0;
        int sozluNote = 0;
    }

    void addTeacher(Teacher teacher) {
       if (teacher.branch.equals(this.prefix)) {
           this.teacher = teacher;
           printTeacher();
       } else {
           System.out.println("Öğretmenin branchi ve dersin prefixi uyuşmamaktadır.");
       }
    }

    void printTeacher(){
        this.teacher.print();
    }
}
