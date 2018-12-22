package com.example.demo.controller;


import com.example.demo.entity.*;
import com.example.demo.entity.result.ResultEntity;
import com.example.demo.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@Controller
public class DetailController {

    @Autowired
    private UserService userService;
    @Autowired
    private SongService songService;
    @Autowired
    private AlbumService albumService;
    @Autowired
    private SongListService songListService;
    @Autowired
    private AutoShowUtil showUtil;
    @Autowired
    private SingerService singerService;

    @RequestMapping(value ="/Song",method = RequestMethod.GET)
    public String songDetail(@RequestParam("songid") String songid, Map<String, Object> map,HttpServletRequest request){
        Song song = songService.getSongById(songid);
        ResultEntity e = songService.getSingersInSong(songid);
        ArrayList<Singer> singers = (ArrayList<Singer>)e.getObject();
        ArrayList<comments> comments = songService.getCommentsInSong(songid);
        ArrayList<User> users = new ArrayList<>();
        for(com.example.demo.entity.comments comment:comments){
            e = userService.getUserById(comment.getUserid());
            users.add((User) e.getObject());
        }
        Album album = albumService.getAlbumByAlbumId(song.getAlbumid());
        map.put("song",song);
        map.put("singers",singers);
        map.put("album",album);
        map.put("comments",comments);
        map.put("commentsUser",users);
        return "Details/song_detail";
    }
    @RequestMapping(value ="/SongList",method = RequestMethod.GET)
    public String songListDetail(@RequestParam("songlistid") String songlistid, Map<String, Object> map,HttpServletRequest request){
        SongList songList = songListService.getSongListById(songlistid);
        ResultEntity e = songListService.getSongsInSongList(songList);
        ArrayList<Song>songs = (ArrayList<Song>)e.getObject();
        String style = showUtil.getSongListStyle(songs);
        map.putAll(showUtil.showSong(songs));
        e = songListService.getSongListSavedNum(songList);
        int num = (int)e.getObject();
        e = userService.getUserById(songList.getUserid());
        User creater = (User)e.getObject();
        map.put("creater",creater);
        map.put("savenum",num);
        map.put("style",style);
        map.put("songlist",songList);
        return "Details/songlist_detail";
        //"songs" "singers" "singername" "albums"
    }
    @RequestMapping(value ="/Singer",method = RequestMethod.GET)
    public String singerDetail(@RequestParam("singerid") String singerid, Map<String, Object> map,HttpServletRequest request){
        User user = (User) request.getSession(false).getAttribute("user");
        Singer singer = singerService.getSingerById(singerid);
        ArrayList<Song> songs = singerService.getSingerSong(singerid);
        if(songs.size()>5){
            map.put("songs",songs.subList(0,4));
        }else {
            map.put("songs",songs);
        }
        ArrayList<Album> albums = singerService.getSingerAlbum(singerid);
        Boolean isfollow = singerService.isUserLikeSinger(singerid,user.getUserid());
        map.put("isfollow",isfollow);
        int follownum = singerService.getFansNum(singerid);
        ResultEntity e = songListService.getSingerInSongList(songs);
        ArrayList<ArrayList<Singer>> singers = (ArrayList<ArrayList<Singer>>)e.getObject();
        map.put("singers",e.getObject());
        map.put("albums",albums);
        map.put("singer",singer);
        map.put("follownum",follownum);
        return "/Details/singer_detail";
       //"songs" "albums" "follownum"
    }
    @RequestMapping(value ="/Album",method = RequestMethod.GET)
    public String albumDetail(@RequestParam("albumid") String albumid, Map<String, Object> map,HttpServletRequest request){
        Album album = albumService.getAlbumByAlbumId(albumid);
        ArrayList<Song> songs = albumService.getSongsInAlbum(albumid);
        ResultEntity e;
        e = songListService.getSingerInSongList(songs);
        map.put("singers",e.getObject());
        ArrayList<String>singername = showUtil.unionSingers((ArrayList<ArrayList<Singer>>)e.getObject());
        map.put("singername",singername);
        Singer author = singerService.getSingerById(album.getSingerid());
        String style = showUtil.getSongListStyle(songs);
        map.put("style",style);
        map.put("author",author);
        map.put("songs",songs);
        map.put("album",album);
        return "/Details/album_detail";
    }
    @ResponseBody
    @RequestMapping(value ="/Comment",method = RequestMethod.POST)
    public String Comment(HttpServletRequest request, @RequestParam("words") String words,@RequestParam("songid") String songid){
        User user = (User) request.getSession(false).getAttribute("user");
        boolean succ = songService.commentSong(words,songid,user.getUserid());
        if(succ)
            return "评论成功";
        else
            return "评论失败";
    }
    @ResponseBody
    @RequestMapping(value = "/getMySongList", method = RequestMethod.GET)
    public ModelAndView getMySongList(HttpServletRequest request, @RequestParam("songid") String songid){
        User user = (User) request.getSession(false).getAttribute("user");
        ResultEntity e = userService.getSongLists(user);
        Map<String,Object>e_map = (Map<String, Object>) e.getObject();
        ArrayList<SongList> createdsonglist = (ArrayList<SongList>)e_map.get("createdsonglist");
        Map<String,Object>map = new HashMap<>();
        map.put("songlists",createdsonglist);
        map.put("toAdd",songid);
        return new ModelAndView("/temp/songListChooser",map);
    }

}
