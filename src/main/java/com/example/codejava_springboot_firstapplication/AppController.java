package com.example.codejava_springboot_firstapplication;

import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AppController {
    @RequestMapping("/homepage")
    public String homepapge(Model model){
        ContactBussiness contactBussiness = new ContactBussiness();
        model.addAttribute("contacts",contactBussiness.getContactList());

        return "homepage";
    }
}
