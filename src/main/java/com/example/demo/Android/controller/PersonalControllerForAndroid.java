package com.example.demo.Android.controller;


import com.example.demo.Android.entity.AndroidUser;
import com.example.demo.controller.AutoShowUtil;
import com.example.demo.entity.*;
import com.example.demo.entity.result.ResultEntity;
import com.example.demo.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@Controller
public class PersonalControllerForAndroid {

    @Autowired
    private UserService userService;
    @Autowired
    private SongListService songListService;
    @Autowired
    private SongService songService;
    @Autowired
    private AutoShowUtil showUtil;
    @Autowired
    private AlbumService albumService;
    @Autowired
    private KeepService keepService;
    @Autowired
    private NewsService newsService;
    @Autowired
    private SingerService singerService;

    @ResponseBody
    @RequestMapping(value = "/Android/getAllMySongList", method = RequestMethod.POST)
    public Map getAllMySongList(@RequestParam("id")String id){
        ResultEntity e =userService.getUserById(id);
        User user = (User) e.getObject();
        ArrayList<SongList> Csonglist = userService.getCreatedSongList(id);
        ArrayList<SongList> Ssonglist = userService.getKeepedSongList(id);
        ArrayList<Integer> Cnum = new ArrayList<>();
        ArrayList<Integer> Snum = new ArrayList<>();
        for(SongList list : Csonglist){
            ArrayList<Song> l = (ArrayList<Song>)songListService.getSongsInSongList(list).getObject();
            Cnum.add(l.size());
        }
        for(SongList list : Ssonglist){
            ArrayList<Song> l = (ArrayList<Song>)songListService.getSongsInSongList(list).getObject();
            Snum.add(l.size());
        }
        Map<String,Object>map = new HashMap<>() ;
        map.put("Csonglist",Csonglist);
        map.put("Ssonglist",Ssonglist);
        map.put("Cnum",Cnum);
        map.put("Snum",Snum);
        map.put("user",user);
        return map;
    }

    @ResponseBody
    @RequestMapping(value = "/Android/createSongList", method = RequestMethod.POST)
    public Map createSongList(@RequestParam("id")String id,@RequestParam("name")String name){
        String msg = songListService.createNewSongList(name,"","0",id);
        Map<String,Object>map = new HashMap<>() ;
        map.put("msg",msg);
        return map;
    }

    @ResponseBody
    @RequestMapping(value = "/Android/deleteSongList", method = RequestMethod.POST)
    public Map deleteSongList(@RequestParam("songlistid") String songlistid){
        songListService.deleteSongList(songlistid);
        Map<String,Object>map = new HashMap<>() ;
        map.put("msg","删除成功了嗷");
        return map;
    }

    @ResponseBody
    @RequestMapping(value = "/Android/deleteSongLists", method = RequestMethod.POST)
    public Map deleteSongList(@RequestParam("songlistid1")String songlistid1,@RequestParam("songlistid2")String songlistid2,@RequestParam("songlistid3")String songlistid3){
        if(!songlistid1.equals("")){
            songListService.deleteSongList(songlistid1);
        }
        if(!songlistid2.equals("")){
            songListService.deleteSongList(songlistid2);
        }
        if(!songlistid3.equals("")){
            songListService.deleteSongList(songlistid3);
        }
        Map<String,Object>map = new HashMap<>() ;
        map.put("msg","删除成功了嗷");
        return map;
    }

    @ResponseBody
    @RequestMapping(value = "/Android/deleteSongInList", method = RequestMethod.POST)
    public Map deleteSongInList(@RequestParam("songlistid")String songlistid,@RequestParam("songid")String songid){
       songListService.deleteSongInList(songid,songlistid);
        Map<String,Object>map = new HashMap<>() ;
        map.put("msg","删除成功了嗷");
        return map;
    }

