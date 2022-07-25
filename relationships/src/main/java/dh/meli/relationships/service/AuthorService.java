package dh.meli.relationships.service;

import dh.meli.relationships.model.Author;
import dh.meli.relationships.repository.AuthorRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class AuthorService {

    @Autowired
    private AuthorRepo repo;

    @Transactional
    public Author save(Author author){
        author.getAddress().setAuthor(author);
        return repo.save(author);
    }

}
