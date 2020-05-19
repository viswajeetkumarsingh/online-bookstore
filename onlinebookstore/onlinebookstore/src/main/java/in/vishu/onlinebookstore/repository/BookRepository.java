package in.vishu.onlinebookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.vishu.onlinebookstore.entity.Book;

public interface BookRepository extends JpaRepository<Book, Long>{

}
