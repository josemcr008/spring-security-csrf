package com.example.springsecuritycsrf.controller;

import com.example.springsecuritycsrf.DTO.UserDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserMVCController {

    @GetMapping("/")
    public String getForm(Model model) {
        model.addAttribute("user", new UserDTO());
        return "user-form";

    }

    @PostMapping("/users")
    public String saveUser(@ModelAttribute("user") UserDTO user) {
        System.out.println(user);
        return "congratulations";

    }
}
