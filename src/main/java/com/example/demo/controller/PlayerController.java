package com.example.demo.controller;

import com.example.demo.entity.result.ResultEntity;
import com.example.demo.service.PlayerService;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


@Controller
public class PlayerController
{
    @Resource
    private PlayerService playerService;
    @RequestMapping(value = "/play",method = RequestMethod.POST)
    @ResponseBody
    public void test(Model model, @Param(value = "username")String username,@Param(value = "name")String name)
    {
        model.addAttribute(username,name);
    }
    @RequestMapping(value = "/test",method = RequestMethod.GET)
    public String test1()
    {
        return "Player";
    }
    @RequestMapping(value = "/addSongToList",method = RequestMethod.POST)
    public ResultEntity addSongToList(@Param("songID")Integer songID, HttpServletRequest request)
    {
        HttpSession session=request.getSession();
        if(session.getAttribute("playList")==null)
        {
            ArrayList<Integer> arrayList=new ArrayList<>();
            session.setAttribute("playList",arrayList);
        }
        ArrayList<Integer> arrayList=(ArrayList<Integer>) session.getAttribute("playList");
        arrayList.add(songID);
        return new ResultEntity(true,"",null);
    }
    @RequestMapping(value = "/addAlbumToList",method = RequestMethod.POST)
    public ResultEntity addAlbumToList(@Param("albumID")Integer albumID,HttpServletRequest request)
    {
        HttpSession session=request.getSession();
        if(session.getAttribute("playList")==null)
        {
            ArrayList<Integer> arrayList=new ArrayList<>();
            session.setAttribute("playList",arrayList);
        }
        ArrayList<Integer> arrayList=(ArrayList<Integer>) session.getAttribute("playList");

        HashMap<String,Object>hashMap =new HashMap<>();
        hashMap.put("albumid",albumID);
        ArrayList<Integer>album=playerService.getListByAlbumID(hashMap);
        if(album==null||album.size()==0)
        {
            return new ResultEntity(false,"专辑不存在或为空","");
        }
        for(Integer i:album)
        {
            if(arrayList.indexOf(i)==-1)
                arrayList.add(i);
        }
        return new ResultEntity(true,"",null);

    }
    @RequestMapping(value = "/addSongListToList",method = RequestMethod.POST)
    public ResultEntity addSongListToList(@Param("songListID")Integer songListID,HttpServletRequest request)
    {
        HttpSession session=request.getSession();
        if(session.getAttribute("playList")==null)
        {
            ArrayList<Integer> arrayList=new ArrayList<>();
            session.setAttribute("playList",arrayList);
        }
        ArrayList<Integer> arrayList=(ArrayList<Integer>) session.getAttribute("playList");

        HashMap<String,Object>hashMap =new HashMap<>();
        hashMap.put("songlistid",songListID);
        ArrayList<Integer>songList=playerService.getListByListID(hashMap);
        if(songList==null||songList.size()==0)
        {
            return new ResultEntity(false,"歌单不存在或为空","");
        }
        for(Integer i:songList)
        {
            if(arrayList.indexOf(i)==-1)
                arrayList.add(i);
        }
        return new ResultEntity(true,"",null);
    }
}
