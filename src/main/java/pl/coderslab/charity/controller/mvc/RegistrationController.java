package pl.coderslab.charity.controller.mvc;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.coderslab.charity.model.UserEntity;
import pl.coderslab.charity.service.UserService;

import javax.validation.Valid;

@Controller
@RequestMapping("/register")
@RequiredArgsConstructor
public class RegistrationController {

    private final UserService userService;
    //private final PasswordEncoder passwordEncoder;

    @GetMapping
    public String register(Model model) {
        model.addAttribute("user", new UserEntity());
        return "register";
    }

    @PostMapping
    public String register(@ModelAttribute("user") @Valid UserEntity user, BindingResult result) {
        //if (result.hasErrors() && user.getPassword().equals(user.getPassword2()) ){
        if (result.hasErrors()){
        return "register";

        }
            userService.saveUser(user);
            return "landing-page";
        }

    }



