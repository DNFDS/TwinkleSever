package com.DAO;

import com.model.Admin;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class AdminDAO {
    public static void init(){
        Connection conn=DBconnection.getConnection();
        CallableStatement cs;
        try {
            cs = conn.prepareCall("{call init()}");
            cs.execute();
            cs.close();
            conn.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public static boolean AddAdmin(Admin admin){
        if(IsAdminExit(admin.getId(), admin.getName())){
            return false;
        }
        Connection conn=DBconnection.getConnection();
        CallableStatement cs;
        try{
            cs = conn.prepareCall("{call new_Admin(?,?,?,?)}");
            cs.setObject(1, admin.getId());
            cs.setObject(2, admin.getName());
            cs.setObject(3, admin.getPwd());
            cs.setObject(4, admin.getImage());
            cs.execute();
            cs.close();
            conn.close();
            return true;
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }
    public static boolean IsAdminExit(String id,String Password){
        Connection conn=DBconnection.getConnection();
        PreparedStatement statement=null;
        ResultSet res=null;
        int count=0;
        try{
            String sql="select count(*) from Admin where ADMINID=? and ADMINPASSWORD=?";
            statement=conn.prepareStatement(sql);
            statement.setString(1,id);
            statement.setString(2,Password);
            res=statement.executeQuery();
            while(res.next()){
               count= res.getInt(1);
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            DBconnection.CloseConnection(res,statement,conn);
        }
        if(count==0){
            return false;
        }else{
            return true;
        }
    }

}
