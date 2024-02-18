package DAO.EXTENSION;

import DAO.IDao;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

//@Component("V2")
@Repository("V2")
public class DaoImpl2 implements IDao {
    @Override
    public double getData() {
        System.out.println("Version web services");
        return 23.6;
    }
}
