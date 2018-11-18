package com.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DBconnection {
    static{
            try {
                Class.forName("oracle.jdbc.driver.OracleDriver");
                System.out.println("驱动加载成功");
            }
            catch(ClassNotFoundException e3) {
                System.out.println("MySQL驱动类找不到");
            }
    }
    public static Connection getConnection(){
        Connection conn=null;
        try{
            System.out.println("开始尝试连接数据库");
            String url = "jdbc:oracle:thin:@localhost:1521:MusicDB";//Oracle的默认数据库名
            String user = "system";// 系统默认的用户名
            String password = "123456";// 安装时设置的密码
            conn=DriverManager.getConnection(url,user,password);
            System.out.println("数据库连接成功");
            return conn;
        }
        catch (Exception e){
            System.out.println("连接失败");
            return null;
        }
    }

    public static void CloseConnection(ResultSet res,PreparedStatement statement,Connection conn){
        if(res!=null){
            try{
                res.close();
            }catch (Exception e){
                e.printStackTrace();
            }finally {
                res=null;
            }
            if(statement!=null){
                try{
                    statement.close();
                }catch (Exception e){
                    e.printStackTrace();
                }finally {
                    statement=null;
                }
                if(conn!=null){
                    try{
                        conn.close();
                    }catch(Exception e){
                        e.printStackTrace();
                    }finally {
                        conn=null;
                    }
                }
            }
        }
    }
}
