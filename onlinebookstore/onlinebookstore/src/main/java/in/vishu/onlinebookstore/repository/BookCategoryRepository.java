package in.vishu.onlinebookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.vishu.onlinebookstore.entity.BookCategory;

public interface BookCategoryRepository extends JpaRepository<BookCategory, Long>{

}
