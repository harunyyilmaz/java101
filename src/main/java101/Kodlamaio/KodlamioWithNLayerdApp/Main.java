package main.java101.Kodlamaio.KodlamioWithNLayerdApp;


import main.java101.Kodlamaio.KodlamioWithNLayerdApp.Logging.DataLogger;
import main.java101.Kodlamaio.KodlamioWithNLayerdApp.Logging.FileLogger;
import main.java101.Kodlamaio.KodlamioWithNLayerdApp.Logging.Logger;
import main.java101.Kodlamaio.KodlamioWithNLayerdApp.Logging.MailLogger;
import main.java101.Kodlamaio.KodlamioWithNLayerdApp.business.CategoryManager;
import main.java101.Kodlamaio.KodlamioWithNLayerdApp.business.CourseManager;
import main.java101.Kodlamaio.KodlamioWithNLayerdApp.business.InstructorManager;
import main.java101.Kodlamaio.KodlamioWithNLayerdApp.dataAccess.HibernateDao;
import main.java101.Kodlamaio.KodlamioWithNLayerdApp.dataAccess.JdbcDao;
import main.java101.Kodlamaio.KodlamioWithNLayerdApp.entities.Category;
import main.java101.Kodlamaio.KodlamioWithNLayerdApp.entities.Course;
import main.java101.Kodlamaio.KodlamioWithNLayerdApp.entities.Instructor;


public class Main {
    public static void main(String[] args) throws Exception {

        Course course = new Course("Yazılım", 1, 500);
        Category category = new Category("A");
        Instructor instructor = new Instructor("Harun");

        Logger[] loggers = new Logger[]{new DataLogger(),new FileLogger(),new MailLogger()};

        CourseManager courseManager = new CourseManager(new HibernateDao(),loggers);
        courseManager.add(course);
        CategoryManager categoryManager = new CategoryManager(new JdbcDao(),loggers);
        categoryManager.add(category);
        InstructorManager instructorManager = new InstructorManager(new HibernateDao(),loggers);
        instructorManager.add(instructor);


    }
}
