package com.example.demo.controller;

import com.alibaba.fastjson.JSON;
import com.example.demo.entity.Singer;
import com.example.demo.entity.Song;
import com.example.demo.entity.SongList;
import com.example.demo.entity.User;
import com.example.demo.entity.result.ResultEntity;
import com.example.demo.service.SongListService;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@Component
public class AutoShowUtil {
    @Autowired
    private UserService userService;
    @Autowired
    private SongListService songListService;

    /**
     * @param :Arraylist<song> songs
     * @out :"songs" "singers" "singername" "albums"
     */
    public Map<String,Object> showSong(ArrayList<Song> songs){
        Map<String,Object> map = new HashMap<>();
        map.put("songs",songs);
        ResultEntity e;
        e = songListService.getSingerInSongList(songs);
        map.put("singers",e.getObject());
        ArrayList<String>singername = unionSingers((ArrayList<ArrayList<Singer>>)e.getObject());
        map.put("singername",singername);
        e = songListService.getAlbumsInSongList(songs);
        map.put("albums",e.getObject());
        return map;
    }
    /**
     * @param :Arraylist<song> songs
     * @out : "songlist""songnum" "savenum" "username"
     */
    public Map<String,Object> showSongList(ArrayList<SongList> songLists){
        Map<String,Object> map = new HashMap<>();
        ArrayList<Integer>songnum = new ArrayList<>();
        ArrayList<Integer>savenum = new ArrayList<>();
        ArrayList<String>username = new ArrayList<>();
        map.put("songlist",songLists);
        for(SongList list : songLists){
            ArrayList<Song> l = (ArrayList<Song>)songListService.getSongsInSongList(list).getObject();
            songnum.add(l.size());
            savenum.add((int)songListService.getSongListSavedNum(list).getObject());
            User user = (User) userService.getUserById(list.getUserid()).getObject();
            username.add(user.getUsername());
        }
        map.put("songnum",songnum);
        map.put("savenum",savenum);
        map.put("username",username);
        return map;
    }

    /**
     *
     * @param id
     * @param follows
     * @return "Follows"关注的用户 "FollowNum"关注的人数 "isFollow"是否关注
     */
    public Map<String,Object> showFollow(String id, ArrayList<User> follows){
        Map<String,Object> map = new HashMap<>();
        ArrayList<Integer> FollowNum = new ArrayList<>();
        ArrayList<Boolean> isFollow = new ArrayList<>();
        for(User user:follows){
            ArrayList<User> users = (ArrayList<User>)userService.getFans(user).getObject();
            FollowNum.add(users.size());
            boolean i = (boolean)userService.isFriendExist(id,user.getUserid()).getObject();
            isFollow.add(i);
        }
        map.put("Follows",follows);
        map.put("FollowNum",FollowNum);
        map.put("isFollow",isFollow);
        return map;
    }

    /**
     *
     * @param userid
     * @param friendid
     * @return "succ" "flag"
     */
    public String changeFollow(String userid,String friendid){
        //先判断用户关注这个人没有
        Map<String,String> map = new HashMap<>();
        ResultEntity e = userService.isFriendExist(userid,friendid);
        boolean is = (boolean)e.getObject();
        //如果关注了就取消关注
        if(is){
            map.put("flag","2");
            e = userService.unFollowUser(userid,friendid);
        }
        //没有关注就关注
        else{
            map.put("flag","1");
            e = userService.followUser(userid,friendid);
        }
        if((boolean)e.getObject())
            map.put("succ","1");
        else
            map.put("succ","0");
        return JSON.toJSONString(map);
    }

    private ArrayList<String> unionSingers(ArrayList<ArrayList<Singer>> singer){
        ArrayList<String>singername = new ArrayList<>(singer.size());
        for(ArrayList<Singer> arr:singer){
            StringBuilder sb = new StringBuilder();
            for(Singer i:arr){
                sb.append(i.getSingername());
                sb.append(", ");
            }
            singername.add(sb.toString());
        }
        return singername;
    }
}
