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
    
    @RequestMapping("/woogyuhwan")
    public @ResponseBody String woogyuhwan(){
    	return "방황을 하던 중 윗사람이 돕는구나. 외출은 삼가라.";
    }

}
