package com.garageplug.Garage.Plug.repository;

import com.garageplug.Garage.Plug.domain.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Long> {
    Customer findById(Customer customerId);
}
