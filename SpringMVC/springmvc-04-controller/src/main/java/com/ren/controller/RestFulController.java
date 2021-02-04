package com.ren.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class RestFulController {
    // @RequestMapping(path = "/add/{a}/{b}", method = RequestMethod.GET)
    @GetMapping("/add/{a}/{b}")
    public String test1(@PathVariable int a, @PathVariable String b, Model model) {
        String result = a + b;
        model.addAttribute("msg", "结果为 " + result);
        return "test";
    }
}
