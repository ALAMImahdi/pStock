package com.stock.pStock.service;

import com.stock.pStock.model.Categorie;
import com.stock.pStock.repository.CategorieRepos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CategorieService {
    @Autowired
    private CategorieRepos categorieRepos;
    public List<Categorie> getCategories(){
        List<Categorie> categories = new ArrayList<>();
        categorieRepos.findAll().forEach(categorie -> {
            categories.add(categorie);
        });
        return categories;
    }

    public Categorie getCategorie(long id) {
        return categorieRepos.findById(id).orElse(null);
    }

    public void deleteCategorie(long id) {
        categorieRepos.deleteById(id);
    }

    public void addCategorie(Categorie categorie) {
        categorieRepos.save(categorie);
    }

    public void updateCategorie(Categorie categorie, long id) {
        categorieRepos.save(categorie);
    }
}
