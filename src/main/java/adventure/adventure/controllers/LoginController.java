package adventure.adventure.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/login_form")
public class LoginController {

    @GetMapping()
    public String showLoginForm()
    {
        return "login_form";
    }

    @PostMapping()
    public String login(@RequestParam String username, @RequestParam String password) {
        return "/";
    }
}