    @ResponseBody
    @RequestMapping(value = "/Android/changeSongListName", method = RequestMethod.POST)
    public Map changeSongListName(@RequestParam("name")String name,@RequestParam("songlistid") String songlistid){
        String succ = songListService.changeSongListName(name,songlistid);
        Map<String,Object>map = new HashMap<>();
        if(succ.equals("1"))
            map.put("msg","修改名字成功了嗷");
        else
            map.put("msg","修改失败了嗷");
        return map;
    }

    @ResponseBody
    @RequestMapping(value = "/Android/showSongList", method = RequestMethod.POST)
    public Map showSongList(@RequestParam("songlistid") String songlistid,@RequestParam("uid") String uid){
        Map<String,Object> map = new HashMap<>();
        ArrayList<Singer> singers = new ArrayList<>();
        ArrayList<String> albums = new ArrayList<>();
        ArrayList<SongList> songLists = userService.getCreatedSongList(uid);
        SongList a = new SongList();
        a.setSonglistid(songlistid);
        ResultEntity e = songListService.getSongsInSongList(a);
        ArrayList<Song> songs = (ArrayList<Song>)e.getObject();
        for(Song song:songs){
            e = songService.getSingersInSong(song.getSongid());
            ArrayList<Singer> singer = (ArrayList<Singer>)e.getObject();
            Album album = albumService.getAlbumByAlbumId(song.getAlbumid());
            albums.add(album.getAlbumname());
            if(singer.size()==0){
                Singer singer1 = new Singer();
                singer1.setSingername("无");
                singers.add(singer1);
            }
            else
                singers.add(singer.get(0));
        }
        map.put("songLists",songLists);
        map.put("albums",albums);
        map.put("songs",songs);
        map.put("singers",singers);
        return map;
    }

    @ResponseBody
    @RequestMapping(value = "/Android/showFollowedUser", method = RequestMethod.POST)
    public Map showFollowedUser(@RequestParam("userid") String userid){
        User user = new User();
        user.setUserid(userid);
        ResultEntity e = userService.getFriends(user);
        ArrayList<User> friends = (ArrayList<User>)e.getObject();
        ArrayList<AndroidUser> users = new ArrayList<>();
        for(User friend:friends){
            AndroidUser a = new AndroidUser();
            a.setUserid(friend.getUserid());
            a.setUsername(friend.getUsername());
            a.setUserimage(friend.getUserimage());
            a.setIsvip(friend.getIsvip());
            users.add(a);
        }
        Map<String,Object> map = new HashMap<>();
        map.put("FollowedUser",users);
        return map;
    }

    @ResponseBody
    @RequestMapping(value = "/Android/followUser", method = RequestMethod.POST)
    public Map followUser(@RequestParam("userid") String userid,@RequestParam("otherid") String otherid){
        return showUtil.changeFollow(userid,otherid);
    }

    @ResponseBody
    @RequestMapping(value = "/Android/login", method = RequestMethod.POST)
    public Map login(@RequestParam("userid") String userid,@RequestParam("pwd") String pwd){
        User user = new User();
        user.setUserid(userid);
        user.setUserpassword(pwd);
        Map<String,Object> map = new HashMap<>();
        ResultEntity result = userService.SignIn(user);
        if(result.getSuccess()){
            user = (User) result.getObject();
            map.put("user",user);
        }
        map.put("msg",result.getErrorMsg());
        map.put("succ",result.getSuccess());
        return map;
    }

    @ResponseBody
    @RequestMapping(value = "/Android/showRecommend", method = RequestMethod.POST)
    public Map showRecommend(@RequestParam("userid") String userid){
        Map<String,Object> map = new HashMap<>();
        ArrayList<Song> songs = songService.getCommandSong(userid);
        ArrayList<SongList> songLists = userService.getCreatedSongList("100501");
        if(songs.size()>3){
            map.put("songs",songs.subList(0,3));
        }
        else
            map.put("songs",songs);
        for(SongList i:songLists){
            if(i.getSonglistname().equals("我喜欢")){
                songLists.remove(i);
                break;
            }
        }
        map.put("songlists",songLists);
        return map;
    }

