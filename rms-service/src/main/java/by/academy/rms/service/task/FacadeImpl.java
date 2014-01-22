package by.academy.rms.service.task;

import by.academy.rms.dao.exception.DaoException;
import by.academy.rms.pojo.LangCode;
import by.academy.rms.pojo.Page;
import by.academy.rms.service.task.serv.LangCodeService;
import by.academy.rms.service.task.serv.PageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;


@Service
public class FacadeImpl implements Facade {

    @Autowired
    private LangCodeService lcService;
    @Autowired
    private PageService pageService;

    @Override
    public Map<Page, Properties> showPagesProperties(String lang) throws DaoException {
        LangCode lc = lcService.getLangCode(lang);
        List<Page> pages = pageService.getPages();
        Map<Page, Properties> props = new HashMap<Page, Properties>();

        if(pages == null){
            //set error message
            return null;
        }

        for(Page page : pages){
            props.put(page, page.getValuesByLangCode(lc));
        }
        return props;
    }
}
