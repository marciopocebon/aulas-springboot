package julia.schleien.ExemploEscopo;

import julia.schleien.ExemploEscopo.dao.ClassDAO;
import julia.schleien.ExemploEscopo.dao.ClassJDBC;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.sql.SQLOutput;

@SpringBootApplication
public class ExemploEscopoApplication {

    public static void main(String[] args) {

        ApplicationContext applicationContext = SpringApplication.run(ExemploEscopoApplication.class, args);

        ClassJDBC objJDBC = applicationContext.getBean(ClassJDBC.class);
        ClassJDBC objJDBC1 = applicationContext.getBean(ClassJDBC.class);

        ClassDAO objDAO = applicationContext.getBean(ClassDAO.class);
        ClassDAO objDAO1 = applicationContext.getBean(ClassDAO.class);

        System.out.println("Objeto da classe JDBC: " + objJDBC);
        System.out.println("Objeto da classe JDBC: " + objJDBC1);

        System.out.println("Objeto da classe DAO: " + objDAO);
        System.out.println("Objeto da classe DAO: " + objDAO1);
    }

}
