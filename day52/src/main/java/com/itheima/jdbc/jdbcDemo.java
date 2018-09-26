package com.itheima.jdbc;

import java.sql.*;

public class jdbcDemo {
    public static void main(String[] args) {

        Connection con=null;
        PreparedStatement psmt=null;
        ResultSet rs=null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
             con= DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/bb","root","root");
            String sql="select*from cst_customer";

           psmt=con.prepareStatement(sql);

            rs=psmt.executeQuery();

            while(rs.next()){
                System.out.println("客户id:"+rs.getInt("cust_id")+",客户名称："+rs.getString("cust_name"));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                if(rs!=null)rs.close();
                if(psmt!=null)psmt.close();
                if(con!=null)con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
