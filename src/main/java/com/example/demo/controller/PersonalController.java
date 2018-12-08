package com.example.demo.controller;


import com.example.demo.entity.SongList;
import com.example.demo.entity.User;
import com.example.demo.entity.result.ResultEntity;
import com.example.demo.service.SongService;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
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
        for(SongList i : createdsonglist){
            if(i.getSonglistname().equals("favorite")){
                map.put("favoritesonglist",i);
                e = songService.getSongsInSongList(i);
                map.put("songs",e.getObject());
                break;
            }
        }
        map.put("FansNum",fans.size());
        map.put("FriendsNum",friends.size());
        map.put("SongListNum",createdsonglist.size()+keepedsonglist.size());
        return "profile/like_song";
    }

    @RequestMapping(value = "/profile/like_songlist", method = RequestMethod.GET)
    public String like_songlist(HttpServletRequest request,Map<String, Object> map) {
        return "profile/like_songlist_list";
    }
}
