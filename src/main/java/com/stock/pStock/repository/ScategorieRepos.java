package com.stock.pStock.repository;

import com.stock.pStock.model.Scategorie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface ScategorieRepos extends JpaRepository<Scategorie, Long> {
}
