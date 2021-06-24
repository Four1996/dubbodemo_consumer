package com.ph.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.ph.service.HelloService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @program: dubbodemo_comsumer
 * @description:
 * @author: panhao
 * @date: 2021-06-24 20:27
 **/
@Controller
@RequestMapping("/demo")
public class HelloController {
    @Reference
    private HelloService helloService;

    @RequestMapping("/hello")
    @ResponseBody
    public String getName(String name){
        //远程调用
        // String res = helloService.sayHello(name);
        // System.out.println(res);
        if (name==null) return null;
        return helloService.sayHello(name);
    }
}
