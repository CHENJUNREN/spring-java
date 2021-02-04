package com.ren.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ren.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {

    @ResponseBody
    @RequestMapping("/j1")
    public String json1() throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        User user = new User("ren", 23, "male");
        String s = mapper.writeValueAsString(user);
        return s;
    }

}
