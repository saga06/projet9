package com.oc.microservicecomment.dao;

import com.oc.microservicecomment.model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CommentDao extends JpaRepository<Comment, Integer> {

   List<Comment> findByIdAdventure(int adventure_id);
    List<Comment> findAll();

    /*// Example of how to create manualy query with JPQL => @Query
    @Query("SELECT c FROM Comment c WHERE c.idAdventure = :adventure_id")
    List <Comment> findByAdventureId(@Param("adventure_id") int adventure_id);*/

}
