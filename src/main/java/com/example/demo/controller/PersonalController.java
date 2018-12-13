package com.example.demo.controller;


import com.example.demo.entity.SongList;
import com.example.demo.entity.User;
import com.example.demo.entity.result.ResultEntity;
import com.example.demo.service.SongService;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@Controller
public class PersonalController {

    @Autowired
    private UserService userService;
    @Autowired
    private SongService songService;

    @RequestMapping(value = "/profile/like_song", method = RequestMethod.GET)
    public String mainPage(HttpServletRequest request,Map<String, Object> map) {
        ResultEntity e;
        User user = (User) request.getSession(false).getAttribute("visted");
        e = userService.getFans(user);
        ArrayList<User> fans = (ArrayList<User>)e.getObject();
        e= userService.getFriends(user);
        ArrayList<User> friends = (ArrayList<User>)e.getObject();
        e = userService.getSongLists(user);
        Map<String,Object>e_map = (Map<String, Object>) e.getObject();
        ArrayList<SongList> createdsonglist = (ArrayList<SongList>)e_map.get("createdsonglist");
        ArrayList<SongList> keepedsonglist = (ArrayList<SongList>)e_map.get("keepedsonglist");
        getFavoriteList(map,createdsonglist);
        map.put("FansNum",fans.size());
        map.put("FriendsNum",friends.size());
        map.put("SongListNum",createdsonglist.size()+keepedsonglist.size());
        return "profile/like_song";
    }

    @ResponseBody
    @RequestMapping(value = "/profile/like_song_song_typeList", method = RequestMethod.GET)
    public ModelAndView showSongsInList(HttpServletRequest request, HttpServletResponse response){
        String id = request.getParameter("id");
        ResultEntity e;
        Map<String,Object>map = new HashMap<>();
        User user = new User();
        user.setUserid(id);
        e = userService.getSongLists(user);
        Map<String,Object>e_map = (Map<String, Object>) e.getObject();
        ArrayList<SongList> createdsonglist = (ArrayList<SongList>)e_map.get("createdsonglist");
        getFavoriteList(map,createdsonglist);
        return new ModelAndView("/temp/song_list_details",map);
    }

    @ResponseBody
    @RequestMapping(value = "/profile/like_song_songlist_typeList", method = RequestMethod.GET)
    public ModelAndView showSongsListInList(HttpServletRequest request, HttpServletResponse response){
        String id = request.getParameter("id");
        ResultEntity e;
        Map<String,Object>map = new HashMap<>();
        User user = new User();
        user.setUserid(id);
        e = userService.getSongLists(user);
        Map<String,Object>e_map = (Map<String, Object>) e.getObject();
        return new ModelAndView("/temp/songlist_list_details",e_map);
    }

    @RequestMapping(value = "/profile/like_songlist", method = RequestMethod.GET)
    public String like_songlist(HttpServletRequest request,Map<String, Object> map) {
        return "profile/like_songlist_list";
    }

    void getFavoriteList(Map<String,Object> map,ArrayList<SongList> createdsonglist){
        ResultEntity e;
        for(SongList i : createdsonglist){
            if(i.getSonglistname().equals("favorite")){
                map.put("favoritesonglist",i);
                e = songService.getSongsInSongList(i);
                map.put("songs",e.getObject());
                break;
            }
        }
    }
}
