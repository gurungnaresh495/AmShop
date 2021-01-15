package com.ecom.AmShop.Model;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@Entity
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name ="order_id")
    private int order_id;

    @Column(name = "order_date")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate order_date;

    @Column(name = "subtotal")
    private double subtotal;

    @Column(name = "tax")
    private double tax;

    @Column(name = "total")
    private double total;

}
