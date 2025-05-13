package microservices.vudev.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    @GetMapping("/welcome")
    public String welcome() {
        System.out.println("================> Account service");
        return "Welcome to Account service";
    }
}
