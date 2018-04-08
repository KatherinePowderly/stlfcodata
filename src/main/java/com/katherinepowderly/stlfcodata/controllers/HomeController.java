package com.katherinepowderly.stlfcodata.controllers;


import com.katherinepowderly.stlfcodata.models.csb;
import com.katherinepowderly.stlfcodata.models.data.CsbDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
public class HomeController {

    @Autowired
    private CsbDao csbDao;

    @RequestMapping(value = "")
    public String index(Model model) {
        model.addAttribute("csbs", csbDao.findAll());
        model.addAttribute("title", "STLFCO Data Log");
        return "stlfcodatalog/csbfunctionality/index"; //file name -- remove .html
    }

    @RequestMapping(value = "addnew", method = RequestMethod.GET)
    public String addnew(Model model) {
        model.addAttribute("title", "Add New CSB");
        model.addAttribute(new csb());

        return "stlfcodatalog/csbfunctionality/addnew";
    }

    @RequestMapping(value = "addnew", method = RequestMethod.POST)
    public String processAddCSBForm(@ModelAttribute csb newCsb){

        csbDao.save(newCsb);

        return "redirect:";
    }

    @RequestMapping(value = "remove", method = RequestMethod.GET)
    public String displayRemoveCSB(Model model) {
        model.addAttribute("csbs", csbDao.findAll());
        model.addAttribute("title", "Remove CSB");
        return "stlfcodatalog/csbfunctionality/remove";
    }

    @RequestMapping(value = "remove", method = RequestMethod.POST)
    public String processRemoveCSB(@RequestParam int[] csbIds) {
        for (int csbId : csbIds) {
            csbDao.deleteById(csbId);
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
