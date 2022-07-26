package dh.meli.spring_elastic.service;

import dh.meli.spring_elastic.model.Article;

import java.util.List;

public interface IArticleService {
    Article save(Article article);
    Article findById(int id);
    List<Article> findAll();
    String deleteById(int id);
    Article update(Article article);
}
