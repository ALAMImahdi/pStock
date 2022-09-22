package com.stock.pStock.service;

import com.stock.pStock.model.Fournisseur;
import com.stock.pStock.repository.FournisseurRepos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FournisseurService {
    @Autowired
    private FournisseurRepos fournisseurRepos;
    public List<Fournisseur> getFournisseurs(){
        List<Fournisseur> fournisseurs = new ArrayList<>();
        fournisseurRepos.findAll().forEach(fournisseur -> {
            fournisseurs.add(fournisseur);
        });
        return fournisseurs;
    }

    public Fournisseur getFournisseur(long id) {
        return fournisseurRepos.findById(id).orElse(null);
    }

    public void deleteFournisseur(long id) {
        fournisseurRepos.deleteById(id);
    }

    public void addFournisseur(Fournisseur fournisseur) {
        fournisseurRepos.save(fournisseur);
    }

    public void updateFournisseur(Fournisseur fournisseur, long id) {
        fournisseurRepos.save(fournisseur);
    }
}
