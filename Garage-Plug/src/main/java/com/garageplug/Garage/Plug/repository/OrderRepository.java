package com.garageplug.Garage.Plug.repository;

import com.garageplug.Garage.Plug.domain.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order,Long> {
}
