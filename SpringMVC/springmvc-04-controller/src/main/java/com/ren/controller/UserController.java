package com.ren.controller;

import com.ren.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/t1")
    public String test1(String name, Model model) {
        model.addAttribute("msg", "you send a parameter: " + name);
        return "test";
    }

    @RequestMapping("/t2")
    public String test2(@RequestParam("param") String name, Model model) {
        model.addAttribute("msg", "you send a parameter: " + name);
        return "test";
    }

    @RequestMapping("/t3")
    public String test3(User user, Model model) {
        model.addAttribute("msg", "you send a parameter: " + user.toString());
        return "test";
    }
}
