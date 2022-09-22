package com.stock.pStock.service;

import com.stock.pStock.model.Scategorie;
import com.stock.pStock.repository.ScategorieRepos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ScategorieService {
    @Autowired
    private ScategorieRepos scategorieRepos;
    public List<Scategorie> getScategories(){
        List<Scategorie> scategories = new ArrayList<>();
        scategorieRepos.findAll().forEach(scategorie -> {
            scategories.add(scategorie);
        });
        return scategories;
    }

    public Scategorie getScategorie(long id) {
        return scategorieRepos.findById(id).orElse(null);
    }

    public void deleteScategorie(long id) {
        scategorieRepos.deleteById(id);
    }

    public void addScategorie(Scategorie scategorie) {
        scategorieRepos.save(scategorie);
    }

    public void updateScategorie(Scategorie scategorie, long id) {
        scategorieRepos.save(scategorie);
    }
}
