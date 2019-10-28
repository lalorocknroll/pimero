package com.example.pimero;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MiController {

    @RequestMapping(value ="/saluda")
    @ResponseBody
    public String saluda(){
        return "Hola Mundo!!!!!";
    }
}