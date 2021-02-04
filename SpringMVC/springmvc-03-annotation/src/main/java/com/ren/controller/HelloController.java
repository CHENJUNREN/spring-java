package com.ren.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

// @Controller是为了让Spring IOC容器初始化时自动扫描到
@Controller
public class HelloController {
    // @RequestMapping是为了映射请求路径，这里因为类与方法上都有映射所以访问时应该是/HelloController/hello
    @RequestMapping("/hello")
    public String hello(Model model) {
        // 方法中声明Model类型的参数是为了把Controller中的数据带到视图中
        model.addAttribute("msg", "Hello SpringMVC!");
        // 方法返回的结果是视图的名称hello，加上配置文件中的前后缀变成WEB-INF/jsp/hello.jsp
        return "hello";
    }
}
