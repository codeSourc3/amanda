package com.timeyang.amanda.web;

import com.timeyang.amanda.blog.service.ArticleService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author chaokunyang
 * @create 2017-04-25
 */
@Controller
public class HomeController {
    private static final Logger LOGGER = LogManager.getLogger();

    @Autowired
    private ArticleService articleService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index() {

        return "index";
    }

}