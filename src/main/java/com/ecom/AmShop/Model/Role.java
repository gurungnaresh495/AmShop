package com.ecom.AmShop.Model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.*;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "role")
public class Role {

    @Id
    @GeneratedValue
    @Column(name = "role_id", nullable = false)
    private Long role_id;

    @Column(name = "role_name", length = 30, nullable = false)
    private String role_name;
}
