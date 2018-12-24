package com.example.demo.dao;

import java.util.Map;

public interface BanMapper {

    /**
     * @param Map
     * @IN :"adminid"
     * @OUT: "bannedusers"> ArrayList<Ban>
     */
    void getBannedUser(Map<String, Object> Map);

    /**
     * @param Map
     * @IN :"userid","adminid","banreason"
     * @OUT: "succ"> String
     */
    void banUser(Map<String, Object> Map);

    /**
     * @param Map
     * @IN :"userid"
     * @OUT: "succ"> String
     */
    void unbanUser(Map<String, Object> Map);

    /**
     * @param Map
     * @IN :"userid"
     * @OUT: "baninfo"> Ban
     */
    void getBannedInfo(Map<String, Object> Map);

    /**
     * @param Map
     * @IN :"userid"
     * @OUT: "banreason"> String
     */
    void getBannedReason(Map<String, Object> Map);

    /**
     * @param Map
     * @IN :"username"
     * @OUT: "banneduser"> ArrayList<User>
     */
    void getAllBannedUser(Map<String, Object> Map);

    /**
     * @param Map
     * @IN :"username"
     * @OUT: "unbanneduser"> ArrayList<User>
     */
    void getAllUnbannedUser(Map<String, Object> Map);
}