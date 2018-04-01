package com.katherinepowderly.stlfcodata.controllers;

import com.katherinepowderly.stlfcodata.models.csb;
import com.katherinepowderly.stlfcodata.models.csbData;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;

@Controller
public class Homepage {

    @RequestMapping(value = "")
    public String index(Model model) {
        model.addAttribute("csbs", csbData.getAll());
        model.addAttribute("title", "STLFCO Data Log");
        return "stlfcodatalog/csbfunctionality/index"; //file name -- remove .html
    }

    @RequestMapping(value = "addnew", method = RequestMethod.GET)
    public String addnew(Model model) {
        model.addAttribute("title", "Add New CSB");
        return "stlfcodatalog/csbfunctionality/addnew";
    }

    @RequestMapping(value = "addnew", method = RequestMethod.POST)
    public String processAddCSBForm(@RequestParam String date, @RequestParam String address, @RequestParam String intersectionOne,
                                    @RequestParam String intersectionTwo, @RequestParam String city, @RequestParam String state, @RequestParam String zip, @RequestParam String catsReported,
                                    @RequestParam String ward, @RequestParam String complaintantName, @RequestParam String complaintantAddress, @RequestParam String complaintantPhone){


        csb newcsb = new csb(date, address, intersectionOne, intersectionTwo, city, state, zip, catsReported, ward, complaintantName, complaintantAddress, complaintantPhone);

        csbData.add(newcsb);

        return "redirect:";
    }

    @RequestMapping(value = "remove", method = RequestMethod.GET)
    public String displayRemoveCSB(Model model) {
        model.addAttribute("csbs", csbData.getAll());
        model.addAttribute("title", "Remove CSB");
        return "stlfcodatalog/csbfunctionality/remove";
    }

    @RequestMapping(value = "remove", method = RequestMethod.POST)
    public String processRemoveCSB(@RequestParam int[] csbIds) {

        for (int csbId : csbIds) {
            csbData.remove(csbId);
        }

        return "redirect:";
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
