package com.garageplug.Garage.Plug.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String address;
    private String age;
    private String mobileNo;

    private String customerCategory;

    @OneToMany(targetEntity = Order.class)
    @JoinColumn(name = "customer_id",referencedColumnName = "id")
    private Set<Order> orders;
}
