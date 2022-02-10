package OgrenciBilgiSistemi;

public class Main {
    public static void main(String[] args) {

        Teacher t1 = new Teacher("Duygu Baran", "0505","MAT");
        Teacher t2 = new Teacher("Seçil Akdeniz","0555","FZK");
        Teacher t3 = new Teacher("Banu Kaya","0543", "BIO");
        // t1.print();

        Course mat = new Course("Matematik","101","MAT");
        Course fzk = new Course("Fizik", "102", "FZK");
        Course bio = new Course("Biyoloji", "103", "BIO");
        // mat.addTeacher(t2);
        mat.addTeacher(t1);
        fzk.addTeacher(t2);
        bio.addTeacher(t3);

        Student s1 = new Student(mat, fzk, bio,mat,fzk,bio, "Sinem Ayyıldız", "1234", "3");
        s1.addBulkExamNote(100,78,60);
        s1.addSozluExamNote(25,90,56);
        s1.printNote();

    }
}
