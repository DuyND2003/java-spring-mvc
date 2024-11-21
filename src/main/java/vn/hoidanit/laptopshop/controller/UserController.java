package vn.hoidanit.laptopshop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import vn.hoidanit.laptopshop.service.UserService;

@Controller
public class UserController {

    private UserService UserService;
    // dependency injection 

    public UserController(UserService UserService) {
        this.UserService = UserService;
    }

    @RequestMapping("/")
    public String getHomePage(){
        String test = this.UserService.handleHello();
        return "duy.html";
    }
    
}

// @RestController
// public class UserController {

//     private UserService UserService;
//     // DI : dependency injection 
//     public UserController(UserService UserService) {
//         this.UserService = UserService;
//     }

//     @GetMapping("")
//     public String getHomePage(){
//         return this.UserService.handleHello();
//     }
    
// }

