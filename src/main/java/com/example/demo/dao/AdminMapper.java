package com.example.demo.dao;

import java.util.Map;

public interface AdminMapper {

    /**
     * @param Map
     * @IN :"adminid","adminpassword"
     * @OUT: "result"> String
     */
    String isAdminExist(Map<String,Object> Map);

    /**
     * @param Map
     * @IN :"adminid"
     * @OUT: "admin"> Admin
     */
    String getAdminById(Map<String,Object> Map);
}