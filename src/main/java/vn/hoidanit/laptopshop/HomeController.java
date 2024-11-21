package vn.hoidanit.laptopshop;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @RequestMapping("/")
    public String home() {
        return "Hello, world guy dasdas dasdassa??? ";
    }
}
