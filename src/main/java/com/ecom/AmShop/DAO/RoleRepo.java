package com.ecom.AmShop.DAO;

import com.ecom.AmShop.Model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface RoleRepo extends JpaRepository<Role, Integer> {

    @Query("select r from Role r where r.role_name = :role_name")
    public Role getRoleByRoleName(@Param("role_name") String role_name);
}
