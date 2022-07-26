package dh.meli.spring_elastic.service;

import dh.meli.spring_elastic.model.Article;
import dh.meli.spring_elastic.repository.ArticleRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ArticleService implements IArticleService {

    @Autowired
    private ArticleRepo repo;

    @Override
    public Article save(Article article) {
        return repo.save(article);
    }

    @Override
    public Article findById(int id) {
        return repo.findById(id).get();
    }

    @Override
    public List<Article> findAll() {
        List<Article> list = new ArrayList<>();

        Iterable<Article> resp = repo.findAll();

        resp.forEach(list::add);
        return list ;
    }

    @Override
    public String deleteById(int id) {
        repo.deleteById(id);
        return "Artigo removido com sucesso!";
    }

    @Override
    public Article update(Article article) {
        return repo.save(article);
    }

}
