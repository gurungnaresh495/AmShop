package com.ecom.AmShop.DAO;

import com.ecom.AmShop.Model.User_role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UserRoleRepo extends JpaRepository<User_role, Integer> {

    @Query("Select ur.role.role_name from User_role ur where ur.user.user_id = :user_id")
    public List<String> getRoles(@Param("user_id") int user_id);
}
