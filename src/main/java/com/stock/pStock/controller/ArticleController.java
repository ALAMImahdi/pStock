package com.stock.pStock.controller;

import com.stock.pStock.model.Article;

import com.stock.pStock.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
//@RequestMapping("/api")
public class ArticleController {
    @Autowired
    private ArticleService articleService;

    @RequestMapping("/articles")
    public List<Article> getArticle(){
        return articleService.getArticles();
    }
    @RequestMapping("/article/{id}")
    public Article getArticles(@PathVariable long id){
        return articleService.getArticle(id);
    }
    @RequestMapping(method = RequestMethod.DELETE, value = "/article/{id}")
    public void DeleteArticle(@PathVariable long id){
        articleService.deleteArticle(id);
    }
    @RequestMapping(method = RequestMethod.POST,value ="/articles")
    public void AddArticle(@RequestBody Article article){
        articleService.addArticle(article);
    }
    @RequestMapping(method = RequestMethod.PUT, value = "/article/{id}")
    public void updateArticle(@RequestBody Article article,@PathVariable long id){
        articleService.updateArticle(article,id);
    }

}
