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
     * @IN :"userid"
     * @OUT: "banddetail"> ArrayList<Ban>
     */
    void isUserBanned(Map<String, Object> Map);

    /**
     * @param Map
     * @IN :"username" "userpassword" "userimage" "usersex"
     * @OUT: "result"> 1:true 0:false
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
     * @IN :"username"
     * @OUT: "users"> ArrayList<User>
     */
    void getUserByNamePart(Map<String, Object> Map);

    /**
     * @param Map
     * @IN :"username"
     * @OUT: "users"> ArrayList<User>
     */
    void getUserByName(Map<String, Object> Map);

    /**
     * @param Map
     * @IN :
     * @OUT: "users"> ArrayList<User>
     */
    void getAllUser(Map<String, Object> Map);

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

    /**
     * @param Map
     * @IN :"userid" "pwd"
     * @OUT: "succ"> 1:true 0:false
     */
    void updateUserPwd(Map<String, Object> Map);

    /**
     * @param Map
     * @IN :"userid" "userimage"
     * @OUT: "succ"> 1:true 0:false
     */
    void updateUserImg(Map<String, Object> Map);

    /**
     * @param Map
     * @IN :"userid" "username"
     * @OUT: "succ"> 1:true 0:false
     */
    void updateUserName(Map<String, Object> Map);
}