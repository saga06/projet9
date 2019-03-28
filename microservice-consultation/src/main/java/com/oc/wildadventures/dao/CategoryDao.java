package com.oc.wildadventures.dao;

import com.oc.wildadventures.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/*@Repo => this interface gives us the possibility to manipulate the data in the DB*/
/* It extends from JPA repo which give us some preset methods*/
@Repository
public interface CategoryDao  extends JpaRepository<Category, Integer> {

    Category findById(int category_id);
    List<Category> findAll();

}