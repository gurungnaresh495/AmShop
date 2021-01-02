package com.ecom.AmShop.DAO;

import com.ecom.AmShop.Model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface UserRepo extends JpaRepository<Users, Integer> {

    @Query("Select u from Users u where u.username = :username" )
    public Users getUser(@Param("username") String username);


}
