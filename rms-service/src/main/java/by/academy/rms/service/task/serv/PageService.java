package by.academy.rms.service.task.serv;

import by.academy.rms.dao.exception.DaoException;
import by.academy.rms.pojo.Page;

import java.util.List;

public interface PageService {
    List<Page> getPages() throws DaoException;
}
