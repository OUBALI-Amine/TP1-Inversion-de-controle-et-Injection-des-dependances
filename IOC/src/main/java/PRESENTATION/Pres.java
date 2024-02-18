package PRESENTATION;

import DAO.IDao;
import METIER.IMetier;

import java.io.File;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Pres {
    public static void main(String[] args) throws Exception {
        //DaoImpl dao = new DaoImpl(); // Instanciation statique
        Scanner scanner = new Scanner(new File("config.txt"));
        String daoClassName = scanner.nextLine();
        Class cDao = Class.forName(daoClassName);
        IDao dao = (IDao) cDao.getConstructor().newInstance(); // => new DaoImpl()


        //MetierImpl metier = new MetierImpl();
        String metierClassName = scanner.nextLine();
        Class cMetier = Class.forName(metierClassName);
        IMetier metier = (IMetier) cMetier.getConstructor(IDao.class).newInstance(dao); // => new MetierImpl()


        // injection des dépendances par setters
        //metier.setDao(dao); // injection des dépendances statique
        //Method setDao = cMetier.getDeclaredMethod("setDao", IDao.class);
        //setDao.invoke(metier,dao); // injection des dépendances dynamique

        System.out.println(metier.calculer());
    }
}
