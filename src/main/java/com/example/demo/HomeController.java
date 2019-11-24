package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pojos.Person;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("/")
public class HomeController {

    @GetMapping("")
    public String index(Model model) {
        model.addAttribute("person", new Person());
        return "index";
    }

//    @GetMapping("index")
//    public String index (Model model){
//        model.addAttribute("person", new Person());
//        return "index";
//    }

    @PostMapping("submit")
    public String indexPost (@RequestBody Person person, Model model){

        model.addAttribute("personSelected", person);
        return "works";
    }

}
