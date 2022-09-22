package com.stock.pStock.controller;

import com.stock.pStock.model.Fournisseur;
import com.stock.pStock.service.FournisseurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class FournisseurController {
    @Autowired
    private FournisseurService fournisseurService;

    @RequestMapping("/fournisseurs")
    public List<Fournisseur> getFournisseur(){
        return fournisseurService.getFournisseurs();
    }
    @RequestMapping("/fournisseur/{id}")
    public Fournisseur getFournisseurs(@PathVariable long id){
        return fournisseurService.getFournisseur(id);
    }
    @RequestMapping(method = RequestMethod.DELETE, value = "/fournisseur/{id}")
    public void DeleteFournisseur(@PathVariable long id){
        fournisseurService.deleteFournisseur(id);
    }
    @RequestMapping(method = RequestMethod.POST,value ="/fournisseurs")
    public void AddFournisseur(@RequestBody Fournisseur fournisseur){
        fournisseurService.addFournisseur(fournisseur);
    }
    @RequestMapping(method = RequestMethod.PUT, value = "/fournisseur/{id}")
    public void updateFournisseur(@RequestBody Fournisseur fournisseur,@PathVariable long id){
        fournisseurService.updateFournisseur(fournisseur,id);
    }
}
