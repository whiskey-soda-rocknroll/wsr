package by.academy.rms.web.controller;


import by.academy.rms.dao.exception.DaoException;
import by.academy.rms.service.task.Facade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Locale;


@Controller
public class PageController {
    static{
        Locale.setDefault(Locale.US);
    }

    @Autowired
    private Facade facade;

    public PageController(){}

    @RequestMapping(value = "/list/{lang}", method = RequestMethod.GET)
    public String listPages(@PathVariable String lang, Model model){
        try {
            model.addAttribute("pages", facade.showPagesProperties(lang));
        } catch (DaoException e) {
            e.printStackTrace();
        }
        return "list";

    }
}
