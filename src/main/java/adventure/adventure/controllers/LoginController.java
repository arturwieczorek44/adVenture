package adventure.adventure.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/login_form")
public class LoginController {

    @GetMapping
    public String showLoginForm()
    {
        return "loginform";
    }

    @PostMapping
    public String login(@RequestParam String username, @RequestParam String password) {
        return "/";
    }
}
