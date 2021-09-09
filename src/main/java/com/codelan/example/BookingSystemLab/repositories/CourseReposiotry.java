package com.codelan.example.BookingSystemLab.repositories;

import com.codelan.example.BookingSystemLab.models.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CourseReposiotry extends JpaRepository<Course, Long> {

    List<Course> findByRating(int rating);

    List<Course> findCoursesByBookingsCustomerName(String Name);
}
