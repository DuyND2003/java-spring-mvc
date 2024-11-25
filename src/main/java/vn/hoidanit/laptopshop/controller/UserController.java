package vn.hoidanit.laptopshop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
    public String getHomePage(Model model){
        String test = this.UserService.handleHello();
        model.addAttribute("eric", test);
        model.addAttribute("hoidanit", " from controller with model");
        return "hello";
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

