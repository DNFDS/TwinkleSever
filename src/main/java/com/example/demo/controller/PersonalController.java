package com.example.demo.controller;


import com.example.demo.entity.User;
import com.example.demo.entity.result.ResultEntity;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

@Controller
public class PersonalController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/profile/like_song", method = RequestMethod.GET)
    public String toRegister(HttpServletRequest request) {
        request.getSession(false).getId();
        return "profile/like_song";
    }
}