    @ResponseBody
    @RequestMapping(value = "/Android/showRecommendSong", method = RequestMethod.POST)
    public Map showRecommendSong(@RequestParam("userid") String userid){
        Map<String,Object> map = new HashMap<>();
        ArrayList<Singer> singers = new ArrayList<>();
        ArrayList<String> albums = new ArrayList<>();
        ArrayList<SongList> songLists = userService.getCreatedSongList(userid);
        ArrayList<Song> songs = songService.getCommandSong(userid);
        for(Song song:songs){
            ResultEntity e = songService.getSingersInSong(song.getSongid());
            ArrayList<Singer> singer = (ArrayList<Singer>)e.getObject();
            Album album = albumService.getAlbumByAlbumId(song.getAlbumid());
            albums.add(album.getAlbumname());
            if(singer.size()==0){
                Singer singer1 = new Singer();
                singer1.setSingername("无");
                singers.add(singer1);
            }
            else
                singers.add(singer.get(0));
        }
        map.put("songLists",songLists);
        map.put("albums",albums);
        map.put("songs",songs);
        map.put("singers",singers);
        return map;
    }

    @ResponseBody
    @RequestMapping(value = "/Android/searchSong", method = RequestMethod.POST)
    public Map searchSong(@RequestParam("name") String name,@RequestParam("uid") String uid){
        Map<String,Object> map = new HashMap<>();
        ArrayList<Singer> singers = new ArrayList<>();
        ArrayList<String> albums = new ArrayList<>();
        ArrayList<SongList> songLists = userService.getCreatedSongList(uid);
        ArrayList<Song> songs = songService.getSongByNamePart(name);
        for(Song song:songs){
            ResultEntity e = songService.getSingersInSong(song.getSongid());
            ArrayList<Singer> singer = (ArrayList<Singer>)e.getObject();
            Album album = albumService.getAlbumByAlbumId(song.getAlbumid());
            albums.add(album.getAlbumname());
            if(singer.size()==0){
                Singer singer1 = new Singer();
                singer1.setSingername("无");
                singers.add(singer1);
            }
            else
                singers.add(singer.get(0));
        }
        map.put("songLists",songLists);
        map.put("albums",albums);
        map.put("songs",songs);
        map.put("singers",singers);
        return map;
    }

    @ResponseBody
    @RequestMapping(value = "/Android/searchSongList", method = RequestMethod.POST)
    public Map searchSongList(@RequestParam("name") String name){
        ArrayList<SongList> songlists = songListService.getSongListByNamePart(name);
        Map<String,Object> map = new HashMap<>();
        ArrayList<Integer>songnum = new ArrayList<>();
        ArrayList<String>users = new ArrayList<>();
        for(SongList list : songlists){
            ArrayList<Song> l = (ArrayList<Song>)songListService.getSongsInSongList(list).getObject();
            songnum.add(l.size());
            User user = (User) userService.getUserById(list.getUserid()).getObject();
            users.add(user.getUsername());
        }
        map.put("songlist",songlists);
        map.put("songnum",songnum);
        map.put("users",users);
        return map;
    }

    @ResponseBody
    @RequestMapping(value = "/Android/searchUser", method = RequestMethod.POST)
    public Map searchUser(@RequestParam("name") String name,@RequestParam("userid") String userid){
        ArrayList<User> users = userService.getUserByNamePart(name);
        Map<String,Object > map = showUtil.showUser(users,userid);
        return map;
    }

