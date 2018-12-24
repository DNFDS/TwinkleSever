package com.example.demo.controller;


import com.example.demo.entity.Singer;
import com.example.demo.entity.Song;
import com.example.demo.entity.SongList;
import com.example.demo.entity.User;
import com.example.demo.entity.result.ResultEntity;
import com.example.demo.service.SingerService;
import com.example.demo.service.SongListService;
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
    private SongListService songListService;
    @Autowired
    private SongService songService;
    @Autowired
    private AutoShowUtil showUtil;
    @Autowired
    private SingerService singerService;

    @RequestMapping(value = "/profile/like_song", method = RequestMethod.GET)
    public String mainPage(HttpServletRequest request,Map<String, Object> map) {
        ResultEntity e;
        User user = (User) request.getSession(false).getAttribute("visted");
        e = userService.getFans(user);
        ArrayList<User> fans = (ArrayList<User>)e.getObject();
        e= userService.getFriends(user);
        ArrayList<User> friends = (ArrayList<User>)e.getObject();
        ArrayList<Singer> singers = singerService.getSingerUserLike(user.getUserid());
        map.put("FansNum",fans.size());
        map.put("FriendsNum",friends.size()+singers.size());
        return "profile/like_song";
    }

    @ResponseBody
    @RequestMapping(value = "/profile/showFans", method = RequestMethod.GET)
    public ModelAndView showFans(HttpServletRequest request, HttpServletResponse response){
        User user = (User) request.getSession(false).getAttribute("visted");
        User my =(User) request.getSession(false).getAttribute("user");
        Map<String,Object>map ;
        ResultEntity e = userService.getFans(user);
        ArrayList<User> Follows = (ArrayList<User>)e.getObject();
        //"Follows"关注的用户 "FollowNum"关注的人数 "isFollow"是否关注
        map = showUtil.showFollow(my.getUserid(),Follows);
        return new ModelAndView("/temp/fans_main",map);
    }

    @ResponseBody
    @RequestMapping(value = "/profile/showMyBought", method = RequestMethod.GET)
    public ModelAndView showMyBought(HttpServletRequest request, HttpServletResponse response){
        User user = (User) request.getSession(false).getAttribute("visted");
        ResultEntity e = songService.getBoughtSongByUserId(user.getUserid());
        ArrayList<SongList>boughtSongList = (ArrayList<SongList>)e.getObject();
        Map<String,Object>map = showUtil.showSongList(boughtSongList);
        return new ModelAndView("/temp/mybought_main",map);
    }

    @ResponseBody
    @RequestMapping(value = "/profile/showFollowSinger", method = RequestMethod.GET)
    public ModelAndView showFollowSinger(HttpServletRequest request, HttpServletResponse response){
        User user = (User) request.getSession(false).getAttribute("visted");
        User my =(User) request.getSession(false).getAttribute("user");
        ArrayList<Singer> Follows = (ArrayList<Singer>)singerService.getSingerUserLike(user.getUserid());
        Map<String,Object>map  = showUtil.showSingerFollow(my.getUserid(),Follows);
        return new ModelAndView("/temp/follows/follow_singer",map);
    }

    @ResponseBody
    @RequestMapping(value = "/profile/showFollowUser", method = RequestMethod.GET)
    public ModelAndView showFollowUser(HttpServletRequest request, HttpServletResponse response){
        User user = (User) request.getSession(false).getAttribute("visted");
        User my =(User) request.getSession(false).getAttribute("user");
        String flag = request.getParameter("flag");
        ResultEntity e = userService.getFriends(user);
        ArrayList<User> Follows = (ArrayList<User>)e.getObject();
        //"Follows"关注的用户 "FollowNum"关注的人数 "isFollow"是否关注
        Map<String,Object> map = showUtil.showFollow(my.getUserid(),Follows);
        if(flag.equals("2"))
            return new ModelAndView("/temp/follows/follow_user",map);
        return new ModelAndView("/temp/follow_main",map);
    }

    @ResponseBody
    @RequestMapping(value = "/profile/changeFollow", method = RequestMethod.GET)
    public Map<String, String> changeFollow(HttpServletRequest request){
        User my =(User) request.getSession(false).getAttribute("user");
        String id = request.getParameter("id");
        return showUtil.changeFollow(my.getUserid(),id);
    }

    @ResponseBody
    @RequestMapping(value = "/profile/changeFollowSinger", method = RequestMethod.GET)
    public Map<String, String> changeFollowSinger(HttpServletRequest request){
        User my =(User) request.getSession(false).getAttribute("user");
        String id = request.getParameter("id");
        return showUtil.changeFollowSinger(my.getUserid(),id);
    }

    @ResponseBody
    @RequestMapping(value = "/profile/like_song_song_typeList", method = RequestMethod.GET)
    public ModelAndView showSongsInList(HttpServletRequest request, HttpServletResponse response){
        String id = request.getParameter("id");
        String flag = request.getParameter("flag");
        ResultEntity e;
        Map<String,Object>map = new HashMap<>();
        User user = new User();
        user.setUserid(id);
        e = userService.getSongLists(user);
        Map<String,Object>e_map = (Map<String, Object>) e.getObject();
        ArrayList<SongList> createdsonglist = (ArrayList<SongList>)e_map.get("createdsonglist");
        getFavoriteList(map,createdsonglist);
        ArrayList<Song> songs = (ArrayList<Song>) map.get("songs");
        map.putAll(showUtil.showSong(songs));
        if(flag.equals("2"))
            return new ModelAndView("/temp/mylike/song_list_details",map);
        return new ModelAndView("/temp/mylike_main",map);
    }

    @ResponseBody
    @RequestMapping(value = "/profile/like_song_songlist_typeList", method = RequestMethod.GET)
    public ModelAndView showKeepedSongList(HttpServletRequest request, HttpServletResponse response){
        User user = (User) request.getSession(false).getAttribute("visted");
        String flag = request.getParameter("flag");
        //如果请求的form页面，就直接返回
        //list页面，要额外添加歌单的收藏数和曲目数
        ArrayList<SongList>keepedSongList = userService.getKeepedSongList(user.getUserid());
        //得到所有歌单的曲目数和收藏数创建人  songnum  savenum username
        Map<String,Object>map = showUtil.showSongList(  keepedSongList);
        if(flag.equals("1"))
            return new ModelAndView("/temp/mylike/songlist_details",map);
        if(flag.equals("2"))
            return new ModelAndView("/temp/mylike/songlist_form_details",map);
        return new ModelAndView("/temp/mylike/songlist_list_details",map);
    }

    @ResponseBody
    @RequestMapping(value = "/profile/showCreatedSongList", method = RequestMethod.GET)
    public ModelAndView showCreatedSongList(HttpServletRequest request, HttpServletResponse response){
        User user = (User) request.getSession(false).getAttribute("visted");
        //如果请求的form页面，就直接返回
        //list页面，要额外添加歌单的收藏数和曲目数
        ArrayList<SongList>CreatedSongList = userService.getCreatedSongList(user.getUserid());
        //得到所有歌单的曲目数和收藏数创建人  songnum  savenum username
        Map<String,Object>map = showUtil.showSongList(CreatedSongList);
        return new ModelAndView("/temp/created_main",map);
    }

    @ResponseBody
    @RequestMapping(value = "/profile/showAlbum", method = RequestMethod.GET)
    public ModelAndView showAlbum(HttpServletRequest request, HttpServletResponse response){
        String flag = request.getParameter("flag");
        if(flag.equals("1"))
            return new ModelAndView("/temp/mylike/album_details");
        if(flag.equals("2"))
            return new ModelAndView("/temp/mylike/album_form_details");
        return new ModelAndView("/temp/mylike/album_list_details");
    }

    private void getFavoriteList(Map<String,Object> map,ArrayList<SongList> createdsonglist){
        ResultEntity e;
        for(SongList i : createdsonglist){
            if(i.getSonglistname().equals("我喜欢")){
                map.put("favoritesonglist",i);
                e = songListService.getSongsInSongList(i);
                map.put("songs",e.getObject());
                break;
            }
        }
    }

}
