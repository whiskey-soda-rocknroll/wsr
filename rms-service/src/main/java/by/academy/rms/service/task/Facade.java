package by.academy.rms.service.task;

import by.academy.rms.dao.exception.DaoException;
import by.academy.rms.pojo.Page;
import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.Properties;

@Service
public interface Facade {
    Map<Page, Properties> showPagesProperties(String lang) throws DaoException;
}

