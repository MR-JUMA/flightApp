package com.example.flightreservation.controllers;

import com.example.flightreservation.entities.User;
import com.example.flightreservation.repos.UserRepository;
import com.example.flightreservation.services.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import javax.servlet.ServletContext;


@Controller
public class UserController {

    //ServletContext sc;

    @Autowired
     private userService service;


    @RequestMapping("/showReg")
    public  String showRegistration(){
        return "registerUser";
    }

    @RequestMapping("/regUser")
    public String register(@ModelAttribute("user") User user){
        service.saveUser(user);
        return "login";
    }


    @RequestMapping(value="/login", method=RequestMethod.POST)
    public String login(@RequestParam("email") String email, @RequestParam("password") String password, ModelMap modelMap){
        User user= service.findByEmail(email);
        if(user.getEmail().equals(email) && user.getPassword().equals(password)) {
            return "findFlights";
        }
        else {
            modelMap.addAttribute("msg","Invalid Username or password.. Please try again");
        }
        return "login";
    }


}
