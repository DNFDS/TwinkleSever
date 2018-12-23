package com.example.demo.service.Impl;

import com.example.demo.dao.AlbumMapper;
import com.example.demo.dao.SongListMapper;
import com.example.demo.dao.UserMapper;
import com.example.demo.entity.SongList;
import com.example.demo.entity.User;
import com.example.demo.entity.result.ResultEntity;
import com.example.demo.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@Service
public class UserImpl implements UserService {
    @Resource
    private UserMapper userMapper;
    @Resource
    private SongListMapper songListMapper;
    @Resource
    private AlbumMapper albumMapper;

    @Override
    public ResultEntity SignIn(User user) {
        Map<String,Object>map = new HashMap<>();
        map.put("userid",user.getUserid());
        map.put("userpassword",user.getUserpassword());
        userMapper.isUserExist(map);
        int example = Integer.parseInt(map.get("result").toString());
        if(example == 0){
            return new ResultEntity(false,"User Not Exist or PassWord not correct",null);
        }
        if(example == 1){
            //map.replace("result",user);
            userMapper.getUserById(map);
            ArrayList<User>users = (ArrayList<User>)map.get("result");
            return new ResultEntity(true,"",users.get(0));
        }
        //session*/
        return new ResultEntity(false,this.getClass().toString()+"error",example);
    }

    @Override
    public ResultEntity Register(User user){
        Map<String,Object> map = new HashMap<>();
        map.put("username",user.getUsername());
        map.put("userpassword",user.getUserpassword());
        map.put("userimage",user.getUserimage());
        map.put("usersex",user.getUsersex());
        userMapper.addUser(map);
        int result = Integer.parseInt((String)map.get("result"));
        if(result == 0){
            return new ResultEntity(false,"DB_error",null);
        }
        else{
            map.put("userid",result);
            userMapper.getUserById(map);
            ArrayList<User>users = (ArrayList<User>)map.get("result");
            return new ResultEntity(true,"",users.get(0));
        }
    }
    @Override
    public ResultEntity getFans(User user){
        Map<String,Object>map = new HashMap<>();
        map.put("userid",user.getUserid());
        userMapper.getFansByUserId(map);
        ArrayList<User>fans = (ArrayList<User>)map.get("result");
        return new ResultEntity(true,"",fans);
    }
    @Override
    public ResultEntity getFriends(User user){
        Map<String,Object>map = new HashMap<>();
        map.put("userid",user.getUserid());
        userMapper.getFriendsByUserId(map);
        ArrayList<User>friends = (ArrayList<User>)map.get("result");
        return new ResultEntity(true,"",friends);
    }
    @Override
    public ResultEntity getFollowSingers(User user){
        return new ResultEntity(true,"","");
    }
    @Override
    public ResultEntity getSongLists(User user){
        Map<String,Object>map = new HashMap<>();
        map.put("userid",user.getUserid());
        songListMapper.getSongListCreatedByUserId(map);//"createdsonglist"
        songListMapper.getSongListKeepedByUserId(map);//"keepedsonglist"
        return new ResultEntity(true,"",map);
    }
    @Override
    public ArrayList<SongList> getCreatedSongList(String userid){
        Map<String,Object>map = new HashMap<>();
        map.put("userid",userid);
        songListMapper.getSongListCreatedByUserId(map);//"keepedsonglist"
        return  (ArrayList<SongList>)map.get("createdsonglist");
    }
    @Override
    public ArrayList<SongList> getKeepedSongList(String userid){
        Map<String,Object>map = new HashMap<>();
        map.put("userid",userid);
        songListMapper.getSongListKeepedByUserId(map);//"keepedsonglist"
        return  (ArrayList<SongList>)map.get("keepedsonglist");
    }

    @Override
    public ResultEntity getUserById(String id){
        Map<String,Object> map = new HashMap<>();
        User user;
        map.put("userid",id);
        userMapper.getUserById(map);
        ArrayList<User> users = (ArrayList<User>)map.get("result");
        if(users.size() == 0){
            user = new User();
            return new ResultEntity(false,"",null);
        }
        else
        user = users.get(0);
        return new ResultEntity(true,"",user);
    }

    @Override
    public ResultEntity followUser(String userid, String friendid){
        Map<String,Object>map = new HashMap<>();
        boolean result;
        map.put("userid",userid);
        map.put("friendid",friendid);
        userMapper.addFriend(map);
        String succ = (String) map.get("succ");
        if(succ.equals("1"))
            result = true;
        else
            result = false;
        return new ResultEntity(true,"",result);
    }

    @Override
    public ResultEntity unFollowUser(String userid, String friendid){
        Map<String,Object>map = new HashMap<>();
        boolean result;
        map.put("userid",userid);
        map.put("friendid",friendid);
        userMapper.deleteFriend(map);
        String succ = (String) map.get("succ");
        if(succ.equals("1"))
            result = true;
        else
            result = false;
        return new ResultEntity(true,"",result);
    }

    @Override
    public ResultEntity isFriendExist(String userid,String friendid){
        Map<String,Object>map = new HashMap<>();
        map.put("userid",userid);
        map.put("friendid",friendid);
        userMapper.isFriendExist(map);
        String is = map.get("result").toString();
        if(is.equals("1"))
            return new ResultEntity(true,"",true);
        return new ResultEntity(true,"",false);
    }

    public SongList getFavoritelist(String userid){
        Map<String,Object>map = new HashMap<>();
        map.put("userid",userid);
        songListMapper.getSongListCreatedByUserId(map);
        ArrayList<SongList> songLists =  (ArrayList<SongList>) map.get("createdsonglist");
        for(SongList songList:songLists){
            if(songList.getSonglistname().equals("我喜欢"))
                return songList;
        }
        return null;
    }

    public ArrayList<User> getUserByNamePart(String username){
        Map<String,Object>map = new HashMap<>();
        map.put("username",username);
        userMapper.getUserByNamePart(map);
        return (ArrayList<User>)map.get("users");
    }

}
