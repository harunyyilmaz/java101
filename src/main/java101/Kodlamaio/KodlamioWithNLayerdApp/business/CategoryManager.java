package main.java101.Kodlamaio.KodlamioWithNLayerdApp.business;

import main.java101.Kodlamaio.KodlamioWithNLayerdApp.Logging.Logger;
import main.java101.Kodlamaio.KodlamioWithNLayerdApp.dataAccess.CategoryDao;
import main.java101.Kodlamaio.KodlamioWithNLayerdApp.entities.Category;


public class CategoryManager {

    private CategoryDao categoryDao;
    private Logger[] loggers;

    public CategoryManager(CategoryDao categoryDao, Logger[] loggers) {
        this.categoryDao = categoryDao;
        this.loggers = loggers;
    }

    public void add(Category category) {
        System.out.println("Kategori ismi tekrar edemez.");

        categoryDao.add(category);

        for (Logger logger: loggers){
            logger.log(category.getName());
        }
    }


}
