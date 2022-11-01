package net.skhu.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import net.skhu.model.UserRegistration;
import net.skhu.service.UserService;

@Controller
public class UserController {

    @Autowired UserService userService;


    @GetMapping("register")
    public String register(Model model) {
        model.addAttribute(new UserRegistration());

        return "user/register";
    }

    @PostMapping("register")
    public String register(Model model,
                           @Valid UserRegistration userRegistration, BindingResult bindingResult)
    {
        if (bindingResult.hasErrors()) {
            return "user/register";
        }
        String hashedPw = BCrypt.hashpw(userRegistration.getPasswd(), BCrypt.gensalt());
        userRegistration.setPasswd(hashedPw);
        userService.save(userRegistration);
        return "redirect:success";
    }

    @RequestMapping("success")
    public String success() {
        return "user/success";
    }
}
