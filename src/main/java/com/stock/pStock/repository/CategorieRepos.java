package com.stock.pStock.repository;

import com.stock.pStock.model.Categorie;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface CategorieRepos extends JpaRepository<Categorie, Long> {
}
