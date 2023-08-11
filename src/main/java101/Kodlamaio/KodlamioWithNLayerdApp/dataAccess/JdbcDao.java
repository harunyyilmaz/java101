package main.java101.Kodlamaio.KodlamioWithNLayerdApp.dataAccess;

import main.java101.Kodlamaio.KodlamioWithNLayerdApp.entities.Category;
import main.java101.Kodlamaio.KodlamioWithNLayerdApp.entities.Course;
import main.java101.Kodlamaio.KodlamioWithNLayerdApp.entities.Instructor;

public class JdbcDao implements CategoryDao, CourseDao, InstructorDao {
    public void add(Category category) {
        System.out.println("jdbc ile veritabanına eklendi.");
    }

    public void add(Course course) {
        System.out.println("jdbc ile veritabanına eklendi.");
    }

    public void add(Instructor instructor) {
        System.out.println("jdbc ile veritabanına eklendi.");
    }

}
