package com.library.student.repository;

import com.library.student.model.entity.Books;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Repository
public interface BooksRepository extends JpaRepository<Books,Long> {

    @Query(nativeQuery = true, value = "select * from books where name_book=:nameBook and author=:author")
    List<Books> findAllByNameBookAndAuthor(@Param( "nameBook") String nameBook, @Param("author") String author);

    List<Books> findAllByNameBook(String nameBook);

    List<Books> findAllByDateOfIssue(LocalDate date);

    Optional<Books> findById(Long id);

}
