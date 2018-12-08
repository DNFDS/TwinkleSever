package com.example.demo.service.Impl;

import com.example.demo.dao.SongListMapper;
import com.example.demo.dao.UserMapper;
import com.example.demo.entity.SongList;
import com.example.demo.entity.User;
import com.example.demo.entity.result.ResultEntity;
import com.example.demo.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@Service
public class UserImpl implements UserService {
    @Resource
    private UserMapper userMapper;
    @Resource
    private SongListMapper songListMapper;


    @Override
    public ResultEntity SignIn(User user) {
        Map<String,Object>map = new HashMap<>();
        map.put("userid",user.getUserid());
        map.put("userpassword",user.getUserpassword());
        userMapper.isUserExit(map);
        int example = Integer.parseInt(map.get("result").toString());
        if(example == 0){
            return new ResultEntity(false,"User Not Exist or PassWord not correct",null);
        }
        if(example == 1){
            //map.replace("result",user);
            userMapper.getUserById(map);
            ArrayList<User>users = (ArrayList<User>)map.get("result");
            return new ResultEntity(true,"",users.get(0));
        }
        //session*/
        return new ResultEntity(false,this.getClass().toString()+"error",example);
    }

    @Override
    public ResultEntity Register(User user){
        Map<String,Object> map = new HashMap<>();
        map.put("username",user.getUsername());
        map.put("userpassword",user.getUserpassword());
        map.put("userimage",user.getUserimage());
        map.put("usersex",user.getUsersex());
        userMapper.addUser(map);
        int result = Integer.parseInt((String)map.get("result"));
        if(result == 0){
            return new ResultEntity(false,"DB_error",null);
        }
        else{
            map.put("userid",result);
            userMapper.getUserById(map);
            ArrayList<User>users = (ArrayList<User>)map.get("result");
            return new ResultEntity(true,"",users.get(0));
        }
    }
    @Override
    public ResultEntity getFans(User user){
        Map<String,Object>map = new HashMap<>();
        map.put("userid",user.getUserid());
        userMapper.getFansByUserId(map);
        ArrayList<User>fans = (ArrayList<User>)map.get("result");
        return new ResultEntity(true,"",fans);
    }
    @Override
    public ResultEntity getFriends(User user){
        Map<String,Object>map = new HashMap<>();
        map.put("userid",user.getUserid());
        userMapper.getFriendsByUserId(map);
        ArrayList<User>friends = (ArrayList<User>)map.get("result");
        return new ResultEntity(true,"",friends);
    }
    @Override
    public ResultEntity getSongLists(User user){
        Map<String,Object>map = new HashMap<>();
        map.put("userid",user.getUserid());
        songListMapper.getSongListCreatedByUserId(map);//"createdsonglist"
        songListMapper.getSongListKeepedByUserId(map);//"keepedsonglist"
        return new ResultEntity(true,"",map);
    }
}
