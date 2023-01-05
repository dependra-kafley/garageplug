package com.garageplug.Garage.Plug.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Double amount;
    private Integer quantity;
  @ManyToOne()
  @JoinColumn(name="customer_id",referencedColumnName = "id")
    private Customer customerId;
}
