/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author ASUS
 */
public class DBUtils {
    public static Connection makeConnection() throws Exception{
        
        String connectionUrl="jdbc:sqlserver://localhost:1433;"
                + "databaseName=TimPhongTro;User=sa;Password=123456";
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        Connection con = DriverManager.getConnection(connectionUrl);
                return con;
    }
    public static void main(String[] args) {
      try {
            System.out.println(DBUtils.makeConnection());

       } catch (Exception e) {

        }
}
    
}
