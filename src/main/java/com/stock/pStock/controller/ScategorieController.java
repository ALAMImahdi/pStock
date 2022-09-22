package com.stock.pStock.controller;

import com.stock.pStock.model.Scategorie;
import com.stock.pStock.service.ScategorieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class ScategorieController {
    @Autowired
    private ScategorieService scategorieService;

    @RequestMapping("/scategories")
    public List<Scategorie> getScategorie(){
        return scategorieService.getScategories();
    }
    @RequestMapping("/scategorie/{id}")
    public Scategorie getScategories(@PathVariable long id){
        return scategorieService.getScategorie(id);
    }
    @RequestMapping(method = RequestMethod.DELETE, value = "/scategorie/{id}")
    public void DeleteScategorie(@PathVariable long id){
        scategorieService.deleteScategorie(id);
    }
    @RequestMapping(method = RequestMethod.POST,value ="/scategories")
    public void AddScategorie(@RequestBody Scategorie scategorie){
        scategorieService.addScategorie(scategorie);
    }
    @RequestMapping(method = RequestMethod.PUT, value = "/scategorie/{id}")
    public void updateScategorie(@RequestBody Scategorie scategorie,@PathVariable long id){
        scategorieService.updateScategorie(scategorie,id);
    }
}
