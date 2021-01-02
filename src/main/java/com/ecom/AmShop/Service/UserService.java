package com.ecom.AmShop.Service;

import com.ecom.AmShop.Model.Role;
import com.ecom.AmShop.Model.User_role;
import com.ecom.AmShop.Model.Users;

public interface UserService {

    void saveUser(Users user);
    void saveUserRole(User_role userRole);
    Users findUserByUsername(String username);
    Role findRoleByName(String role_name);
}
