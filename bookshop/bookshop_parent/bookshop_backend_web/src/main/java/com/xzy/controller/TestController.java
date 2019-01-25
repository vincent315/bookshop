package com.xzy.controller;

import com.xzy.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/test")
public class TestController {

    @Autowired
    private TestService testService;
    @RequestMapping("/hello")
    public String hello(){
        return "hello";
    }
    @RequestMapping("hello1")
    public ModelAndView hello1(int id){
        ModelAndView model = new ModelAndView();
        String password = testService.selectById(id);
        model.addObject("password",password);
        model.setViewName("hello");
        return model;
    }
}
