package com.example.final_java_yeldos.service;

import com.example.final_java_yeldos.model.Author;
import com.example.final_java_yeldos.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AuthorService {

    private AuthorRepository authorRepository;

    @Autowired
    public void setAuthorRepository(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @Value("#{2 > 1 ? 'right' : 'wrong'}") // "right"
    private String ternary;

    public Author saveAuthor(Author author){
        return authorRepository.save(author);
    }

//    @Scheduled(cron = "${name-of-the-cron:0 0/1 * * * ?}")
//    @Scheduled(fixedDelay = 1000, initialDelay = 2000)
    @org.springframework.transaction.annotation.Transactional(readOnly = true)
    @Cacheable("author")
    public Iterable<Author> findAllAuthor()
    {
        return authorRepository.findAll();
    }

    public Optional<Author> findAuthorById(Long id) {
        return authorRepository.findById(id);
    }

    public Author updateById(Author author){
        return authorRepository.save(author);
    }

    public void deleteById(Long id){
        authorRepository.deleteById(id);
    }
}
