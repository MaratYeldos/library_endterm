package com.example.final_java_yeldos.controller;

import com.example.final_java_yeldos.model.Author;
import com.example.final_java_yeldos.service.AuthorService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(value = "author")
@Tag(name = "Authorcontroller", description = "This is The Hello Swagger API Documentation")
public class Authorcontroller {
    @Autowired
    private AuthorService authorService;


    @GetMapping(value = "all")
    @ResponseBody
    @PreAuthorize("hasRole('ROLE_CLIENT')")
    @Operation(description = "getAllAuthor")
    public ResponseEntity<?> getAllAuthor(){
        return ResponseEntity.status(HttpStatus.OK).body(authorService.findAllAuthor());
    }

    @GetMapping(value = "{id}")
    @ResponseBody
    @PreAuthorize("hasRole('ROLE_ADMIN')")
    @Operation(description = "getAuthorById")
    public ResponseEntity<?> getAuthorById(@PathVariable Long id){

        Optional<Author> author = authorService.findAuthorById(id);

        if (author.isPresent()){
            return ResponseEntity.status(HttpStatus.OK).body(author.get());
        }
        else {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Author does not exist for this id!");
        }

    }
    @PostMapping(value = "save")
    @ResponseBody
    @Operation(description = "saveAuthor")
    public ResponseEntity<?> saveAuthor(@RequestBody Author author){
        Optional<Author> OptionalAuthor= authorService.findAuthorById(author.getAuthorId());

        if (OptionalAuthor.isPresent()){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Author already exist");
        }
        try {
            return ResponseEntity.status(HttpStatus.OK).body(authorService.saveAuthor(author));
        }
        catch (Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Nothing Saved");
        }

    }
    @PutMapping(value = "update/{id}")
    @ResponseBody
    @Operation(description = "updateAuthor")
    public ResponseEntity<?> updateAuthor(@PathVariable Long id,@RequestBody Author author){
        Optional<Author> optional = authorService.findAuthorById(id);

        if (!optional.isPresent()){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Does not Exist");
        }

        optional.get().setName(author.getName());

        try {
            Author authorById = authorService.updateById(optional.get());
            return ResponseEntity.status(HttpStatus.OK).body(authorById);
        }
        catch (Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Nothing Updated");
        }
    }
    @DeleteMapping(value = "delete/{id}")
    @ResponseBody
    @Operation(description = "deleteAuthor")
    public ResponseEntity<?> deleteAuthor(@PathVariable Long id) {

        Optional<Author> optionalAuthor= authorService.findAuthorById(id);

        if (!optionalAuthor.isPresent()) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Invalid Author Id!");
        }

        try {
            authorService.deleteById(id);
            return ResponseEntity.status(HttpStatus.OK).body("Deleted!");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Nothing Deleted!");
        }

    }
}
