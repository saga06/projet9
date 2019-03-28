package com.oc.wildadventures.dao;

import com.oc.wildadventures.model.Adventure;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/*@Repo => this interface gives us the possibility to manipulate the data in the DB*/
/* It extends from JPA repo which give us some preset methods*/
@Repository
public interface AdventureDao extends JpaRepository<Adventure, Integer> {

    Adventure findById(int adventure_id);
    List <Adventure> findByPriceGreaterThan(float priceLimit);

    /*Example of how to create manualy query with JPQL => @Query*/
    @Query("SELECT a FROM Adventure a  WHERE a.category.id = :category_id")
    List <Adventure> findByCategoryId(@Param("category_id") int category_id);

    @Query("SELECT a FROM Adventure a  WHERE a.adventure_id IN :ids")
    List <Adventure> findListofAdventuresByIds(@Param("ids") List<Integer> ids);

    /*Example of how to create manualy query with JPQL => @Query*/
    /*@Query("SELECT name FROM Adventure WHERE price > :priceLimit")
    List <Adventure> lookForACheapAdventure(@Param("priceLimit") float priceLimit);*/
}
