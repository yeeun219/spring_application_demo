package com.example.demo.controller;

import com.example.demo.model.SearchParam;
import org.springframework.web.bind.annotation.*;

@RestController
//어떤 주소로 받을지
@RequestMapping("/api") //localhost:8080/api
public class GetController {

    @RequestMapping(method = RequestMethod.GET, path="/getMethod") //localhost:8080/api/getmethod
    public String getRequest(){
        return "Hi getMethod";
    }

    @GetMapping("/getParameter") //localhost:8080/api/getParameter?id=1234&password=abcd
    public String getParameter(@RequestParam String id ,@RequestParam String password){
        System.out.println("id: "+id);
        System.out.println("password: "+password);

        return id+password;
    }
    @GetMapping("/getMultiParameter")
    public SearchParam getMultiparameter(SearchParam searchParam){
        System.out.println(searchParam.getAccount());
        System.out.println(searchParam.getEmail());
        System.out.println(searchParam.getPage());

        //return "OK";

        //현재는 json으로 return이 안됨,,, return searchParam이 현재는 안됨.,.
        //toString함수를 오버라이드해서 써야함,,,
        return searchParam;
    }

    //파라미터가 지속적으로 늘어나는 경우 parameter를 계속 늘려야함,,,,
    //localhost:8080/api/multiParameter?account=abcd&email=,,,,,,,,

}
