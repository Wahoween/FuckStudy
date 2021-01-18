package com.fuckstudy.dubbocomsumer.controller;

import com.fuckstudy.service.ProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/say")
public class HelloWorldController {
    @Autowired
    private ProviderService providerService;

    @RequestMapping( "/hello")
    @ResponseBody
    private String consumerController(@RequestParam("word")  String word){
        System.out.println("word = " + word);
        return providerService.sayHello(word);
    }
}
