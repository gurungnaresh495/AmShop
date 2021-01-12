package com.ecom.AmShop.Model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name = "users")
public class Users {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name= "user_id")
    private int user_id;

    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;

    @Column(name = "first_name")
    private String first_name;

    @Column(name = "last_name")
    private String last_name;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Column(name = "date_of_birth")
    private LocalDate date_of_birth;

    @Column(name="gender")
    private String gender;

    @Column(name = "phone")
    private String phone;

    @Column(name = "street")
    private String street;

    @Column(name =  "city")
    private String city;

    @Column(name = "zip")
    private int zip;

    @Column(name = "state")
    private String state;

    @Column(name = "country")
    private String country;

    @JsonManagedReference
    @OneToMany(mappedBy =  "user",cascade= {CascadeType.PERSIST, CascadeType.MERGE,
            CascadeType.DETACH, CascadeType.REFRESH}, fetch = FetchType.LAZY)
    private List<Product> products = new ArrayList<Product>();

    public void setProducts(Product product)
    {
        if (products.isEmpty() || product == null)
        {
            this.products = new ArrayList<Product>();
        }
        this.products.add(product);
    }

}
