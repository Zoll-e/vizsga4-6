package eu.pontsystems.javatanfolyam.controller;

import eu.pontsystems.javatanfolyam.model.Etel;
import eu.pontsystems.javatanfolyam.service.EtelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;
@Controller
public class WelcomeController {

    @Autowired
    private EtelService etelService;


    @RequestMapping(value = "/welcome", method = RequestMethod.GET)
    public String getEtel( Model model) {

        List<Etel> etelList = etelService.getAllEtel();


        model.addAttribute("etelLista", etelList);

        return "welcome";
    }
}
