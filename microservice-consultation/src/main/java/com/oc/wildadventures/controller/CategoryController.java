package com.oc.wildadventures.controller;

import com.oc.wildadventures.dao.CategoryDao;
import com.oc.wildadventures.exceptions.CategoryNotFoundException;
import com.oc.wildadventures.model.Category;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;
import java.util.List;

/*Describe the api in the swagger documentation => @Api*/
@Api(description = "Category's management")
@RestController
@CrossOrigin
public class CategoryController {

    @Autowired
    private CategoryDao categoryDao;

    //Category
    @GetMapping(value = "categories")
    public List<Category> listCategories() {
        return categoryDao.findAll();
    }

    /* Describe a method in swagger documentation => @ApiOperation*/
    @ApiOperation(value = "Get a category depending on its id")
    //Category/{category_id}
    @GetMapping(value = "categories/{category_id}")
    public Category displayACategory(@PathVariable int category_id) throws CategoryNotFoundException {

        Category category = categoryDao.findById(category_id);
        if (category == null)
            throw new CategoryNotFoundException("La catégorie avec l'id " + category_id + " n'existe pas");
        return category;
    }

    @PostMapping(value = "/categories")
    /*test that the parameter respects the pattern declared in the bean (lenght, regex etc...) => @Valid*/
    public ResponseEntity<Void> addCategory(@Valid @RequestBody Category category) {

        Category category1 = categoryDao.save(category);
        if (category == null) {
            return ResponseEntity.noContent().build();
        }
        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{category_id}").buildAndExpand(category1.getCategory_id()).toUri();
        return ResponseEntity.created(location).build();
    }
}
