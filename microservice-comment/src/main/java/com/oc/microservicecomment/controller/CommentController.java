package com.oc.microservicecomment.controller;

import com.oc.microservicecomment.dao.CommentDao;
import com.oc.microservicecomment.exceptions.CommentNotFoundException;
import com.oc.microservicecomment.model.Comment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.Date;
import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class CommentController {

   /* @RequestMapping(value = "commentaires", method = RequestMethod.GET)
    public String listeCommentaires() {
        return "Un exemple de commentaire";
    }*/

    @Autowired
    private CommentDao commentDao;

    //Adventures
    @GetMapping(value = "comments")
    public List<Comment> listComments() {
        List<Comment> comments = commentDao.findAll();
        if (comments.isEmpty()) throw new CommentNotFoundException("Aucun commentaire n'est présent actuellement");
        return comments;
    }

    @GetMapping(value = "comments/adventure/{adventure_id}")
    public List<Comment> listCommentsByAdventureId(@PathVariable int adventure_id) throws CommentNotFoundException{

        List<Comment> comments = commentDao.findByIdAdventure(adventure_id);
        if (comments.isEmpty()) throw new CommentNotFoundException("Aucun commentaire n'est présent actuellement pour cette aventure");
        return comments;
    }

    //ajouter un produit
    @PostMapping(value = "create_comment")
    public ResponseEntity<Void> addComment(@RequestBody Comment comment) {
        comment.setDateComment(new Date());
        Comment commentAdded =  commentDao.save(comment);
        if (commentAdded == null)
            return ResponseEntity.noContent().build();

        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(commentAdded.getId())
                .toUri();
        return ResponseEntity.created(location).build();
    }



}
