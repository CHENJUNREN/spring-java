package com.ren.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/c3")
public class ControllerTest3 {

    @RequestMapping("/t")
    public String test(Model model) {
        model.addAttribute("msg", "ControllerTest3");
        return "test";
    }
}
