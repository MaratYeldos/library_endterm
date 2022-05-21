package com.example.final_java_yeldos.controller;

import com.example.final_java_yeldos.model.Librarian;
import com.example.final_java_yeldos.service.LibrarianService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(value = "librarian")
public class LibrarianController {
    @Autowired
    private LibrarianService librarianService;

    @GetMapping(value = "all")
    @ResponseBody
    public ResponseEntity<?> getAllLibrarian() {
        return ResponseEntity.status(HttpStatus.OK).body(librarianService.findAllLibrarian());
    }

    @GetMapping(value = "{id}")
    @ResponseBody
    public ResponseEntity<?> getLibrarianById(@PathVariable Long id) {

        Optional<Librarian> librarian = librarianService.findLibrarianById(id);

        if (librarian.isPresent()) {
            return ResponseEntity.status(HttpStatus.OK).body(librarian.get());
        } else {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Librarian does not exist for this id!");
        }

    }

    @PostMapping(value = "save")
    @ResponseBody
    public ResponseEntity<?> saveLibrarian(@RequestBody Librarian librarian) {
        Optional<Librarian> OptionalLibrarian = librarianService.findLibrarianById(librarian.getLibrarianId());

        if (OptionalLibrarian.isPresent()) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Librarian already exist");
        }
        try {
            return ResponseEntity.status(HttpStatus.OK).body(librarianService.saveLibrarian(librarian));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Nothing Saved");
        }

    }

    @PutMapping(value = "update/{id}")
    @ResponseBody
    public ResponseEntity<?> updateLibrarian(@PathVariable Long id, @RequestBody Librarian librarian) {
        Optional<Librarian> optionalLibrarian = librarianService.findLibrarianById(id);

        if (!optionalLibrarian.isPresent()) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Does not Exist");
        }

        optionalLibrarian.get().setName(librarian.getName());
        optionalLibrarian.get().setEmail(librarian.getEmail());

        try {
            Librarian librarianById = librarianService.updateById(optionalLibrarian.get());
            return ResponseEntity.status(HttpStatus.OK).body(librarianById);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Nothing Updated");
        }
    }

    @DeleteMapping(value = "delete/{id}")
    @ResponseBody
    public ResponseEntity<?> deleteLibrarian(@PathVariable Long id) {

        Optional<Librarian> optionalLibrarian = librarianService.findLibrarianById(id);

        if (!optionalLibrarian.isPresent()) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Invalid Librarian Id!");
        }

        try {
            librarianService.deleteById(id);
            return ResponseEntity.status(HttpStatus.OK).body("Deleted!");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Nothing Deleted!");
        }

    }
}
