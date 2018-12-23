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
import java.util.Collections;
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
        request.getSession().removeAttribute("playList");
        request.getSession().removeAttribute("playList_mode");
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
    @RequestMapping(value = "/addSongToList",method = RequestMethod.POST)
    public Map addSongToList(@Param("songID")Integer songID, HttpServletRequest request)
    {
        HttpSession session=request.getSession();
        if(session.getAttribute("playList")==null)
        {
            ArrayList<Integer> arrayList=new ArrayList<>();
            ArrayList<Integer> arrayList_mode=new ArrayList<>();
            session.setAttribute("playList",arrayList);
            session.setAttribute("playList_mode",arrayList_mode);
        }
        ArrayList<Integer> arrayList=(ArrayList<Integer>) session.getAttribute("playList");
        ArrayList<Integer> arrayList_mode=(ArrayList<Integer>)session.getAttribute("playList_mode");
        if(arrayList.indexOf(songID)==-1)
        {
            arrayList.add(songID);
            arrayList_mode.add(songID);
        }

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

    @ResponseBody
    @RequestMapping(value = "/getNextSong",method = RequestMethod.POST)
    public Song getNextSong(@Param("songID") String songID,HttpServletRequest request)
    {
        ArrayList<Integer>playList=(ArrayList<Integer>) request.getSession().getAttribute("playList_mode");
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

    @RequestMapping(value = "/getLastSong",method = RequestMethod.POST)
    @ResponseBody
    public Song getLastSong(@Param("songID")String songID,HttpServletRequest request)
    {
        ArrayList<Integer>playList=(ArrayList<Integer>) request.getSession().getAttribute("playList_mode");
        HashMap hashMap=new HashMap();
        Integer temp=playList.indexOf(Integer.parseInt(songID));//当前歌曲的index
        if(temp.equals(0))//当前是第一首
        {
            hashMap.put("songid",playList.get(playList.size()-1));
        }
        else
        {
            hashMap.put("songid",playList.get(temp-1));
        }
        return playerService.getSongByID(hashMap);
    }
    @RequestMapping(value = "/changePlayMode",method = RequestMethod.POST)
    @ResponseBody
    public void changePlayMode(@Param("mode")String mode,@Param("songID")String songID, HttpServletRequest request)
    {
        ArrayList<Integer>playlist=(ArrayList<Integer>)request.getSession().getAttribute("playList");
        request.getSession().removeAttribute("playList_mode");
        if(mode.equals("0"))
        {
            //随机播放
            ArrayList<Integer>temp=new ArrayList<>(playlist);
            Collections.shuffle(temp);
            request.getSession().setAttribute("playList_mode",temp);
        }
        else if(mode.equals("1"))
        {
            //单曲循环
            ArrayList<Integer>temp=new ArrayList<>();
            temp.add(Integer.parseInt(songID));
            request.getSession().setAttribute("playList_mode",temp);
        }
        else
        {
            //顺序播放
            ArrayList<Integer>temp=new ArrayList<>(playlist);
            request.getSession().setAttribute("playList_mode",temp);
        }
    }

    @ResponseBody
    @RequestMapping(value = "/getLrc",method = RequestMethod.POST)
    public String decodeUnicode(@Param("unicode") String unicode)
    {
        StringBuffer string = new StringBuffer();

        String[] hex = unicode.split("\\\\u");

        for (int i = 0; i < hex.length; i++) {

            try {
                // 汉字范围 \u4e00-\u9fa5 (中文)
                if(hex[i].length()>=4){//取前四个，判断是否是汉字
                    String chinese = hex[i].substring(0, 4);
                    try {
                        int chr = Integer.parseInt(chinese, 16);
                        boolean isChinese = true;
                        //转化成功，判断是否在  汉字范围内
                        if (isChinese){//在汉字范围内
                            // 追加成string
                            string.append((char) chr);
                            //并且追加  后面的字符
                            String behindString = hex[i].substring(4);
                            string.append(behindString);
                        }else {
                            string.append(hex[i]);
                        }
                    } catch (NumberFormatException e1) {
                        string.append(hex[i]);
                    }

                }else{
                    string.append(hex[i]);
                }
            } catch (NumberFormatException e) {
                string.append(hex[i]);
            }
        }

        return string.toString();
    }
}
