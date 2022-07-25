package dh.meli.relationships.controller;

import dh.meli.relationships.dto.AuthorDTO;
import dh.meli.relationships.model.Author;
import dh.meli.relationships.repository.AuthorRepo;
import dh.meli.relationships.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/author")
public class AuthorController {

    @Autowired
    private AuthorRepo repo;

    @Autowired
    private AuthorService service;

    @GetMapping("/{id}")
    public ResponseEntity<Author> getById(@PathVariable long id) {
        return ResponseEntity.ok(repo.findById(id).get());
    }
    @GetMapping("/dto/{id}")
    public ResponseEntity<AuthorDTO> getDtoById(@PathVariable long id) {
        return ResponseEntity.ok(repo.getById(id));
    }

    @GetMapping("/native/{id}")
    public ResponseEntity<Author> getNativeDtoById(@PathVariable long id) {
        return ResponseEntity.ok(repo.getNativeById(id));
    }

    @GetMapping("/eag/{id}")
    public ResponseEntity<AuthorDTO> getEagDtoById(@PathVariable long id) {
        return ResponseEntity.ok(repo.getDtoEagle(id));
    }

    @PostMapping
    public ResponseEntity<Author> novoAuthor(@RequestBody Author author) {
        return ResponseEntity.ok(service.save(author));
    }

    @DeleteMapping ("/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable long id) {
        repo.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
