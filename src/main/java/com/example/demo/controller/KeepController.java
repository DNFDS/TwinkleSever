package com.example.demo.controller;

import com.example.demo.entity.SongList;
import com.example.demo.entity.User;
import com.example.demo.entity.result.ResultEntity;
import com.example.demo.service.KeepService;
import com.example.demo.service.SongListService;
import com.example.demo.service.UserService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.Map;


@Controller
public class KeepController {
    @Autowired
    private KeepService keepService;
    @Autowired
    private UserService userService;
    @Autowired
    private SongListService songListService;

    @ResponseBody
    @RequestMapping(value = "/KeepSong",method = RequestMethod.POST)
    public ResultEntity KeepSong(@Param("songlistid")String songlistid, @Param("songid")String songid,
                                 HttpServletRequest request){
        String result = keepService.KeepSong(songid,songlistid);
        boolean succ = true;
        if(result.equals("0")){
            succ = false;
            return new ResultEntity(succ,"保存失败,歌曲已存在",null);
        }
        return new ResultEntity(succ,"保存成功",null);
    }

    @ResponseBody
    @RequestMapping(value = "/KeepSongList",method = RequestMethod.POST)
    public ResultEntity KeepSongList(@Param("songlistid")String songlistid, HttpServletRequest request){
        User user = (User) request.getSession(false).getAttribute("user");
        String result = keepService.KeepSongList(songlistid,user.getUserid());
        boolean succ = true;
        if(result.equals("0")){
            succ = false;
            return new ResultEntity(succ,"歌单已收藏",null);
        }
        return new ResultEntity(succ,"收藏成功",null);
    }

    @ResponseBody
    @RequestMapping(value = "/favoriteSong",method = RequestMethod.POST)
    public ResultEntity favoriteSong(@Param("songid")String songid, HttpServletRequest request){
        User user = (User) request.getSession(false).getAttribute("user");
        SongList favorite = userService.getFavoritelist(user.getUserid());
        boolean succ = true;
        if(favorite == null){
            succ = false;
            return new ResultEntity(succ,"用户默认歌单不存在",null);
        }
        String result = keepService.KeepSong(songid,favorite.getSonglistid());
        if(result.equals("0")){
            succ = false;
            return new ResultEntity(succ,"保存失败,歌曲已存在",null);
        }
        return new ResultEntity(succ,"喜欢成功",null);
    }

    @ResponseBody
    @RequestMapping(value = "/createNewSonglist",method = RequestMethod.POST)
    public ResultEntity createNewSonglist(@Param("name")String name, @Param("isprivate")String isprivate,@Param("image")String image, HttpServletRequest request) {
        User user = (User) request.getSession(false).getAttribute("user");
        String id = songListService.createNewSongList(name,image,isprivate,user.getUserid());
        return new ResultEntity(true,"您新创建的歌单id为: "+id,null);
    }
}
