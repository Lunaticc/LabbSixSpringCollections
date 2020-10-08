package com.h19davth.springpractice.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
public class FormController {

    @RequestMapping("/userform")
    public String userForm(Model model){
        return "UserForms";
    }

    @RequestMapping("/formresults")
    public String userForm(Model model, @RequestParam Map<String, String> userFormMap){
        model.addAttribute("firstname", userFormMap.get("first_name"));
        model.addAttribute("lastname", userFormMap.get("last_name"));
        model.addAttribute("birthday", userFormMap.get("birthday"));
        model.addAttribute("gender", userFormMap.get("Gender"));
        model.addAttribute("programme", userFormMap.get("programme"));
        model.addAttribute("about-you", userFormMap.get("about-you"));
        return "formresults";
    }
}
