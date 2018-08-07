package com.yao.configclient.controler;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigControler {

    @Value("${foo}")
    String foo;
    @RequestMapping(value = "/foo")
    public String getFoo(){
        return foo;
    }


}
