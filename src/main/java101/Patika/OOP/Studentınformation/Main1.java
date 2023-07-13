package main.java101.Patika.OOP.Studentınformation;

public class Main1 {
    public static void main(String[] args) {

        Teacher t1 = new Teacher("Mahmut hoca", "TRH", "555");
        Teacher t2 = new Teacher("Graham Bell", "FZK", "444");
        Teacher t3 = new Teacher("Külyutmaz", "BIO", "333");

        Course tarih = new Course("Tarih", "101", "TRH");
        tarih.addTeacher(t1);

        Course fizik = new Course("Fizik", "102", "FZK");
        fizik.addTeacher(t2);

        Course biyo = new Course("Biyoloji", "103", "BIO");
        biyo.addTeacher(t3);


        Student s1 = new Student("Harun", "123", "4", fizik, tarih, biyo);
        s1.addBulkExamNote(100, 50, 70);
        s1.isPass();
        Student s2 = new Student("Enes", "987", "4", fizik, tarih, biyo);
        s2.addBulkExamNote(100, 80, 90);
        s2.isPass();
        Student s3=new Student("Mete","456","4",fizik,tarih,biyo);
        s3.addBulkExamNote(90,50,70);
        s3.isPass();
    }
}
