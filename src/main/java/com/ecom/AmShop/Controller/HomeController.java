package com.ecom.AmShop.Controller;

import com.ecom.AmShop.Model.RoleNameHolder;
import com.ecom.AmShop.Model.User_role;
import com.ecom.AmShop.Model.Users;
import com.ecom.AmShop.Service.UserService;
import com.ecom.AmShop.Service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {

    @Autowired
    private UserService userService;

    @GetMapping("/")
    public String homePage()
    {
        return "homePage";
    }

    @GetMapping("/login")
    public String login()
    {
        return "loginPage";
    }

    @GetMapping("/signup")
    public String signup(Model model)
    {
        Users user = new Users();
        RoleNameHolder roleNameHolder = new RoleNameHolder();

        model.addAttribute(user);
        model.addAttribute(roleNameHolder);
        return "signupPage";
    }

    @GetMapping("/userProfile")
    public String temProfile()
    {
        return "userProfile";
    }

    @PostMapping("/save")
    public String SaveUser(@ModelAttribute("user") Users user, @ModelAttribute("roleNameHolder") RoleNameHolder roleNameHolder)
    {
        User_role user_role = new User_role();
        user_role.setRole(userService.findRoleByName(roleNameHolder.getRoleName()));
        user_role.setUser(user);
        userService.saveUser(user);
        userService.saveUserRole(user_role);
        return "userProfile";
    }

}
