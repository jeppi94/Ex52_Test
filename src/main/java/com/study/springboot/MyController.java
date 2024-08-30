package com.study.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {

    @RequestMapping("/")
    public @ResponseBody String root() throws Exception{
        return "JSP in Gradle";
    }
 
    @RequestMapping("/test1")    // localhost:8081/test1
    public String test1() {
        return "test1";          // 실제 호출 될 /WEB-INF/views/test1.jsp       
    }
    
    @RequestMapping("/dmswl2515")
    public @ResponseBody String dmswlTest(){
        return "김은지 입니다.";
    }

    @RequestMapping("/daily")
    public @ResponseBody String dailyTest(){
        return "daily page";
    }

}
