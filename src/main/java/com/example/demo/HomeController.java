package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
    @GetMapping("/employeeform")
    public String FormPage(Model model){
        model.addAttribute("person",new Employee());
        model.addAttribute("job",new Job());
        return "employeeform";
    }


    @PostMapping("/employeeform")
    public String loadFormPage(@ModelAttribute Employee employee,@ModelAttribute Job job,@RequestParam("random") String random, Model model){

        employee.setJob(job);
        model.addAttribute("random",random);
//        Job newjob= new Job();
//        newjob.setName(random);
//        employee.setJob(newjob);
        model.addAttribute("person",employee);
        return "confirmemployee";
    }
}
