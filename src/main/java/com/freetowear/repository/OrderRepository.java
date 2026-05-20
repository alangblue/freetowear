package com.freetowear.repository;

import com.freetowear.entity.Customer;
import com.freetowear.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface OrderRepository extends JpaRepository<Order, String> {

    List<Order> findByCustomer(Customer customer);
}