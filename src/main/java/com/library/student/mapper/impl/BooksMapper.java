package com.library.student.mapper.impl;

import com.library.student.mapper.Mapper;
import com.library.student.model.dto.BooksDTO;
import com.library.student.model.entity.Books;
import com.library.student.model.entity.Student;
import org.springframework.stereotype.Component;

@Component
public class BooksMapper implements Mapper<Books, BooksDTO> {
    @Override
    public Books toModel(BooksDTO booksDTO) {
        Books books = new Books();
        Student student = new Student();
        student.setId(booksDTO.getStudentId());

        books.setId(booksDTO.getId());
        books.setNameBook(booksDTO.getNameBook());
        books.setAuthor(booksDTO.getAuthor());
        books.setDateOfIssue(booksDTO.getDateOfIssue());
        books.setStudentId(student);

        return books;
    }

    @Override
    public BooksDTO toDTO(Books books) {
        BooksDTO booksDTO = new BooksDTO();


        booksDTO.setId(books.getId());
        booksDTO.setNameBook(books.getNameBook());
        booksDTO.setAuthor(books.getAuthor());
        booksDTO.setDateOfIssue(books.getDateOfIssue());
        booksDTO.setStudentId(books.getStudentId().getId());

        return booksDTO;
    }
}
