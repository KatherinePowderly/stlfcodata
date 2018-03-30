package com.katherinepowderly.stlfcodata.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;


@Controller
public class Homepage {

    static HashMap<String, String> csbfiles = new HashMap<>();


    @RequestMapping(value = "")
    public String index(Model model) {
        model.addAttribute("title", "STLFCO Data Log");
        return "stlfcodatalog/index"; //file name -- remove .html
    }

    @RequestMapping(value = "addnew", method = RequestMethod.GET)
    public String addnew(Model model) {
        model.addAttribute("title", "Add New CSB");
        return "stlfcodatalog/addnew";
    }

    @RequestMapping(value = "addnew", method = RequestMethod.POST)
    public String addnew(@RequestParam String dateField, String addressField, String intersectionFieldOne,
                         String intersectionFieldTwo, String cityField, String zipField, String catsReportedField,
                         String wardField, String complaintantNameField, String complaintantAddressField, String complaintantPhoneField,
                                       @RequestParam String date, String address, String intersectionOne,
                         String intersectionTwo, String city, String zip, String catsReported, String ward, String complaintantName,
                         String complaintantAddress, String complaintantPhone) {


        csbfiles.put(dateField, date);
        csbfiles.put(addressField, address);
        csbfiles.put(intersectionFieldOne, intersectionOne);
        csbfiles.put(intersectionFieldTwo, intersectionTwo);
        csbfiles.put(cityField, city);
        csbfiles.put(zipField, zip);
        csbfiles.put(catsReportedField, catsReported);
        csbfiles.put(wardField, ward);
        csbfiles.put(complaintantNameField, complaintantName);
        csbfiles.put(complaintantAddressField, complaintantAddress);
        csbfiles.put(complaintantPhoneField, complaintantPhone);

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
