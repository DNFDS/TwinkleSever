package com.example.demo.dao;

import java.util.Map;

public interface UserMapper {

    /**
     * @param Map
     * @IN :"userid"
     * @OUT: "result"> 1:true 0:false
     */
    void isUserExist(Map<String, Object> Map);

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
    /**
     * @param Map
     * @IN :"userid" "friendid"
     * @OUT: "succ"> 1:true 0:false
     */
    void addFriend(Map<String, Object> Map);

    /**
     * @param Map
     * @IN :"userid" "friendid"
     * @OUT: "succ"> 1:true 0:false
     */
    void deleteFriend(Map<String, Object> Map);

    /**
     * @param Map
     * @IN :"userid" "friendid"
     * @OUT: "result"> String
     */
    void isFriendExist(Map<String, Object> Map);
}