package com.ecom.AmShop.Model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name = "product")
public class Product {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name ="product_id")
    private int product_id;

    @Column(name = "product_name")
    private String product_name;

    @Column(name = "brand", nullable = true)
    private String brand;

    @Column(name = "product_description")
    private String product_description;

    @Column (name = "unit_price")
    private double unit_price;

    @Column( name = "quantity")
    private int quantity;

    @Column (name = "category")
    private String category;

    @Column (name = "capital")
    private String capital;

    @JsonManagedReference
    @OneToMany(mappedBy =  "product",cascade= {CascadeType.PERSIST, CascadeType.MERGE,
            CascadeType.DETACH, CascadeType.REFRESH}, fetch = FetchType.LAZY)
    private List<Images> images = new ArrayList<Images>();

    @JsonBackReference
    @ManyToOne(cascade= {CascadeType.PERSIST, CascadeType.MERGE,
            CascadeType.DETACH, CascadeType.REFRESH}, fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private Users user;

}
