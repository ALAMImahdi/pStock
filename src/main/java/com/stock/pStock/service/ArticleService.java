package com.stock.pStock.service;

import com.stock.pStock.exception.UserNotFoundException;
import com.stock.pStock.model.Article;
import com.stock.pStock.repository.ArticleRepos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class ArticleService {
    @Autowired
    private ArticleRepos articleRepos;
    public List<Article> getArticles(){
        List<Article> articles = new ArrayList<>();
        articleRepos.findAll().forEach(article -> {
            articles.add(article);
        });
        return articles;
    }

    public Article getArticle(long id) {
        return articleRepos.findById(id).orElse(null);
    }

    public void deleteArticle(long id) {
        articleRepos.deleteById(id);
    }

    public void addArticle(Article article) {
        articleRepos.save(article);
    }

    public void updateArticle(Article article, long id) {
        articleRepos.save(article);
    }
}
