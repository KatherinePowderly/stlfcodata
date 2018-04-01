package com.katherinepowderly.stlfcodata.controllers;

import com.katherinepowderly.stlfcodata.models.csb;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


import java.util.ArrayList;

@Controller
public class Homepage {

static ArrayList<csb> csbs = new ArrayList<>();

    @RequestMapping(value = "")
    public String index(Model model) {
        model.addAttribute("csbs", csbs);
        model.addAttribute("title", "STLFCO Data Log");
        return "stlfcodatalog/index"; //file name -- remove .html
    }

    @RequestMapping(value = "addnew", method = RequestMethod.GET)
    public String addnew(Model model) {
        model.addAttribute("title", "Add New CSB");
        return "stlfcodatalog/addnew";
    }

    @RequestMapping(value = "addnew", method = RequestMethod.POST)
    public String processAddCSBForm(@RequestParam String date, @RequestParam String address, @RequestParam String intersectionOne,
                                    @RequestParam String intersectionTwo, @RequestParam String city, @RequestParam String state, @RequestParam String zip, @RequestParam String catsReported,
                                    @RequestParam String ward, @RequestParam String complaintantName, @RequestParam String complaintantAddress, @RequestParam String complaintantPhone){


        csb newcsb = new csb(date, address, intersectionOne, intersectionTwo, city, state, zip, catsReported, ward, complaintantName, complaintantAddress, complaintantPhone);

        csbs.add(newcsb);

        return "redirect:";
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

    @RequestMapping(value = "usermain")
    public String usermain(Model model) {
        model.addAttribute("title", "User Homepage");
        return "stlfcodatalog/usermain";
    }




}
