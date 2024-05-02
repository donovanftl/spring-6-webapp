package guru.springframework.spring6webapp.repositories;

import guru.springframework.spring6webapp.domain.Author;
import guru.springframework.spring6webapp.domain.Book;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
