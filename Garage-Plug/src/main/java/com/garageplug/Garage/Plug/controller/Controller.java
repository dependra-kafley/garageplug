package com.garageplug.Garage.Plug.controller;

import com.garageplug.Garage.Plug.domain.Customer;
import com.garageplug.Garage.Plug.domain.Order;
import com.garageplug.Garage.Plug.dto.CustomerDTO;
import com.garageplug.Garage.Plug.dto.OrderDTO;
import com.garageplug.Garage.Plug.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController("/")
public class Controller {

    @Autowired
    private Service service;

    @PostMapping("/customer")
    public ResponseEntity createCustomer(@RequestBody CustomerDTO customerDTO) throws Exception {
        if(customerDTO.getName()==null){
            throw  new Exception("Name is empty");

        }

        Customer customer = service.createCustomer(customerDTO);


        return ResponseEntity.ok().body(customer);
    }

    @GetMapping("/customer")
    public ResponseEntity getAllCustomer(){
      List<Customer> customerList = service.findAllCustomer();

      return ResponseEntity.ok().body(customerList);
    }

    @PostMapping("/order")
    public ResponseEntity createOrder(@RequestBody OrderDTO order){

        service.createOrder(order);


    }

}
