package sklad.artapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

    @GetMapping(path = "/login")
    public String loadLoginPage() {
        return "login";
    }

    @GetMapping(path = {"", "/"})
    public String loadMainPage() {
        return "hello";
    }
}

