package com.oc.wildadventures.controller;

import com.oc.wildadventures.dao.AdventureDao;
import com.oc.wildadventures.exceptions.AdventureNotFoundException;
import com.oc.wildadventures.exceptions.CategoryNotFoundException;
import com.oc.wildadventures.model.Adventure;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;
import java.util.List;

/*Describe the api in the swagger documentation => @Api*/
@Api(description = "Adventure's management")
@RestController
@CrossOrigin
public class AdventureController {

    @Autowired
    private AdventureDao adventureDao;

    Logger log = LoggerFactory.getLogger(this.getClass());

    //Adventures
    @GetMapping(value = "adventures")
    public List<Adventure> listAdventures(){

        List<Adventure> adventures = adventureDao.findAll();
        if(adventures.isEmpty()) throw new AdventureNotFoundException("Aucune aventure n'est présente actuellement");

        log.info("get all the adventures");

        return adventures;
    }

    /* Describe a method in swagger documentation => @ApiOperation*/
    @ApiOperation(value = "Get an adventure depending on its id")
    //Adventure/{adventure_id}
    @GetMapping(value = "adventures/{adventure_id}")
    public Adventure displayAnAdventure(@PathVariable int adventure_id) throws AdventureNotFoundException {

        Adventure adventure = adventureDao.findById(adventure_id);
        if(adventure ==  null) throw new AdventureNotFoundException("L'aventure avec l'id "+ adventure_id +" n'existe pas");
        return adventure;
    }

    @GetMapping(value = "adventure_name/")
    public List<Adventure> displayAdventuresById(@RequestParam("adventure_ids") List<Integer> adventure_ids) throws AdventureNotFoundException {
        return adventureDao.findListofAdventuresByIds(adventure_ids);
    }

    @GetMapping(value = "categories/{category_id}/adventures")
    public List<Adventure> displayAdventuresOfACategory(@PathVariable int category_id) throws CategoryNotFoundException {

       List <Adventure> adventures = adventureDao.findByCategoryId(category_id);
        if(adventures ==  null) throw new AdventureNotFoundException("Il n'y a aucune aventure pour la catégorie "+ category_id +"");
        return adventures;
    }

    @PostMapping(value = "/adventures")
    /*test that the parameter respects the pattern declared in the bean (lenght, regex etc...) => @Valid*/
    public ResponseEntity<Void> addAdventure(@Valid @RequestBody Adventure adventure){

        Adventure adventure1 = adventureDao.save(adventure);
        if (adventure == null) {
            return ResponseEntity.noContent().build();
        }
        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{adventure_id}").buildAndExpand(adventure1.getAdventure_id()).toUri();
        return ResponseEntity.created(location).build();
    }

    /*First possibility : use jpa*/
    @GetMapping(value = "ranking/adventures/{priceLimit}")
    public List<Adventure> request(@PathVariable float priceLimit) {
        return adventureDao.findByPriceGreaterThan(priceLimit);
    }

    /*Second possibility : use JPQL*/
    /*@GetMapping(value = "ranking/adventures/{priceLimit}")
    public List<Adventure> request(@PathVariable float priceLimit) {
        return adventureDao.lookForACheapAdventure(priceLimit);
    }*/

}
