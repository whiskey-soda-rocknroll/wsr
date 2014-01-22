package by.academy.rms.service.task.serv;

import by.academy.rms.dao.Dao;
import by.academy.rms.dao.exception.DaoException;
import by.academy.rms.pojo.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PageServiceImpl implements PageService {

    @Autowired
    private Dao<Page, Integer> dao;

    @Override
    public List<Page> getPages() throws DaoException {
        dao.setType(Page.class);
        List<Page> pages = dao.getAll();
        return pages;
    }
}
