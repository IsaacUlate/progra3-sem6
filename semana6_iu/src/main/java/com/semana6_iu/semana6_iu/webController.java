package com.semana6_iu.semana6_iu;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/intro")
public class webController {
    
    @GetMapping
    public String index(){
        return "index";
    } 

}
