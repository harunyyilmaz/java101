package main.java101.Kodlamaio.KodlamioWithNLayerdApp.business;

import main.java101.Kodlamaio.KodlamioWithNLayerdApp.Logging.Logger;
import main.java101.Kodlamaio.KodlamioWithNLayerdApp.dataAccess.InstructorDao;
import main.java101.Kodlamaio.KodlamioWithNLayerdApp.entities.Instructor;

public class InstructorManager {

    private InstructorDao instructorDao;
    private Logger[] loggers;

    public InstructorManager(InstructorDao instructorDao,Logger[] loggers) {
        this.instructorDao = instructorDao;
        this.loggers=loggers;
    }

    public void add(Instructor instructor){

        System.out.println("Eğitmen ismi tekrar edemez");

        instructorDao.add(instructor);

        for(Logger logger:loggers){
            logger.log(instructor.getName());
         }
    }
}
