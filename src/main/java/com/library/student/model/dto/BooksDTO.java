package com.library.student.model.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BooksDTO {
    private Long id;
    private String nameBook;
    private String author;
    private LocalDate dateOfIssue;
    private Long studentId;
}
