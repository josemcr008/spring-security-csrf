package com.example.springsecuritycsrf.controller;


import com.example.springsecuritycsrf.DTO.UserDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserRestController {

    @GetMapping("/api/hola")
    public String hola()
    {
        return "Hola Mundo";
    }

    //Este necesita autenticación
    @GetMapping("/api/adios")
    public String adios()
    {
        return "Adios Mundo";
    }

    @PostMapping("/api/users")
    public String save(@RequestBody UserDTO user)
    {
        System.out.println(user);
        return "OK";
    }
}
