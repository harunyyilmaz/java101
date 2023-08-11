package main.java101.Kodlamaio.KodlamioWithNLayerdApp.business;

import main.java101.Kodlamaio.KodlamioWithNLayerdApp.Logging.Logger;
import main.java101.Kodlamaio.KodlamioWithNLayerdApp.dataAccess.CourseDao;
import main.java101.Kodlamaio.KodlamioWithNLayerdApp.entities.Course;

public class CourseManager {
    private CourseDao courseDao;
    private Logger[] loggers;

    public CourseManager(CourseDao courseDao, Logger[] loggers) {
        this.courseDao = courseDao;
        this.loggers = loggers;
    }

    public void add(Course course) throws Exception {

            if (course.getPrice() < 0) {
                throw new Exception("Kurs fiyatı sıfırdan küçük olamaz.");

            }
            courseDao.add(course);

            for(Logger logger:loggers){
                logger.log(course.getName());
            }

    }
}
