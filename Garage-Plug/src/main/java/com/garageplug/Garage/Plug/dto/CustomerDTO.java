package com.garageplug.Garage.Plug.dto;

import com.garageplug.Garage.Plug.domain.Customer;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerDTO {
    private String name;
    private String address;
    private String age;
    private String mobileNo;

    private String customerCategory;

    public static Customer convertDTOtoEntity(CustomerDTO customerDTO){
        Customer customer = new Customer();
        customer.setName(customerDTO.getName());
        customer.setAge(customerDTO.getAge());
        customer.setAddress(customerDTO.getAddress());
        customer.setMobileNo(customerDTO.getMobileNo());
        customer.setCustomerCategory(customerDTO.getCustomerCategory());
        return customer;
    }
}
