package adventure.adventure.controllers;

import adventure.adventure.controllers.service.UserService;
import adventure.adventure.dto.UserDto;
import adventure.adventure.entities.User;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.validation.Valid;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.ModelAndView;

public class RegisterController {

    private UserService UserService;
    @GetMapping("/user/registration")
    public String showRegistrationForm(WebRequest request, Model model) {
        UserDto userDto = new UserDto();
        model.addAttribute("user", userDto);
        return "registration";
    }

    @PostMapping("/user/registration")
    public ModelAndView registerUserAccount(
            @ModelAttribute("user") @Valid UserDto userDto,
            HttpServletRequest request,
            Errors errors) {

        try {
            User registered = UserService.registerNewUserAccount(userDto);
        } catch (IllegalArgumentException uaeEx) {
           // mav.addObject("message", "An account for that username/email already exists.");
           // return mav;
        }

        return new ModelAndView("successRegister", "user", userDto);
    }


}
