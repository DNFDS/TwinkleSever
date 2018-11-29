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
public class SignInController {

    @Autowired
    private UserService userService;
    @RequestMapping(value ="/",method = RequestMethod.GET)
    public String index(Map<String, Object> map){
        map.put("test1","id");
        return "Login";
    }

    @RequestMapping(value ="/Login",method = RequestMethod.POST)
    public String Login(@RequestParam("id") String id,@RequestParam("pwd")String pwd,
                        Map<String, Object> map,HttpServletRequest request){
        User user = new User();
        user.setUserid(id);
        user.setUserpassword(pwd);
        ResultEntity result = userService.SignIn(user);
        if(result.getSuccess()){
            request.getSession().setAttribute("user",result.getObject());
            return "redirect:/profile/like_song";
        }
        else{
            map.put("errMsg",result.getErrorMsg());
            return "Login";
        }
    }
    /*@ResponseBody
    @RequestMapping("/getUser")
    public String getUser(HttpServletRequest request){
        return userService.findUserById(request.getParameter("id")).getUsername();
    }*/
}
