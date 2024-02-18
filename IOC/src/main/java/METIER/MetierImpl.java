package METIER;

import DAO.DaoImpl;
import DAO.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

//@Component
@Service
public class MetierImpl implements IMetier{
    //@Autowired
    //@Qualifier("V2")
    private IDao dao;

    public MetierImpl(@Qualifier("V2") IDao dao) {
        this.dao = dao;
    }

    public void setDao(IDao dao) {
        this.dao = dao;
    }

    @Override
    public double calculer() {
        double res = dao.getData() * 34.5;
        return res;
    }
}
