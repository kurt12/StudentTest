package com.library.student.controller;

import com.library.student.model.dto.BooksDTO;
import com.library.student.service.BooksService;
import lombok.RequiredArgsConstructor;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/books")
@RequiredArgsConstructor
public class BooksController {
    private final BooksService booksService;

    @GetMapping("/")
    public ResponseEntity <List<BooksDTO>> findAll() {
       return ResponseEntity.ok(booksService.findAll());
    }

    @PostMapping("/save")
    public  ResponseEntity <BooksDTO> save(@RequestBody BooksDTO bookDTO) {
        return ResponseEntity.ok(booksService.saveOrUpdate(bookDTO));
    }

    @PutMapping("/update")
    public  ResponseEntity <BooksDTO> update(@RequestBody BooksDTO bookDTO){
        return ResponseEntity.ok(booksService.saveOrUpdate(bookDTO));
    }

    @DeleteMapping("/delete{id}")
    public void deleteById(@PathVariable("id") Long id){
        booksService.deleteById(id);


    }

    @GetMapping("find-all-by-nameBook-and-author/{nameBook}{author}")
    public ResponseEntity <List<BooksDTO>> findAllByNameBookAndAuthor(@PathVariable("nameBook") String nameBook, @PathVariable("author") String author){
        return ResponseEntity.ok(booksService.findAllByNameBookAndAuthor(nameBook, author));
    }

    @GetMapping("find-all-by-name/{name}")
    public ResponseEntity <List<BooksDTO>> findAllByNameBook(@PathVariable("name") String name){
        return ResponseEntity.ok(booksService.findAllByNameBook(name));
    }


    @GetMapping("find-all-by-date")
    public ResponseEntity <List<BooksDTO>> findAllByDateOfIssue(@RequestParam("date") @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate date){
        return ResponseEntity.ok(booksService.findAllByDateOfIssue(date));
    }

    @GetMapping("find-all-by-id")
    public  Optional <BooksDTO> findById(@RequestParam("id") Long id){
        return booksService.findById(id);

    }
}
