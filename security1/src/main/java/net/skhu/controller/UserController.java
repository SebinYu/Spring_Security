package net.skhu.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {

    @RequestMapping("user/index")
    public String index(Model model) {
        return "user/index";
    }

    @RequestMapping("user/redirect")
    public String redirect(Model model, HttpServletRequest request) {
        if (request.isUserInRole("ROLE_ADMIN"))
            return "redirect:/admin/index";
        if (request.isUserInRole("ROLE_PROFESSOR")) {
            return "redirect:/professor/index";
        }
        return "redirect:/user/index";
    }

    @Secured("ROLE_ADMIN")
    @RequestMapping("user/admin_only")
    public String admin_only(Model model) {
        return "user/admin_only";
    }

    @Secured("ROLE_PROFESSOR")
    @RequestMapping("user/professor_only")
    public String professor_only(Model model) {
        return "user/professor_only";
    }
}
