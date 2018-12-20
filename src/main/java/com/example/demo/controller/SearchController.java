package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

@Controller
public class SearchController {

    @RequestMapping(value ="/Search",method = RequestMethod.GET)
    public String searchIndex(@RequestParam("words")String searchWords,
                              Map<String, Object> map, HttpServletRequest request){
        return "search";
    }

}
