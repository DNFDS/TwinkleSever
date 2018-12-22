package com.example.demo.controller;

import com.example.demo.entity.Song;
import com.example.demo.entity.result.ResultEntity;
import com.example.demo.service.PlayerService;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

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
    public void play(HttpServletRequest request,@Param("mode")Integer mode)
    {
        if(request.getSession().getAttribute("playerLoaded").equals(0))//还没有播放器界面
        {
            ModelAndView modelAndView=new ModelAndView("Player");
        }
    }
    @ResponseBody
    @RequestMapping(value = "/closePlayer",method = RequestMethod.GET)
    public void closePlayer(HttpServletRequest request)
    {
        request.getSession().removeAttribute("playerLoaded");
    }
    @ResponseBody
    @RequestMapping(value = "/getPlayer",method = RequestMethod.GET)
    public ModelAndView getPlayer(HttpServletRequest request)
    {
        ModelAndView modelAndView=new ModelAndView("Player");
        ArrayList<Integer>playList=(ArrayList<Integer>) request.getSession().getAttribute("playList");
        HashMap hashMap=new HashMap();
        hashMap.put("songid",playList.get(0));
        Song temp=playerService.getSongByID(hashMap);
        modelAndView.addObject("song",temp);
        return modelAndView;
    }

    @ResponseBody
    @RequestMapping(value = "/getNextSong",method = RequestMethod.POST)
    public Song getNextSong(String songID,HttpServletRequest request)
    {
        ArrayList<Integer>playList=(ArrayList<Integer>) request.getSession().getAttribute("playList");
        HashMap hashMap=new HashMap();
        Integer temp=playList.indexOf(Integer.parseInt(songID));//当前歌曲的index
        if(temp.equals(playList.size()-1))//当前是最后一首
        {
            hashMap.put("songid",playList.get(0));
        }
        else
        {
            hashMap.put("songid",playList.get(temp+1));
        }
        return playerService.getSongByID(hashMap);
    }
    @ResponseBody
    @RequestMapping(value = "/addSongToList",method = RequestMethod.POST)
    public Map addSongToList(@Param("songID")Integer songID, HttpServletRequest request)
    {
        HttpSession session=request.getSession();
        if(session.getAttribute("playList")==null)
        {
            ArrayList<Integer> arrayList=new ArrayList<>();
            session.setAttribute("playList",arrayList);
        }
        ArrayList<Integer> arrayList=(ArrayList<Integer>) session.getAttribute("playList");
        arrayList.add(songID);

        if(session.getAttribute("playerLoaded")==null)//还没有播放器界面
        {
            session.setAttribute("playerLoaded",1);
            HashMap hashMap=new HashMap();
            hashMap.put("urllink","http://localhost:8080/getPlayer");
            return hashMap;
        }
        return null;
    }
    @ResponseBody
    @RequestMapping(value = "/addAlbumToList",method = RequestMethod.POST)
    public Map addAlbumToList(@Param("albumID")Integer albumID,HttpServletRequest request)
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
            return null;
        }
        for(Integer i:album)
        {
            if(arrayList.indexOf(i)==-1)
                arrayList.add(i);
        }

        if(session.getAttribute("playerLoaded")==null)
        {
            session.setAttribute("playerLoaded",1);
            HashMap map=new HashMap();
            map.put("urllink","http://localhost:8080/getPlayer");
            return map;
        }
        return null;

    }
    @ResponseBody
    @RequestMapping(value = "/addSongListToList",method = RequestMethod.POST)
    public Map addSongListToList(@Param("songListID")Integer songListID,HttpServletRequest request)
    {
        System.out.println(1);
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
            return null;
        }
        for(Integer i:songList)
        {
            if(arrayList.indexOf(i)==-1)
                arrayList.add(i);
        }
        if(session.getAttribute("playerLoaded")==null)
        {
            session.setAttribute("playerLoaded",1);
            HashMap map=new HashMap();
            map.put("urllink","http://localhost:8080/getPlayer");
            return map;
        }
        return null;
    }
}
