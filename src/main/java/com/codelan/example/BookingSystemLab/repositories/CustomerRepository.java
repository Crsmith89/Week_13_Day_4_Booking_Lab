package com.codelan.example.BookingSystemLab.repositories;

import com.codelan.example.BookingSystemLab.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
