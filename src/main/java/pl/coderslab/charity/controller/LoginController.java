package pl.coderslab.charity.controller;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.coderslab.charity.model.UserEntity;

@Controller
@RequestMapping("/login")
@RequiredArgsConstructor
public class LoginController {


    @GetMapping
    public String loginForm(Model model){
        model.addAttribute("loginForm", new LoginForm());
        return "login-form";
    }
}
