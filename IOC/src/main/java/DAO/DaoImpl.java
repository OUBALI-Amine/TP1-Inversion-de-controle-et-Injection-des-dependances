package DAO;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

//@Component
@Repository
public class DaoImpl implements IDao{
    @Override
    public double getData() {
        System.out.println("Version base de données");
        return 55;
    }
}
