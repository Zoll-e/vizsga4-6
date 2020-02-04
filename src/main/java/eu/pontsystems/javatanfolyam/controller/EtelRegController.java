package eu.pontsystems.javatanfolyam.controller;

import eu.pontsystems.javatanfolyam.model.Etel;
import eu.pontsystems.javatanfolyam.service.EtelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class EtelRegController {

    @Autowired
    private EtelService etelService;


    @RequestMapping(value = "/etelreg", method = RequestMethod.GET)
    public String getEtel( Model model) {

        List<Etel> etelList = etelService.getAllEtel();


        model.addAttribute("etelLista", etelList);
        model.addAttribute("etel", new Etel());




        return "etelreg";
    }

    @RequestMapping(value = "/addEtel", method = RequestMethod.POST)
    public String addEtel(@ModelAttribute("etel") Etel etel) {

        etelService.addEtel(etel);


        return "redirect:/etelreg";
    }

    @RequestMapping(value = "/delEtel/{id}", method = RequestMethod.GET, headers = "Accept=application/json")
    public String deleteEtel(@PathVariable("id") Long id) {

        etelService.del(id);

        return "redirect:/etelreg";
    }

    @RequestMapping(value = "/updateEtel/{id}", method = RequestMethod.GET, headers = "Accept=application/json")
    public String updateEtel(@PathVariable("id") Long id,Model model) {

        List<Etel> etelList = etelService.getAllEtel();

        model.addAttribute("etelLista", etelList);
        model.addAttribute("etel", etelService.getEtel(id));


        etelService.getEtel(id);
        return "etelreg";
    }


}
