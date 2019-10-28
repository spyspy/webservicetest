package controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebTestController {


    final String weburl = "http://127.0.0.1:8080/kiki/findall";


    @RequestMapping(value = "/wow", method = {RequestMethod.POST,RequestMethod.GET})
    public String Wow(){

        return "Hello Wow!!! This is for Subclass....";
    }



}
