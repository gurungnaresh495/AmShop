package com.ecom.AmShop.Service;

import com.ecom.AmShop.DAO.RoleRepo;
import com.ecom.AmShop.DAO.UserRepo;
import com.ecom.AmShop.DAO.UserRoleRepo;
import com.ecom.AmShop.Model.Role;
import com.ecom.AmShop.Model.User_role;
import com.ecom.AmShop.Model.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepo userRepo;

    @Autowired
    private RoleRepo roleRepo;

    @Autowired
    private UserRoleRepo userRoleRepo;

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Override
    public void saveUser(Users user) {
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        userRepo.save(user);
    }

    @Override
    public void saveUserRole(User_role userRole) {
        userRoleRepo.save(userRole);
    }


    @Override
    public Users findUserByUsername(String username) {
        return null;
    }

    @Override
    public Role findRoleByName(String role_name) {
        return roleRepo.getRoleByRoleName(role_name);
    }
}