    @ResponseBody
    @RequestMapping(value = "/Android/keepSongList", method = RequestMethod.POST)
    public Map keepSongList(@RequestParam("userid") String userid,@RequestParam("songlistid") String songlistid){
        Map<String,Object > map = new HashMap<>();
        String result = keepService.KeepSongList(songlistid,userid);
        if(result.equals("0")){
            keepService.unKeepSongList(songlistid,userid);
            map.put("msg","歌单已取消收藏");
        }
        else
            map.put("msg","收藏成功");
        return map;
    }

    @ResponseBody
    @RequestMapping(value = "/Android/showSong", method = RequestMethod.POST)
    public Map showSong(@RequestParam("songid") String songid){
        Map<String,Object > map = new HashMap<>();
        Song song = songService.getSongById(songid);
        Album album = albumService.getAlbumByAlbumId(song.getAlbumid());
        ResultEntity e  = songService.getSingersInSong(song.getSongid());
        ArrayList<Singer> singers = (ArrayList<Singer>)e.getObject();
        Singer singer = singers.get(0);
        map.put("song",song);
        map.put("album",album.getAlbumname());
        map.put("singer",singer.getSingername());
        return map;
    }

    @ResponseBody
    @RequestMapping(value = "/Android/showNews", method = RequestMethod.POST)
    public Map showNews(@RequestParam("userid") String userid){
        ArrayList<News>news = newsService.getAllNews(userid);
        ArrayList<Boolean>isLike = new ArrayList<>();
        ArrayList<Integer>likeNum = new ArrayList<>();
        ArrayList<Integer>forwardNum = new ArrayList<>();
        ArrayList<Integer>commentNum = new ArrayList<>();
        ArrayList<String>name = new ArrayList<>();
        ArrayList<String>creater = new ArrayList<>();
        ArrayList<String>muser = new ArrayList<>();
        ArrayList<String>forward = new ArrayList<>();
        Map<String,Object > map = new HashMap<>();
        for(News news1:news){
            ResultEntity e = userService.getUserById(news1.getCreaterid());
            User user = (User) e.getObject();
            muser.add(user.getUsername());
            if(news1.getForwarder()!=null){
                e = userService.getUserById(news1.getForwarder());
                user = (User) e.getObject();
                forward.add(user.getUsername());
            }
            isLike.add(newsService.isUserLikeNews(userid,news1.getId()));
            likeNum.add(newsService.getNewsLike(news1.getId()).size());
            forwardNum.add(newsService.getNewsForward(news1.getId()).size());
            commentNum.add(newsService.getNewsComment(news1.getId()).size());
            switch (news1.getType()){
                case "歌单":
                    SongList contain = songListService.getSongListById(news1.getContentid());
                    name.add(contain.getSonglistname());
                    e = userService.getUserById(contain.getUserid());
                    user = (User) e.getObject();
                    creater.add(user.getUsername());
                    break;
                case "单曲":
                    Song song = songService.getSongById(news1.getContentid());
                    name.add(song.getSongname());
                    e  = songService.getSingersInSong(song.getSongid());
                    ArrayList<Singer> singers = (ArrayList<Singer>)e.getObject();
                    creater.add(singers.get(0).getSingername());
                    break;
                case "专辑":
                    break;
            }
        }
        map.put("forward",forward);
        map.put("muser",muser);
        map.put("name",name);
        map.put("creator",creater);
        map.put("news",news);
        map.put("isLike",isLike);
        map.put("likeNum",likeNum);
        map.put("forwardNum",forwardNum);
        map.put("commentNum",commentNum);
        return map;
    }

    @ResponseBody
    @RequestMapping(value = "/Android/likeNews", method = RequestMethod.POST)
    public Map likeNews(@RequestParam("userid") String userid,@RequestParam("newsid") String newsid){
        Map<String,Object > map = new HashMap<>();
        if(newsService.isUserLikeNews(userid,newsid)){
            newsService.dislikeNews(userid,newsid);
            map.put("flag","2");
        }
        else {
            newsService.likeNews(userid,newsid);
            map.put("flag","1");
        }
        return map;
    }

