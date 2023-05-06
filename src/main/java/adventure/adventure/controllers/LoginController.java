package adventure.adventure.controllers;

import adventure.adventure.entities.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/login_form")
public class LoginController {

    @GetMapping()
    public String showLoginForm()
    {
        return "login_form";
    }

    @PostMapping()
    public String login(User user, Model model) {
        model.addAttribute("message", "Udało ci się zalogować " + user.getUsername());
        return "login_form";
    }
}
