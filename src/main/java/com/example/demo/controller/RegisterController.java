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
public class RegisterController {

    @Autowired
    private UserService userService;
    @RequestMapping(value ="/Register",method = RequestMethod.GET)
    public String Register(){
        return "Register";
    }

    @RequestMapping(value ="/Register",method = RequestMethod.POST)
    public String toRegister(@RequestParam("name") String name,@RequestParam("pwd")String pwd, @RequestParam("pwd_again")String pwd_again,
                        Map<String, Object> map,HttpServletRequest request){
        if(!pwd.equals(pwd_again)){
            map.put("errMsg","Passwords are different");
            return "Register";
        }
        User user = new User();
        user.setUsername(name);
        user.setUserpassword(pwd);
        ResultEntity result = userService.Register(user);
        if(result.getSuccess()){
            request.getSession().setAttribute("user",result.getObject());
            return "test";
        }
        else{
            map.put("errMsg",result.getErrorMsg());
            return "Register";
        }
    }
}
