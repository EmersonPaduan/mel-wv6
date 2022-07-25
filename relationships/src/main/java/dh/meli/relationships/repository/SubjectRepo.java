package dh.meli.relationships.repository;

import dh.meli.relationships.model.Subject;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubjectRepo extends CrudRepository<Subject, Long> {
}
