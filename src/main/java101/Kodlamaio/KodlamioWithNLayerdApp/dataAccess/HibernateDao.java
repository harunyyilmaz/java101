package main.java101.Kodlamaio.KodlamioWithNLayerdApp.dataAccess;

import main.java101.Kodlamaio.KodlamioWithNLayerdApp.entities.Category;
import main.java101.Kodlamaio.KodlamioWithNLayerdApp.entities.Course;
import main.java101.Kodlamaio.KodlamioWithNLayerdApp.entities.Instructor;

public class HibernateDao implements CategoryDao, CourseDao, InstructorDao {
    public void add(Category category) {
        System.out.println("Hibernate ile veritabanına eklendi.");
    }

    public void add(Course course) {
        System.out.println("Hibernate ile veritabanına eklendi.");
    }

    public void add(Instructor instructor) {
        System.out.println("Hibernate ile veritabanına eklendi.");
    }
}
