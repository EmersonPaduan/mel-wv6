package dh.meli.spring_elastic.service;

import dh.meli.spring_elastic.model.Article;

public interface IArticleService {
    Article save(Article article);
    Article findById(int id);
}