    @ResponseBody
    @RequestMapping(value = "/Android/createNewsComment", method = RequestMethod.POST)
    public Map createNewsComment(@RequestParam("userid") String userid,@RequestParam("newsid") String newsid,@RequestParam("text") String text){
        Map<String,Object > map = new HashMap<>();
        ResultEntity e = userService.getUserById(userid);
        User user = (User) e.getObject();
        map.put("username",user.getUsername());
        map.put("cid",newsService.commentNews(userid,newsid,text));
        map.put("msg","评论成功嗷");
        return map;
    }

    @ResponseBody
    @RequestMapping(value = "/Android/answerComment", method = RequestMethod.POST)
    public Map answerComment(@RequestParam("userid") String userid,@RequestParam("commentid") String commentid,@RequestParam("text") String text){
        Map<String,Object > map = new HashMap<>();
        ResultEntity e = userService.getUserById(userid);
        User user = (User) e.getObject();
        map.put("username",user.getUsername());
        map.put("cid",newsService.answerComment(userid,commentid,text));
        map.put("msg","评论成功嗷");
        return map;
    }

    @ResponseBody
    @RequestMapping(value = "/Android/createNews", method = RequestMethod.POST)
    public Map createNews(@RequestParam("userid") String userid,@RequestParam("type") String type,@RequestParam("contentid") String contentid,@RequestParam("text") String text){
        Map<String,Object > map = new HashMap<>();
        ResultEntity e = userService.getUserById(userid);
        User user = (User) e.getObject();
        map.put("username",user.getUsername());
        map.put("nid",newsService.createNews(userid,type,contentid,text));
        map.put("msg","创建动态成功");
        return map;
    }

    @ResponseBody
    @RequestMapping(value = "/Android/deleteNews", method = RequestMethod.POST)
    public Map deleteNews(@RequestParam("nid") String nid){
        Map<String,Object > map = new HashMap<>();
        newsService.deleteNews(nid);
        map.put("msg","动态删除成功");
        return map;
    }

    @ResponseBody
    @RequestMapping(value = "/Android/deleteComment", method = RequestMethod.POST)
    public Map deleteComment(@RequestParam("cid") String cid){
        Map<String,Object > map = new HashMap<>();
        newsService.deleteNewsComment(cid);
        map.put("msg","评论删除成功");
        return map;
    }

    @ResponseBody
    @RequestMapping(value = "/Android/showNewsDetail", method = RequestMethod.POST)
    public Map showNewsDetail(@RequestParam("nid") String nid,@RequestParam("uid") String uid){
        Map<String,Object > map = new HashMap<>();
        ArrayList<NewsComment>comments = newsService.getNewsComment(nid);
        ArrayList<User> likeUser = newsService.getNewsLike(nid);
        ArrayList<User> forwardUser = newsService.getNewsForward(nid);
        ArrayList<String> commentUser = new ArrayList<>();
        ArrayList<String> parenter = new ArrayList<>();
        ArrayList<Boolean> isLike = new ArrayList<>();
        ArrayList<Integer>likeNum = new ArrayList<>();
        for(NewsComment comment:comments){
            if(comment.getParenter()!=null){
                ResultEntity e = userService.getUserById(comment.getParenter());
                User user = (User) e.getObject();
                parenter.add(user.getUsername());
            }
            ResultEntity e = userService.getUserById(comment.getCommenterid());
            User user = (User) e.getObject();
            commentUser.add(user.getUsername());
            likeNum.add(newsService.getCommentLikeNum(comment.getCommentid()));
            isLike.add(newsService.isUserLikeComment(uid,comment.getCommentid()));
        }
        ArrayList<String>like = new ArrayList<>();
        ArrayList<String>forward = new ArrayList<>();
        for (User user:likeUser){
            like.add(user.getUsername());
        }
        for(User user:forwardUser){
            forward.add(user.getUsername());
        }
        map.put("parenter",parenter);
        map.put("likeNum",likeNum);
        map.put("comments",comments);
        map.put("commentUser",commentUser);
        map.put("like",like);
        map.put("forward",forward);
        map.put("isLike",isLike);
        return map;
    }

