package com.example.demo.controller;

import com.example.demo.entity.*;
import com.example.demo.entity.result.ResultEntity;
import com.example.demo.service.AlbumService;
import com.example.demo.service.SingerService;
import com.example.demo.service.SongListService;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.*;

@Component
public class AutoShowUtil {
    @Autowired
    private UserService userService;
    @Autowired
    private SongListService songListService;
    @Autowired
    private SingerService singerService;
    @Autowired
    private AlbumService albumService;

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
     * @param albums
     * @return "albums" "songnum" "singers"
     */
    public Map<String,Object> showAlbum(ArrayList<Album> albums){
        Map<String,Object> map = new HashMap<>();
        ArrayList<Integer> songnum = new ArrayList<>();
        ArrayList<Singer> singers = new ArrayList<>();
        for(Album album:albums){
            Singer singer = singerService.getSingerById(album.getSingerid());
            ArrayList<Song> songs = albumService.getSongsInAlbum(album.getAlbumid());
            singers.add(singer);
            songnum.add(songs.size());
        }
        map.put("albums",albums);
        map.put("songnum",songnum);
        map.put("singers",singers);
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
     * @param users
     * @return "songlistnum" "fansnum" "isfollowed" "users"
     */
    public Map<String, Object> showUser(ArrayList<User> users, String myid){
        ArrayList<Integer> songlistnum = new ArrayList<>();
        ArrayList<Integer> fansnum = new ArrayList<>();
        ArrayList<Boolean> isfollowed = new ArrayList<>();
        Map<String,Object> map = new HashMap<>();
        for(User user:users){
            isfollowed.add((Boolean)userService.isFriendExist(myid,user.getUserid()).getObject());
            ArrayList<User> i = (ArrayList<User>)userService.getFans(user).getObject();
            fansnum.add(i.size());
            songlistnum.add(userService.getCreatedSongList(user.getUserid()).size());
        }
        map.put("songlistnum",songlistnum);
        map.put("fansnum",fansnum);
        map.put("isfollowed",isfollowed);
        map.put("users",users);
        return map;
    }

    public Map<String,Object> showSingerFollow(String id, ArrayList<Singer> follows){
        Map<String,Object> map = new HashMap<>();
        ArrayList<Integer> FollowNum = new ArrayList<>();
        ArrayList<Boolean> isFollow = new ArrayList<>();
        for(Singer singer:follows){
            FollowNum.add(singerService.getFansNum(singer.getSingerid()));
            boolean i = singerService.isUserLikeSinger(singer.getSingerid(),id);
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
    public Map<String,String> changeFollow(String userid,String friendid){
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
        return map;
    }

    public Map<String,String> changeFollowSinger(String userid,String singerid){
        //先判断用户关注这个人没有
        Map<String,String> map = new HashMap<>();
        boolean is = singerService.isUserLikeSinger(singerid,userid);
        //如果关注了就取消关注
        if(is){
            map.put("flag","2");
            is = singerService.unfollowSinger(userid,singerid);
        }
        //没有关注就关注
        else{
            map.put("flag","1");
            is = singerService.followSinger(userid,singerid);
        }
        if(is)
            map.put("succ","1");
        else
            map.put("succ","0");
        return map;
    }




    public String getSongListStyle(ArrayList<Song> songs){
        class Group{
            String index;
            int num;
        }
        class Sort implements Comparator {
            public int compare(Object o1, Object o2) {
                Group s1 = (Group) o1;
                Group s2 = (Group) o2;
                if (s1.num > s2.num)
                    return -1;
                return 1;
            }
        }
        Map<String, Group> resultMap = new LinkedHashMap<>();
        int countIndex = 0;
        for(Song song:songs){
            //如果这个值运算过 不再运算
            if (resultMap.get(song.getSongname()) != null) {
                countIndex++;
                continue;
            }
            Group group = new Group();
            group.index = song.getSongschool();
            for (int i = countIndex; i < songs.size(); i++) {
                if (song.getSongname().equals(group.index)) {
                    group.num++;
                }
            }
            resultMap.put(group.index, group);
            countIndex++;
        }
        ArrayList<Group> total = new ArrayList<>(resultMap.values());
        Collections.sort(total, new Sort());
        int i = 0;
        StringBuilder sb = new StringBuilder();
        for(Group cur:total){
            if(i>2){
                break;
            }
            sb.append(cur.index);
            sb.append(" ");
            i++;
        }
        return sb.toString();
    }

    public ArrayList<String> unionSingers(ArrayList<ArrayList<Singer>> singer){
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
