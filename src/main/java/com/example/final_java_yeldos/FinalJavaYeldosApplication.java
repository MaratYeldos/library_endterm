package com.example.final_java_yeldos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FinalJavaYeldosApplication {

    public static void main(String[] args) {
        SpringApplication.run(FinalJavaYeldosApplication.class, args);
    }

}


//    BookService bookService = run.getBean(BookService.class);
//    DepartmentService departmentService = run.getBean(DepartmentService.class);
//    LibrarianService librarianService = run.getBean(LibrarianService.class);
//    StudentService studentService = run.getBean(StudentService.class);
//    AuthorService authorService = run.getBean(AuthorService.class);
//
//        new InsertClass(bookService,departmentService,librarianService,studentService,authorService);


//	ApplicationContext context = new ClassPathXmlApplicationContext("applicationConfig.xml");
//	AirportService airportService = context.getBean("airportServiceImpl", AirportServiceImpl.class);
//
//		System.out.println("__________________All Airports__________________");
//		System.out.println(airportService.getAllAirports());
//
//	CompanyService companyService = context.getBean("companyServiceImpl", CompanyServiceImpl.class);
//		System.out.println("__________________All Companies__________________");
//		System.out.println(companyService.getAllCompanies());
//
//	FlightService flightService = context.getBean("flightServiceImpl", FlightServiceImpl.class);
//		System.out.println("__________________All Flight__________________");
//		System.out.println(flightService.getAllFlights());


//		Producer producer = new Producer();
//		producer.send("Hello world!!!");

//		ApplicationContext context = new AnnotationConfigApplicationContext(YeldosApplication.class);
//		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
//		AirportServiceImpl airportService = context.getBean(AirportServiceImpl.class);
//		System.out.println(airportService.getAllAirports());
//		System.out.println(airportService.getOneAirport(1L));
//
//		CompanyServiceImpl companyService = context.getBean(CompanyServiceImpl.class);
//		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
//		System.out.println(companyService.getAllCompanies());
//
//		FlightServiceImpl flightService = context.getBean(FlightServiceImpl.class);
//		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
//		System.out.println(flightService.getAllFlights());
//
//		TicketServiceImpl ticketService = context.getBean(TicketServiceImpl.class);
//		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
//		System.out.println(ticketService.getAllTickets());

//		ticketService.purchasingDate();