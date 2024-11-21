package vn.hoidanit.laptopshop.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import vn.hoidanit.laptopshop.service.UserService;

// @Controller
// public class UserController {
//     @RequestMapping("/")
//     public String getHomePage(){
//         return " hello guy ";
//     }
    
// }

@RestController
public class UserController {

    private UserService UserService;
    // DI : dependency injection 
    public UserController(UserService UserService) {
        this.UserService = UserService;
    }

    @GetMapping("")
    public String getHomePage(){
        return " hello guy from controller ";
    }
    
}

