package com.library.student.service.impl;

import com.library.student.mapper.Mapper;
import com.library.student.model.dto.BooksDTO;
import com.library.student.model.entity.Books;
import com.library.student.repository.BooksRepository;
import com.library.student.service.BooksService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.beans.Transient;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class BooksServiceImpl implements BooksService {

    private final BooksRepository booksRepository;
    private final Mapper<Books, BooksDTO> mapper;


    @Transactional(readOnly = true)
    @Override
    public List<BooksDTO> findAll() {
        return booksRepository.findAll().stream().map(mapper::toDTO).collect(Collectors.toList());
    }

    @Transactional
    @Override
    public BooksDTO saveOrUpdate(BooksDTO booksDTO) {

        return mapper.toDTO(booksRepository.save(mapper.toModel(booksDTO)));
    }

    @Transactional
    @Override
    public void deleteById(Long id) {
        booksRepository.deleteById(id);

    }

    @Transactional
    @Override
    public List<BooksDTO> findAllByNameBookAndAuthor(String nameBook, String author) {
        return booksRepository.findAllByNameBookAndAuthor(nameBook, author).stream()
                .map(mapper::toDTO)
                .collect(Collectors.toList());
    }

    @Transactional
    @Override
    public List<BooksDTO> findAllByNameBook(String nameBook) {
        return booksRepository.findAllByNameBook(nameBook).stream()
                .map(mapper::toDTO).collect(Collectors.toList());
    }

    @Transactional
    @Override
    public List<BooksDTO> findAllByDateOfIssue(LocalDate date) {
        return booksRepository.findAllByDateOfIssue(date).stream()
                .map(mapper::toDTO).collect(Collectors.toList());
    }

    @Transactional(readOnly = true)
    @Override
    public Optional<BooksDTO> findById(Long id) {
        return booksRepository.findById(id).stream()
                .map(mapper::toDTO).findAny();
    }
}
