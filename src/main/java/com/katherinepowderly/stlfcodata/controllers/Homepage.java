package com.katherinepowderly.stlfcodata.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class Homepage {

    @RequestMapping(value = "")
    public String index(Model model) {
        model.addAttribute("title", "STLFCO Data Log");
        return "stlfcodatalog/index"; //file name -- remove .html
    }

    @RequestMapping(value = "addnew")
    public String addnew(Model model) {
        model.addAttribute("title", "Add New CSB");
        return "stlfcodatalog/addnew";
    }

    @RequestMapping(value = "csb")
    public String csb(Model model) {
        model.addAttribute("title", "Individual CSB List");
        return "stlfcodatalog/csb";
    }

    @RequestMapping(value = "search")
    public String search(Model model) {
        model.addAttribute("title", "Search Data");
        return "stlfcodatalog/search";
    }

    @RequestMapping(value = "register")
    public String register(Model model) {
        model.addAttribute("title", "Register");
        return "stlfcodatalog/registration";
    }

    @RequestMapping(value = "usermain")
    public String usermain(Model model) {
        model.addAttribute("title", "User Homepage");
        return "stlfcodatalog/usermain";
    }



}
