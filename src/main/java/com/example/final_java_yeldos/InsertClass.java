//package com.example.final_java_yeldos;//package demo.demo;
//
//import demo.demo.model.*;
//import demo.demo.repository.AuthorRepository;
//import demo.demo.service.*;
//
//import java.util.ArrayList;
//import java.util.HashSet;
//import java.util.List;
//import java.util.Set;
//
//public class InsertClass {
//    private BookService bookService;
//    private DepartmentService departmentService;
//    private LibrarianService librarianService;
//    private StudentService studentService;
//    private AuthorService authorService;
//
//    public InsertClass(BookService bookService, DepartmentService departmentService, LibrarianService librarianService, StudentService studentService, AuthorService authorService) {
//        this.bookService = bookService;
//        this.departmentService = departmentService;
//        this.librarianService = librarianService;
//        this.studentService = studentService;
//        this.authorService = authorService;
//
//        Set<Book> bookSet = new HashSet<>();
//        Set<Author> authorList = new HashSet<>();
//
////        Department department = new Department(1L, "Computer Science and Engineering"/*, 39*/);
////        Department department2 = new Department(2L, "Information Systems"/*, 39*/);
////        Department department3 = new Department(3L, "Mathematical Computer Modeling"/*, 39*/);
////        Department department4 = new Department(4L, "Media communications and history of Kazakhstan"/*, 39*/);
////        Department department5 = new Department(5L, "Economics and business"/*, 39*/);
//////        Category category = new Category("Programming","Programming");
////        Student student = new Student("Winston Milne","llts",
////                "winston@gmail.com",1L,department2,RoleType.STUDENT,"winston123",
////                bookSet);
////        Student student5 = new Student("Kyron Boyd","llts",
////                "kyron@gmail.com",2L,department2,RoleType.STUDENT,"Kyron123",
////                bookSet);
////        Student student2 = new Student("Kofi Huff","llts",
////                "kofi@gmail.com",1L,department3,RoleType.STUDENT,"Kofi123",
////                bookSet);
////        Student student3 = new Student("Ameen Perkins","llts",
////                "ameen@gmail.com",1L,department4,RoleType.STUDENT,"Ameen123",
////                bookSet);
////        Student student4 = new Student("Cherie Plant","llts",
////                "cherie@gmail.com",1L,department5,RoleType.STUDENT,"Cherie123",
////                bookSet);
//
//
//        Librarian librarian = new Librarian("Admin","Almaty",
//                "admin@gmail.com",1L,RoleType.ADMIN,"Admin123");
//        Librarian librarian2 = new Librarian("Admin2","Almaty",
//                "admin2@gmail.com",2L,RoleType.ADMIN,"Admin123");
//        Librarian librarian3 = new Librarian("Admin3","Almaty",
//                "admin3@gmail.com",3L,RoleType.ADMIN,"Admin123");
//
//
//
////        departmentService.saveDepartment(department2);
////        departmentService.saveDepartment(department3);
////        departmentService.saveDepartment(department4);
////        departmentService.saveDepartment(department5);
////        studentService.saveStudent(student2);
////        studentService.saveStudent(student3);
////        studentService.saveStudent(student4);
////        studentService.saveStudent(student5);
////        studentService.saveStudent(student);
//        librarianService.saveLibrarian(librarian);
//        librarianService.saveLibrarian(librarian2);
//        librarianService.saveLibrarian(librarian3);
//
//
//
////        System.out.println("Inserted Author:" + author);
////        System.out.println("Inserted Dept :" + department);
////        System.out.println("Inserted Student :" + student);
////        System.out.println("Inserted Librarian :" + librarian);
////        System.out.println("Inserted Book :" + book);
//    }
//}
//
//
//////        Author author = new Author(1L,"Uncle Bob");
////        Author author = new Author(2L,"Thomas H. Cormen");
////        Author author2 = new Author(3L,"Harold Abelson");
////        Author author3 = new Author(4L,"Erich Gamma");
////        Author author4 = new Author(5L,"Andrew Hunt");
//////        Book book = new Book(1L,"Learn Java",authorList /*,category*/);
////        Book book = new Book(2L,"Introduction to Algorithms",authorList /*,category*/);
////        Book book2 = new Book(3L,"Structure and Interpretation of Computer Programs (SICP)",authorList2 /*,category*/);
////        Book book3 = new Book(4L,"Design Patterns: Elements of Reusable Object-Oriented Software",authorList3 /*,category*/);
////        Book book4 = new Book(5L,"The Pragmatic Programmer",authorList4 /*,category*/);
//
////    bookSet.add(book);
////            bookSet2.add(book2);
////            bookSet3.add(book3);
////            bookSet3.add(book4);
////            authorList.add(author);
////            authorList2.add(author2);
////            authorList3.add(author3);
////            authorList3.add(author4);
////
////            authorService.saveAuthor(author);
////            authorService.saveAuthor(author2);
////            authorService.saveAuthor(author3);
////            authorService.saveAuthor(author4);
////            bookService.saveBook(book);
////            bookService.saveBook(book2);
////            bookService.saveBook(book3);
////            bookService.saveBook(book4);