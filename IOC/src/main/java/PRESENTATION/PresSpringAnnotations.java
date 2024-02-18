package PRESENTATION;

import METIER.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;

@Controller
public class PresSpringAnnotations {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("DAO","METIER");
        IMetier metier = context.getBean(IMetier.class);
        System.out.println(metier.calculer());
    }
}
