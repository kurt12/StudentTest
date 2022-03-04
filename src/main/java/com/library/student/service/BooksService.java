package com.library.student.service;

import com.library.student.model.dto.BooksDTO;
import com.library.student.model.entity.Books;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public interface BooksService extends LibraryCrud<BooksDTO,Long>{
    List<BooksDTO> findAllByNameBookAndAuthor(String nameBook, String author);

    List<BooksDTO> findAllByNameBook(String nameBook);

    List<BooksDTO> findAllByDateOfIssue(LocalDate date);

    Optional<BooksDTO> findById(Long id);

}
