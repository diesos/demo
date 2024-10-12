package foreach.cda;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;

import foreach.cda.Models.Etudiant;
import foreach.cda.Services.EtudiantService;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        JdbcTemplate jdbcTemplate = (JdbcTemplate) context.getBean("jdbcTemplate");

        EtudiantService etudiantService = new EtudiantService(jdbcTemplate);
        System.out.println(etudiantService.getAll());
        for (Etudiant etudiant : etudiantService.getAll()) {
            System.out.println(etudiant.getNom() + " " + etudiant.getPrenom());
        }
    }
}
