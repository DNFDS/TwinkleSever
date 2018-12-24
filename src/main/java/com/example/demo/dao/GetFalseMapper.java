package com.example.demo.dao;

import java.util.Map;

public interface GetFalseMapper {

    /**
     * @param Map
     * @IN :"userid","songid","falsetext"
     * @OUT: "succ"> String
     */
    String addFalse(Map<String, Object> Map);

    /**
     * @param Map
     * @IN :"userid","songid","falsetime"
     * @OUT: "succ"> String
     */
    String deleteFalse(Map<String, Object> Map);

    /**
     * @param Map
     * @IN :"userid","songid","adminid","falsetime"
     * @OUT: "succ"> String
     */
    String handleFalse(Map<String, Object> Map);

    /**
     * @param Map
     * @OUT: "falses"> ArrayList<GetFalse>
     */
    void getAllFalse(Map<String, Object> Map);

    /**
     * @param Map
     * @IN:"songid"
     * @OUT: "falses"> ArrayList<GetFalse>
     */
    void getFalse(Map<String, Object> Map);
}