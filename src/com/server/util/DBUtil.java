package com.server.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBUtil {
	public  Connection getConnection(){
		Connection conn = null;
		try{
			Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
			conn=DriverManager.getConnection("jdbc:mysql://39.106.19.250:3307/teasupport?autoReconnect=true&useSSL=false&serverTimezone=GMT","root","root");	
			return conn;
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return null;
	}
}