    @ResponseBody
    @RequestMapping(value = "/Android/likeComment", method = RequestMethod.POST)
    public Map likeComment(@RequestParam("cid") String cid,@RequestParam("uid") String uid){
        Map<String,Object > map = new HashMap<>();
        if(newsService.isUserLikeComment(uid,cid)){
            newsService.dislikeComment(uid,cid);
            map.put("flag","2");
        }
        else {
            newsService.likeComment(uid,cid);
            map.put("flag","1");
        }
        return map;
    }
    @ResponseBody
    @RequestMapping(value = "/Android/keepSong", method = RequestMethod.POST)
    public Map keepSong(@RequestParam("songid") String songid,@RequestParam("songlistid") String songlistid){
        Map<String,Object > map = new HashMap<>();
        String result = keepService.KeepSong(songid,songlistid);
        if(result.equals("0")){
            map.put("msg","歌曲已存在");
        }
        else
            map.put("msg","已添加到歌单");
        return map;
    }
    @ResponseBody
    @RequestMapping(value = "/Android/forwardNews", method = RequestMethod.POST)
    public Map forwardNews(@RequestParam("nid") String nid,@RequestParam("uid") String uid,@RequestParam("text") String text){
        Map<String,Object > map = new HashMap<>();
        newsService.forwardNews(uid,nid,text);
        map.put("msg","转发成功了嗷");
        return map;
    }

    @ResponseBody
    @RequestMapping(value = "/Android/favoriteSong",method = RequestMethod.POST)
    public Map favoriteSong(@RequestParam("songid")String songid,@RequestParam("userid")String userid){
        Map<String,Object > map = new HashMap<>();
        SongList favorite = userService.getFavoritelist(userid);
        if(favorite == null){
            map.put("msg","用户默认歌单不存在");
            return map;
        }
        String result = keepService.KeepSong(songid,favorite.getSonglistid());
        if(result.equals("0")){
            keepService.unKeepSong(songid,favorite.getSonglistid());
            map.put("msg","取消喜欢成功");
            return map;
        }
        map.put("msg","喜欢成功");
        return map;
    }

    @ResponseBody
    @RequestMapping(value = "/Android/isFavorite",method = RequestMethod.POST)
    public Map isFavorite(@RequestParam("songid")String songid,@RequestParam("userid")String userid){
        Map<String,Object > map = new HashMap<>();
        SongList favorite = userService.getFavoritelist(userid);
        ResultEntity e = songListService.getSongsInSongList(favorite);
        ArrayList<Song>songs = (ArrayList<Song>)e.getObject();
        for(Song song:songs){
            if(song.getSongid().equals(songid)){
                map.put("succ",true);
                return map;
            }
        }
        map.put("succ",false);
        return map;
    }

    @ResponseBody
    @RequestMapping(value = "/Android/isKeeped",method = RequestMethod.POST)
    public Map isKeeped(@RequestParam("songlistid")String songlistid,@RequestParam("userid")String userid){
        Map<String,Object > map = new HashMap<>();
        ArrayList<SongList> songLists = userService.getKeepedSongList(userid);
        for(SongList songList:songLists){
            if(songList.getSonglistid().equals(songlistid)){
                map.put("succ",true);
                return map;
            }
        }
        map.put("succ",false);
        return map;
    }

    @ResponseBody
    @RequestMapping(value = "/Android/songListDetail",method = RequestMethod.POST)
    public Map songListDetail(@RequestParam("songlistid")String songlistid,@RequestParam("userid")String userid){
        Map<String,Object > map = new HashMap<>();
        SongList songList = songListService.getSongListById(songlistid);
        map.put("songlist",songList);
        return map;
    }

}
