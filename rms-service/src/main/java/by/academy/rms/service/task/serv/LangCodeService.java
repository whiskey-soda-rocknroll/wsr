package by.academy.rms.service.task.serv;


import by.academy.rms.dao.exception.DaoException;
import by.academy.rms.pojo.LangCode;

public interface LangCodeService {
    LangCode getLangCode(String lang) throws DaoException;
}
