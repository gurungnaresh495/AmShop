package com.ecom.AmShop.Model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@Entity
@Table(name = "users")
public class Users {

    @Id
    @GeneratedValue(strategy= GenerationType.TABLE)
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
}
