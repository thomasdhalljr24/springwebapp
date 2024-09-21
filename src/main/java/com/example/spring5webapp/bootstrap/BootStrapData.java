package com.example.spring5webapp.bootstrap;

import com.example.spring5webapp.dom.Author;
import com.example.spring5webapp.dom.Book;
import com.example.spring5webapp.dom.Publisher;
import com.example.spring5webapp.repositories.AuthorRepository;
import com.example.spring5webapp.repositories.BookRepository;
import com.example.spring5webapp.repositories.PublisherRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData implements CommandLineRunner {
    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;
    private final PublisherRepository publisherRepository;

    public BootStrapData(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        Author eric = new Author("Eric","Evans");
        Book ddd = new Book("Domain Driven Design","123123");
        Publisher publisher = new Publisher("McGraw Hill","123 Fake St");
        
        eric.getBooks().add(ddd);
        ddd.getAuthors().add(eric);
        ddd.setPublisher(publisher);
        publisher.getBooks().add(ddd);
        publisherRepository.save(publisher);

        authorRepository.save(eric);
        bookRepository.save(ddd);

        Author rod = new Author("Rod","Johnson");
        Book noEJB = new Book("J2EE Development without EJB","3838459459");
        rod.getBooks().add(noEJB);
        noEJB.setPublisher(publisher);
        noEJB.getAuthors().add(rod);
        publisher.getBooks().add(noEJB);
        publisherRepository.save(publisher);
        
        authorRepository.save(rod);
        bookRepository.save(noEJB);
        System.out.println("Started in Bootstrap");
        System.out.println("Number of Books: " +bookRepository.count());
        System.out.println("Publisher Number of Books: " +publisher.getBooks().size());
        

    }
}
