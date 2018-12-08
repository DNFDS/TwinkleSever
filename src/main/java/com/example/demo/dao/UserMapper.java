package com.example.demo.dao;

import com.example.demo.entity.User;
import com.example.demo.entity.Example.UserExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    int countByExample(UserExample example);

    int deleteByExample(UserExample example);

    int deleteByPrimaryKey(String userid);

    int insert(User record);

    int insertSelective(User record);

    List<User> selectByExample(UserExample example);

    User selectByPrimaryKey(String userid);

    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

    int updateByExample(@Param("record") User record, @Param("example") UserExample example);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    /**
     * @param Map
     * @IN :"userid"
     * @OUT: "result"> 1:true 0:false
     */
    void isUserExit(Map<String, Object> Map);

    /**
     * @param Map
     * @IN :"username" "userpassword" "userimage" "usersex"
     * @OUT: "result"> userid:true 0:false
     */
    void addUser(Map<String, Object> Map);

    /**
     * @param Map
     * @IN :"userid"
     * @OUT: "result"> ArrayList<User>
     */
    void getUserById(Map<String, Object> Map);

    /**
     * @param Map
     * @IN :"userid"
     * @OUT: "result"> ArrayList<User>
     */
    void getFansByUserId(Map<String, Object>Map);

    /**
     * @param Map
     * @IN :"userid"
     * @OUT: "result"> ArrayList<User>
     */
    void getFriendsByUserId(Map<String, Object>Map);
}