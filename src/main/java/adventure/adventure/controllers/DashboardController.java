package adventure.adventure.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.List;

@Controller
public class DashboardController {

    @GetMapping("/dashboard")
    public String showDashboard(Model model) {
        // dodajmy przykładowe dane do modelu, które będą wyświetlane na stronie
        List<String> data = Arrays.asList("Dane 1", "Dane 2", "Dane 3");
        model.addAttribute("data", data);

        // zwróćmy nazwę szablonu Thymeleaf, który będzie renderowany jako widok dashboardu
        return "dashboard";
    }

    @GetMapping("/login")
    public String showLoginForm() {
        return "login";
    }
}
