package com.garageplug.Garage.Plug.service;

import com.garageplug.Garage.Plug.domain.Customer;
import com.garageplug.Garage.Plug.domain.Order;
import com.garageplug.Garage.Plug.dto.CustomerDTO;
import com.garageplug.Garage.Plug.dto.OrderDTO;
import com.garageplug.Garage.Plug.repository.CustomerRepository;
import com.garageplug.Garage.Plug.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Optional;

@org.springframework.stereotype.Service
public class Service {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private OrderRepository orderRepository;

    public Customer createCustomer(CustomerDTO customerDTO) {
        Customer customer = CustomerDTO.convertDTOtoEntity(customerDTO);
        Customer saveCusotmer = customerRepository.save(customer);
        return saveCusotmer;

    }


    public List<Customer> findAllCustomer() {

        List<Customer> list = customerRepository.findAll();
        return list;
    }

    public Order createOrder(OrderDTO order) {
        Customer customer = customerRepository.getById(order.getCustomerId());

        if(customer.getCustomerCategory().equalsIgnoreCase("gold")){

//            int amount =
        }

        return   ResponseEntity.ok().build();
    }
}
