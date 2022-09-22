package com.stock.pStock.repository;

import com.stock.pStock.model.Article;
import com.stock.pStock.model.Scategorie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.Optional;

@RepositoryRestResource
public interface ArticleRepos extends CrudRepository<Article, Long> {

}
