package com.stock.pStock.controller;

import com.stock.pStock.model.Categorie;
import com.stock.pStock.service.CategorieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class CategorieController {
    @Autowired
    private CategorieService categorieService;

    @RequestMapping("/categories")
    public List<Categorie> getCategorie(){
        return categorieService.getCategories();
    }
    @RequestMapping("/categorie/{id}")
    public Categorie getCategories(@PathVariable long id){
        return categorieService.getCategorie(id);
    }
    @RequestMapping(method = RequestMethod.DELETE, value = "/categorie/{id}")
    public void DeleteCategorie(@PathVariable long id){
        categorieService.deleteCategorie(id);
    }
    @RequestMapping(method = RequestMethod.POST,value ="/categories")
    public void AddCategorie(@RequestBody Categorie categorie){
        categorieService.addCategorie(categorie);
    }
    @RequestMapping(method = RequestMethod.PUT, value = "/categorie/{id}")
    public void updateCategorie(@RequestBody Categorie categorie,@PathVariable long id){
        categorieService.updateCategorie(categorie,id);
    }
}
