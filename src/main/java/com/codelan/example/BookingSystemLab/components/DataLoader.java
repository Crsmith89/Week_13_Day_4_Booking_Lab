package com.codelan.example.BookingSystemLab.components;


import com.codelan.example.BookingSystemLab.models.Booking;
import com.codelan.example.BookingSystemLab.models.Course;
import com.codelan.example.BookingSystemLab.models.Customer;
import com.codelan.example.BookingSystemLab.repositories.BookingRepository;
import com.codelan.example.BookingSystemLab.repositories.CourseReposiotry;
import com.codelan.example.BookingSystemLab.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    BookingRepository bookingRepository;

    @Autowired
    CourseReposiotry courseReposiotry;

    @Autowired
    CustomerRepository customerRepository;

    public DataLoader(){

    }

    public void run(ApplicationArguments args){
        Course course1 = new Course("Python", "Glasgow", 4);
        courseReposiotry.save(course1);

        Course course2 = new Course("Becoming a magician", "Magic Land", 5);
        courseReposiotry.save(course2);

        Customer customer1 = new Customer("James", "Edinburgh",26);
        customerRepository.save(customer1);

        Customer customer2 = new Customer("Craig", "Sloch", 18 );
        customerRepository.save(customer2);

        Booking booking1 = new Booking("2/2/22", course1, customer1);
        bookingRepository.save(booking1);

        Booking booking2 = new Booking("5/12/2050", course2, customer2);
        bookingRepository.save(booking2);
    }

}
