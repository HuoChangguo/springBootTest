package com.example.demo;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class hello {

    @RequestMapping("index")
    public String mainPage() {
       // map.put("hello", "欢迎进入HTML页面");
        return "index";
    }
}
	
