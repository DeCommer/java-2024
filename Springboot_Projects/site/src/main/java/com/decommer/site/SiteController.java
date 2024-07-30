package com.decommer.site;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SiteController {

    @GetMapping("/")
    public String getHome(Model model) {
        model.addAttribute("home");
        return "home";
    }
}
