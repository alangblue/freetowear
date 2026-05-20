package com.freetowear.repository;

import com.freetowear.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface CustomerRepository extends JpaRepository<Customer, String> {

    boolean existsByEmail(String newEmail);

    Optional<Customer> findByEmailOrPhone(String email, String phone);
    Optional<Customer> findByEmailAndPassword(String email, String password);
    Optional<Customer> findByEmail(String email);
}


