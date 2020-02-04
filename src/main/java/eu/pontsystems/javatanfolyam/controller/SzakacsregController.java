package eu.pontsystems.javatanfolyam.controller;


import eu.pontsystems.javatanfolyam.model.Szakacs;
import eu.pontsystems.javatanfolyam.service.SzakacsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class SzakacsregController {

    @Autowired
    private SzakacsService szakacsService;


    @RequestMapping(value = "/szakacsreg", method = RequestMethod.GET)
    public String getSzakacs( Model model) {

        List<Szakacs> szakacsList = szakacsService.getAllSzakacs();


        model.addAttribute("szakacsList", szakacsList);
        model.addAttribute("szakacs", new Szakacs());




        return "szakacsreg";
    }

    @RequestMapping(value = "/addSzakacs", method = RequestMethod.POST)
    public String addSzakacs(@ModelAttribute("etel") Szakacs szakacs) {

        szakacsService.addSzakacs(szakacs);


        return "redirect:/szakacsreg";
    }

    @RequestMapping(value = "/delSzakacs/{id}", method = RequestMethod.GET)
    public String deleteSzakacs(@PathVariable("id") Long id) {

        szakacsService.del(id);

        return "redirect:/szakacsreg";
    }

    @RequestMapping(value = "/updateSzakacs/{id}", method = RequestMethod.GET)
    public String updateEtel(@PathVariable("id") Long id,Model model) {

        List<Szakacs> szakacsList = szakacsService.getAllSzakacs();

        model.addAttribute("szakacsLista", szakacsList);
        model.addAttribute("etel", szakacsService.getSzakacs(id));


        szakacsService.getSzakacs(id);
        return "szakacsreg";
    }


}
