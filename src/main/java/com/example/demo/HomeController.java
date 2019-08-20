package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {
    @GetMapping("/employeeform")
    public String FormPage(Model model){
        model.addAttribute("person",new Employee());
        return "employeeform";
    }


    @PostMapping("/employeeform")
    public String loadFormPage(@ModelAttribute Employee employee, Model model){
        model.addAttribute("person",employee);
        return "confirmemployee";
    }
}