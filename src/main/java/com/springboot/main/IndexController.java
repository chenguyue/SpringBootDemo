package com.springboot.main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class IndexController {

    @Autowired
    private Config config;
    @RequestMapping("/index")
    public String index()
    {
        System.out.println();
        System.out.println(config.HubbleGroup);
        System.out.println(config.port);
        return "index";
    }
}