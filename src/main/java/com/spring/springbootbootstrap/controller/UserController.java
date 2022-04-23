package com.spring.springbootbootstrap.controller;

import com.spring.springbootbootstrap.model.User;
import com.spring.springbootbootstrap.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {

    @GetMapping("/users")
    public String getSinglePage(@AuthenticationPrincipal User user, Model model) {
        model.addAttribute("authUser", user);
        return "users";
    }

//    @GetMapping(value = "login")
//    public String loginPage() {
//        return "users/login";
//    }

//    @GetMapping
//    public String getInfoFromMyself(@AuthenticationPrincipal User user, Model model) {
//        model.addAttribute("user", userService.getUserByLogin(user.getUsername()));
//        return "user";
//    }
}
