package com.example.demo.dao;

import com.example.demo.entity.Ban;
import com.example.demo.entity.Example.BanExample;
import com.example.demo.entity.BanKey;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface BanMapper {
    int countByExample(BanExample example);

    int deleteByExample(BanExample example);

    int deleteByPrimaryKey(BanKey key);

    int insert(Ban record);

    int insertSelective(Ban record);

    List<Ban> selectByExample(BanExample example);

    Ban selectByPrimaryKey(BanKey key);

    int updateByExampleSelective(@Param("record") Ban record, @Param("example") BanExample example);

    int updateByExample(@Param("record") Ban record, @Param("example") BanExample example);

    int updateByPrimaryKeySelective(Ban record);

    int updateByPrimaryKey(Ban record);

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