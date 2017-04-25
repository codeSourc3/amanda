package com.timeyang.api;

import com.timeyang.amanda.blog.domain.Category;
import com.timeyang.amanda.blog.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Category rest端点，定制化一些Spring Data Rest不能良好暴露的资源
 * @author chaokunyang
 * @create 2017-04-25
 */
@RestController(value = "/api/categories")
public class CategoryEndpoint {

    @Autowired
    private CategoryService categoryService;

    @RequestMapping(method = RequestMethod.GET)
    public List<Category> allCategories() {
        return categoryService.getAllCategory();
    }

}
