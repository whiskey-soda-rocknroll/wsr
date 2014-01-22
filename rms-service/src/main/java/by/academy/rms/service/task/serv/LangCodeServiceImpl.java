package by.academy.rms.service.task.serv;


import by.academy.rms.dao.Dao;
import by.academy.rms.dao.exception.DaoException;
import by.academy.rms.pojo.LangCode;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LangCodeServiceImpl implements LangCodeService {

    @Autowired
    private Dao<LangCode, Integer> dao;

    @Override
    public LangCode getLangCode(String lang) throws DaoException {
        dao.setType(LangCode.class);
        Criteria cr = dao.getCriteria();
        cr.add(Restrictions.eq("lang", lang));
        LangCode lc = (LangCode) cr.uniqueResult();
        System.out.println(getClass().getName() + " -----> " + lc);
        return lc;
    }
}
